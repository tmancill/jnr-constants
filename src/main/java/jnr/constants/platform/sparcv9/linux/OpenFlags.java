// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-05-18 11:46:30 -0700
package jnr.constants.platform.sparcv9.linux;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0L),
O_WRONLY(1L),
O_RDWR(2L),
O_ACCMODE(3L),
O_NONBLOCK(16384L),
O_APPEND(8L),
O_SYNC(8396800L),
// O_SHLOCK not defined
// O_EXLOCK not defined
O_ASYNC(64L),
// O_FSYNC not defined
O_NOFOLLOW(131072L),
O_CREAT(512L),
O_TRUNC(1024L),
O_EXCL(2048L),
// O_EVTONLY not defined
O_DIRECTORY(65536L),
// O_SYMLINK not defined
// O_BINARY not defined
O_NOCTTY(32768L),
// O_TMPFILE not defined
O_CLOEXEC(4194304L);
private final long value;
private OpenFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 8396800L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
