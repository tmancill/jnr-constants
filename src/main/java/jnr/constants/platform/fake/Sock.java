// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-10 15:24:02 -0500
package jnr.constants.platform.fake;
public enum Sock implements jnr.constants.Constant {
SOCK_STREAM(1),
SOCK_DGRAM(2),
SOCK_RAW(3),
SOCK_RDM(4),
SOCK_SEQPACKET(5),
SOCK_MAXADDRLEN(6);
private final long value;
private Sock(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 6L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
