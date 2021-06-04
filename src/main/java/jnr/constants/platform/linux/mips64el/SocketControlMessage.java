// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-06-03 00:56:23 +0000
package jnr.constants.platform.linux.mips64el;
public enum SocketControlMessage implements jnr.constants.Constant {
SCM_RIGHTS(1L),
SCM_TIMESTAMP(29L),
SCM_TIMESTAMPNS(35L),
SCM_TIMESTAMPING(37L),
// SCM_BINTIME not defined
SCM_CREDENTIALS(2L),
// SCM_CREDS not defined
// SCM_UCRED not defined
SCM_WIFI_STATUS(41L);
private final long value;
private SocketControlMessage(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 41L;

static final class StringTable {
  public static final java.util.Map<SocketControlMessage, String> descriptions = generateTable();
  public static final java.util.Map<SocketControlMessage, String> generateTable() {
    java.util.Map<SocketControlMessage, String> map = new java.util.EnumMap<SocketControlMessage, String>(SocketControlMessage.class);
  map.put(SCM_RIGHTS, "SCM_RIGHTS");
  map.put(SCM_TIMESTAMP, "SCM_TIMESTAMP");
  map.put(SCM_TIMESTAMPNS, "SCM_TIMESTAMPNS");
  map.put(SCM_TIMESTAMPING, "SCM_TIMESTAMPING");
  map.put(SCM_CREDENTIALS, "SCM_CREDENTIALS");
  map.put(SCM_WIFI_STATUS, "SCM_WIFI_STATUS");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
