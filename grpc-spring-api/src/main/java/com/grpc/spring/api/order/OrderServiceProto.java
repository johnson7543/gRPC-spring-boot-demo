// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/OrderService.proto

package com.grpc.spring.api.order;

public final class OrderServiceProto {
  private OrderServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetOrderReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetOrderReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030proto/OrderService.proto\"\"\n\017GetOrderRe" +
      "quest\022\017\n\007orderNo\030\001 \001(\t\"R\n\rGetOrderReply\022" +
      "\017\n\007orderNo\030\001 \001(\t\022\020\n\010userName\030\002 \001(\t\022\017\n\007ad" +
      "dress\030\003 \001(\t\022\r\n\005price\030\004 \001(\0032B\n\014OrderServi" +
      "ce\0222\n\014GetOrderInfo\022\020.GetOrderRequest\032\016.G" +
      "etOrderReply\"\000B0\n\031com.grpc.spring.api.or" +
      "derB\021OrderServiceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetOrderRequest_descriptor,
        new java.lang.String[] { "OrderNo", });
    internal_static_GetOrderReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetOrderReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetOrderReply_descriptor,
        new java.lang.String[] { "OrderNo", "UserName", "Address", "Price", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
