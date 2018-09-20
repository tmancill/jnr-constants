// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 19:13:09 +0200
package jnr.constants.platform.solaris;
public enum Sock implements jnr.constants.Constant {
SOCK_STREAM(2L),
SOCK_DGRAM(1L),
SOCK_RAW(4L),
SOCK_RDM(5L),
SOCK_SEQPACKET(6L);
// SOCK_MAXADDRLEN not defined
private final long value;
private Sock(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 6L;

static final class StringTable {
  public static final java.util.Map<Sock, String> descriptions = generateTable();
  public static final java.util.Map<Sock, String> generateTable() {
    java.util.Map<Sock, String> map = new java.util.EnumMap<Sock, String>(Sock.class);
  map.put(SOCK_STREAM, "SOCK_STREAM");
  map.put(SOCK_DGRAM, "SOCK_DGRAM");
  map.put(SOCK_RAW, "SOCK_RAW");
  map.put(SOCK_RDM, "SOCK_RDM");
  map.put(SOCK_SEQPACKET, "SOCK_SEQPACKET");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
