// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging_timer_example.proto

package com.jbhunt.messaging.proto;

public final class MessagingTimerExample {
  private MessagingTimerExample() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jbhunt_Timer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jbhunt_Timer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035messaging_timer_example.proto\022\006jbhunt\032" +
      "\037google/protobuf/timestamp.proto\"\257\001\n\005Tim" +
      "er\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\005\022-\n\013statu" +
      "s_type\030\003 \001(\0162\030.jbhunt.Timer.StatusType\0222" +
      "\n\016timer_datetime\030\004 \001(\0132\032.google.protobuf" +
      ".Timestamp\"&\n\nStatusType\022\n\n\006Active\020\000\022\014\n\010" +
      "Inactive\020\001B\036\n\032com.jbhunt.messaging.proto" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_jbhunt_Timer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_jbhunt_Timer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jbhunt_Timer_descriptor,
        new java.lang.String[] { "Name", "Value", "StatusType", "TimerDatetime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
