package com.dmitr.romashov.grpc_server;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: grpc.proto")
public final class FactorizationServiceGrpc {

  private FactorizationServiceGrpc() {}

  public static final String SERVICE_NAME = "FactorizationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.dmitr.romashov.grpc_server.InfoRequest,
      com.dmitr.romashov.grpc_server.InfoResponse> METHOD_GET_MULTIPLIERS =
      io.grpc.MethodDescriptor.<com.dmitr.romashov.grpc_server.InfoRequest, com.dmitr.romashov.grpc_server.InfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "FactorizationService", "getMultipliers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dmitr.romashov.grpc_server.InfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dmitr.romashov.grpc_server.InfoResponse.getDefaultInstance()))
          .setSchemaDescriptor(new FactorizationServiceMethodDescriptorSupplier("getMultipliers"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FactorizationServiceStub newStub(io.grpc.Channel channel) {
    return new FactorizationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FactorizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FactorizationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FactorizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FactorizationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FactorizationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMultipliers(com.dmitr.romashov.grpc_server.InfoRequest request,
        io.grpc.stub.StreamObserver<com.dmitr.romashov.grpc_server.InfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MULTIPLIERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_MULTIPLIERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.dmitr.romashov.grpc_server.InfoRequest,
                com.dmitr.romashov.grpc_server.InfoResponse>(
                  this, METHODID_GET_MULTIPLIERS)))
          .build();
    }
  }

  /**
   */
  public static final class FactorizationServiceStub extends io.grpc.stub.AbstractStub<FactorizationServiceStub> {
    private FactorizationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FactorizationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorizationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FactorizationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMultipliers(com.dmitr.romashov.grpc_server.InfoRequest request,
        io.grpc.stub.StreamObserver<com.dmitr.romashov.grpc_server.InfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MULTIPLIERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FactorizationServiceBlockingStub extends io.grpc.stub.AbstractStub<FactorizationServiceBlockingStub> {
    private FactorizationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FactorizationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorizationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FactorizationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dmitr.romashov.grpc_server.InfoResponse getMultipliers(com.dmitr.romashov.grpc_server.InfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MULTIPLIERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FactorizationServiceFutureStub extends io.grpc.stub.AbstractStub<FactorizationServiceFutureStub> {
    private FactorizationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FactorizationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorizationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FactorizationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dmitr.romashov.grpc_server.InfoResponse> getMultipliers(
        com.dmitr.romashov.grpc_server.InfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MULTIPLIERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MULTIPLIERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FactorizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FactorizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MULTIPLIERS:
          serviceImpl.getMultipliers((com.dmitr.romashov.grpc_server.InfoRequest) request,
              (io.grpc.stub.StreamObserver<com.dmitr.romashov.grpc_server.InfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FactorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FactorizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dmitr.romashov.grpc_server.FactorizationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FactorizationService");
    }
  }

  private static final class FactorizationServiceFileDescriptorSupplier
      extends FactorizationServiceBaseDescriptorSupplier {
    FactorizationServiceFileDescriptorSupplier() {}
  }

  private static final class FactorizationServiceMethodDescriptorSupplier
      extends FactorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FactorizationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FactorizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FactorizationServiceFileDescriptorSupplier())
              .addMethod(METHOD_GET_MULTIPLIERS)
              .build();
        }
      }
    }
    return result;
  }
}
