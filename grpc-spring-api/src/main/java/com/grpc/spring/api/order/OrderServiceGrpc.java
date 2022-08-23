package com.grpc.spring.api.order;

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
 * <pre>
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: proto/OrderService.proto")
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "OrderService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetOrderInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.grpc.spring.api.order.GetOrderRequest,
      com.grpc.spring.api.order.GetOrderReply> METHOD_GET_ORDER_INFO = getGetOrderInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.grpc.spring.api.order.GetOrderRequest,
      com.grpc.spring.api.order.GetOrderReply> getGetOrderInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.grpc.spring.api.order.GetOrderRequest,
      com.grpc.spring.api.order.GetOrderReply> getGetOrderInfoMethod() {
    return getGetOrderInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.grpc.spring.api.order.GetOrderRequest,
      com.grpc.spring.api.order.GetOrderReply> getGetOrderInfoMethodHelper() {
    io.grpc.MethodDescriptor<com.grpc.spring.api.order.GetOrderRequest, com.grpc.spring.api.order.GetOrderReply> getGetOrderInfoMethod;
    if ((getGetOrderInfoMethod = OrderServiceGrpc.getGetOrderInfoMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderInfoMethod = OrderServiceGrpc.getGetOrderInfoMethod) == null) {
          OrderServiceGrpc.getGetOrderInfoMethod = getGetOrderInfoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.spring.api.order.GetOrderRequest, com.grpc.spring.api.order.GetOrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OrderService", "GetOrderInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.spring.api.order.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.spring.api.order.GetOrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrderInfo"))
                  .build();
          }
        }
     }
     return getGetOrderInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    return new OrderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The service method
     * </pre>
     */
    public void getOrderInfo(com.grpc.spring.api.order.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.grpc.spring.api.order.GetOrderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderInfoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOrderInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.spring.api.order.GetOrderRequest,
                com.grpc.spring.api.order.GetOrderReply>(
                  this, METHODID_GET_ORDER_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractStub<OrderServiceStub> {
    private OrderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * The service method
     * </pre>
     */
    public void getOrderInfo(com.grpc.spring.api.order.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.grpc.spring.api.order.GetOrderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * The service method
     * </pre>
     */
    public com.grpc.spring.api.order.GetOrderReply getOrderInfo(com.grpc.spring.api.order.GetOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderInfoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * The service method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.spring.api.order.GetOrderReply> getOrderInfo(
        com.grpc.spring.api.order.GetOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderInfoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDER_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ORDER_INFO:
          serviceImpl.getOrderInfo((com.grpc.spring.api.order.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.spring.api.order.GetOrderReply>) responseObserver);
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

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.spring.api.order.OrderServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getGetOrderInfoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
