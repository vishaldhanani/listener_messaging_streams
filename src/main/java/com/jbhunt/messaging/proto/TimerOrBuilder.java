// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging_timer_example.proto

package com.jbhunt.messaging.proto;

public interface TimerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:jbhunt.Timer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 value = 2;</code>
   * @return The value.
   */
  int getValue();

  /**
   * <code>.jbhunt.Timer.StatusType status_type = 3;</code>
   * @return The enum numeric value on the wire for statusType.
   */
  int getStatusTypeValue();
  /**
   * <code>.jbhunt.Timer.StatusType status_type = 3;</code>
   * @return The statusType.
   */
  com.jbhunt.messaging.proto.Timer.StatusType getStatusType();

  /**
   * <code>.google.protobuf.Timestamp timer_datetime = 4;</code>
   * @return Whether the timerDatetime field is set.
   */
  boolean hasTimerDatetime();
  /**
   * <code>.google.protobuf.Timestamp timer_datetime = 4;</code>
   * @return The timerDatetime.
   */
  com.google.protobuf.Timestamp getTimerDatetime();
  /**
   * <code>.google.protobuf.Timestamp timer_datetime = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimerDatetimeOrBuilder();
}