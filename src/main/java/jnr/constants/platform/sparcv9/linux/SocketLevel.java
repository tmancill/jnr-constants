// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-05-18 11:46:30 -0700
package jnr.constants.platform.sparcv9.linux;
public enum SocketLevel implements jnr.constants.Constant {
SOL_SOCKET(65535L);
// SOL_IP not defined
// SOL_TCP not defined
// SOL_UDP not defined
private final long value;
private SocketLevel(long value) { this.value = value; }
public static final long MIN_VALUE = 65535L;
public static final long MAX_VALUE = 65535L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
