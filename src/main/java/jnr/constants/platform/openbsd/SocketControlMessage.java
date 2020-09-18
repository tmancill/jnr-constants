// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-19 02:58:08 +0200
package jnr.constants.platform.openbsd;
public enum SocketControlMessage implements jnr.constants.Constant {
SCM_RIGHTS(1L),
SCM_TIMESTAMP(4L);
// SCM_TIMESTAMPNS not defined
// SCM_TIMESTAMPING not defined
// SCM_BINTIME not defined
// SCM_CREDENTIALS not defined
// SCM_CREDS not defined
// SCM_UCRED not defined
// SCM_WIFI_STATUS not defined
private final long value;
private SocketControlMessage(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 4L;

static final class StringTable {
  public static final java.util.Map<SocketControlMessage, String> descriptions = generateTable();
  public static final java.util.Map<SocketControlMessage, String> generateTable() {
    java.util.Map<SocketControlMessage, String> map = new java.util.EnumMap<SocketControlMessage, String>(SocketControlMessage.class);
  map.put(SCM_RIGHTS, "SCM_RIGHTS");
  map.put(SCM_TIMESTAMP, "SCM_TIMESTAMP");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
