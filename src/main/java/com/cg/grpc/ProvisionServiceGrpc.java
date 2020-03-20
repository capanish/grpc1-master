package com.cg.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: provision.proto")
public final class ProvisionServiceGrpc {

  private ProvisionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.cg.grpc.ProvisionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cg.grpc.request,
      com.cg.grpc.response> getCreationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "creation",
      requestType = com.cg.grpc.request.class,
      responseType = com.cg.grpc.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cg.grpc.request,
      com.cg.grpc.response> getCreationMethod() {
    io.grpc.MethodDescriptor<com.cg.grpc.request, com.cg.grpc.response> getCreationMethod;
    if ((getCreationMethod = ProvisionServiceGrpc.getCreationMethod) == null) {
      synchronized (ProvisionServiceGrpc.class) {
        if ((getCreationMethod = ProvisionServiceGrpc.getCreationMethod) == null) {
          ProvisionServiceGrpc.getCreationMethod = getCreationMethod = 
              io.grpc.MethodDescriptor.<com.cg.grpc.request, com.cg.grpc.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cg.grpc.ProvisionService", "creation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cg.grpc.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cg.grpc.response.getDefaultInstance()))
                  .setSchemaDescriptor(new ProvisionServiceMethodDescriptorSupplier("creation"))
                  .build();
          }
        }
     }
     return getCreationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProvisionServiceStub newStub(io.grpc.Channel channel) {
    return new ProvisionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProvisionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProvisionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProvisionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProvisionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProvisionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void creation(com.cg.grpc.request request,
        io.grpc.stub.StreamObserver<com.cg.grpc.response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cg.grpc.request,
                com.cg.grpc.response>(
                  this, METHODID_CREATION)))
          .build();
    }
  }

  /**
   */
  public static final class ProvisionServiceStub extends io.grpc.stub.AbstractStub<ProvisionServiceStub> {
    private ProvisionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProvisionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProvisionServiceStub(channel, callOptions);
    }

    /**
     */
    public void creation(com.cg.grpc.request request,
        io.grpc.stub.StreamObserver<com.cg.grpc.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProvisionServiceBlockingStub extends io.grpc.stub.AbstractStub<ProvisionServiceBlockingStub> {
    private ProvisionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProvisionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProvisionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cg.grpc.response creation(com.cg.grpc.request request) {
      return blockingUnaryCall(
          getChannel(), getCreationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProvisionServiceFutureStub extends io.grpc.stub.AbstractStub<ProvisionServiceFutureStub> {
    private ProvisionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProvisionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProvisionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cg.grpc.response> creation(
        com.cg.grpc.request request) {
      return futureUnaryCall(
          getChannel().newCall(getCreationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProvisionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProvisionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATION:
          serviceImpl.creation((com.cg.grpc.request) request,
              (io.grpc.stub.StreamObserver<com.cg.grpc.response>) responseObserver);
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

  private static abstract class ProvisionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProvisionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cg.grpc.Provision.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProvisionService");
    }
  }

  private static final class ProvisionServiceFileDescriptorSupplier
      extends ProvisionServiceBaseDescriptorSupplier {
    ProvisionServiceFileDescriptorSupplier() {}
  }

  private static final class ProvisionServiceMethodDescriptorSupplier
      extends ProvisionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProvisionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProvisionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProvisionServiceFileDescriptorSupplier())
              .addMethod(getCreationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
