import grpc

import grpc_pb2_grpc
import grpc_pb2
import os.path as osp
from queue import Queue
from threading import Thread
import threading

def writeSourceFile(path):
    if not osp.exists(path):
        file = open(path, 'w')
        for i in range(5000):
            if(i==4999):
                file.write(str(i+1))
                break
            file.write(str(i+1) + "\n")

        file.close()

def writeResultFile(path, results):
    file = open(path, 'w')
    for r in results:
        file.write(str(r[0]))
        multipliers = r[1]
        for mp in multipliers:
            file.write("\t" + str(mp))
        file.write("\n")
    file.close()


def readSourceFile(path):
    file = open(path,'r')
    valLines = file.readlines()
    values = []
    for line in valLines:
        values.append(int(line))

    return values

def sendMessage(queue, stub, lock, arr):
    while True:
        val = queue.get()
        request = grpc_pb2.InfoRequest(value=val)
        response = stub.getMultipliers(request)
        lock.acquire()
        arr.append((val,response.multipliers))
        lock.release()
        queue.task_done()

if __name__ == '__main__':
    sourcePath = "values.txt"
    writeSourceFile(sourcePath)
    values = readSourceFile(sourcePath)
    channel = grpc.insecure_channel('localhost:5757')
    stub = grpc_pb2_grpc.FactorizationServiceStub(channel)

    q = Queue()
    num_worker_threads = 5
    results = []
    lock = threading.Lock()
    for i in range(num_worker_threads):
        t = Thread(target=sendMessage, args=(q,stub,lock,results))
        t.setDaemon(True)
        t.start()
    for value in values:
        q.put(value)

    q.join()

    print(results)
    outPath = "results.txt"
    writeResultFile(outPath, results)



