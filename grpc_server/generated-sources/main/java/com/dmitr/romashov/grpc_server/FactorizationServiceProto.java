// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package com.dmitr.romashov.grpc_server;

public final class FactorizationServiceProto {
  private FactorizationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ngrpc.proto\"\034\n\013InfoRequest\022\r\n\005value\030\001 \001" +
      "(\005\"#\n\014InfoResponse\022\023\n\013multipliers\030\001 \003(\0052" +
      "G\n\024FactorizationService\022/\n\016getMultiplier" +
      "s\022\014.InfoRequest\032\r.InfoResponse\"\000B=\n\036com." +
      "dmitr.romashov.grpc_serverB\031Factorizatio" +
      "nServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_InfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InfoRequest_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_InfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_InfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InfoResponse_descriptor,
        new java.lang.String[] { "Multipliers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
