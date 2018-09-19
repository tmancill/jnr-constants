// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-12 11:05:14 +0200
package jnr.constants.platform.linux;
public enum TCP implements jnr.constants.Constant {
TCP_MSS(512L),
// TCP_MAX_SACK not defined
// TCP_MINMSS not defined
// TCP_MINMSSOVERLOAD not defined
TCP_MAXWIN(65535L),
TCP_MAX_WINSHIFT(14L),
// TCP_MAXBURST not defined
// TCP_MAXHLEN not defined
// TCP_MAXOLEN not defined
TCP_NODELAY(1L),
TCP_MAXSEG(2L);
// TCP_NOPUSH not defined
// TCP_NOOPT not defined
// TCP_KEEPALIVE not defined
// TCP_NSTATES not defined
// TCP_RETRANSHZ not defined
private final long value;
private TCP(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 65535L;

static final class StringTable {
  public static final java.util.Map<TCP, String> descriptions = generateTable();
  public static final java.util.Map<TCP, String> generateTable() {
    java.util.Map<TCP, String> map = new java.util.EnumMap<TCP, String>(TCP.class);
  map.put(TCP_MSS, "TCP_MSS");
  map.put(TCP_MAXWIN, "TCP_MAXWIN");
  map.put(TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
  map.put(TCP_NODELAY, "TCP_NODELAY");
  map.put(TCP_MAXSEG, "TCP_MAXSEG");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
