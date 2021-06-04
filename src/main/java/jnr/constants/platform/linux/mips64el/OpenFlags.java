// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-06-03 00:56:21 +0000
package jnr.constants.platform.linux.mips64el;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0L),
O_WRONLY(1L),
O_RDWR(2L),
O_ACCMODE(3L),
O_NONBLOCK(128L),
O_APPEND(8L),
O_SYNC(16400L),
// O_SHLOCK not defined
// O_EXLOCK not defined
O_ASYNC(4096L),
O_FSYNC(16400L),
O_NOFOLLOW(131072L),
O_CREAT(256L),
O_TRUNC(512L),
O_EXCL(1024L),
// O_EVTONLY not defined
O_DIRECTORY(65536L),
// O_SYMLINK not defined
// O_BINARY not defined
O_NOCTTY(2048L),
O_TMPFILE(4259840L),
O_CLOEXEC(524288L);
private final long value;
private OpenFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 4259840L;

static final class StringTable {
  public static final java.util.Map<OpenFlags, String> descriptions = generateTable();
  public static final java.util.Map<OpenFlags, String> generateTable() {
    java.util.Map<OpenFlags, String> map = new java.util.EnumMap<OpenFlags, String>(OpenFlags.class);
  map.put(O_RDONLY, "O_RDONLY");
  map.put(O_WRONLY, "O_WRONLY");
  map.put(O_RDWR, "O_RDWR");
  map.put(O_ACCMODE, "O_ACCMODE");
  map.put(O_NONBLOCK, "O_NONBLOCK");
  map.put(O_APPEND, "O_APPEND");
  map.put(O_SYNC, "O_SYNC");
  map.put(O_ASYNC, "O_ASYNC");
  map.put(O_FSYNC, "O_FSYNC");
  map.put(O_NOFOLLOW, "O_NOFOLLOW");
  map.put(O_CREAT, "O_CREAT");
  map.put(O_TRUNC, "O_TRUNC");
  map.put(O_EXCL, "O_EXCL");
  map.put(O_DIRECTORY, "O_DIRECTORY");
  map.put(O_NOCTTY, "O_NOCTTY");
  map.put(O_TMPFILE, "O_TMPFILE");
  map.put(O_CLOEXEC, "O_CLOEXEC");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
