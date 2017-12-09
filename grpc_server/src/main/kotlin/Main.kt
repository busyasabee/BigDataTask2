package com.dmitr.romashov.grpc_server

import io.grpc.*
import io.grpc.stub.StreamObserver
import java.util.concurrent.TimeUnit


class FactorizationService(): FactorizationServiceGrpc.FactorizationServiceImplBase() {

    override fun getMultipliers(request: InfoRequest, responseObserver: StreamObserver<InfoResponse>) {

        var multipliers:MutableList<Int> = mutableListOf()
        val n = request.value
        var cur = n
        var m = 2
        val maxM = Math.sqrt(n.toDouble()).toInt()
        while (m <= maxM || cur != 1){
            if (cur % m != 0){
                m += 1

            } else {
                cur = cur / m
                multipliers.add(m)
            }
        }

        val response = InfoResponse.newBuilder()
                .addAllMultipliers(multipliers)
                .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}

fun main(args: Array<String>) {
    val server = ServerBuilder
            .forPort(5757)
            .addService(FactorizationService())
            .build()
    server.start()

    println("Factorization grpc service started")

    server.awaitTermination()

    println("Factorization grpc service stopped")
}