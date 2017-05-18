// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-05-18 11:46:30 -0700
package jnr.constants.platform.sparcv9.linux;
public enum ProtocolFamily implements jnr.constants.Constant {
PF_UNSPEC(0L),
PF_LOCAL(1L),
PF_UNIX(1L),
PF_INET(2L),
// PF_IMPLINK not defined
// PF_PUP not defined
// PF_CHAOS not defined
// PF_NS not defined
// PF_ISO not defined
// PF_OSI not defined
// PF_ECMA not defined
// PF_DATAKIT not defined
// PF_CCITT not defined
PF_SNA(22L),
PF_DECnet(12L),
// PF_DLI not defined
// PF_LAT not defined
// PF_HYLINK not defined
PF_APPLETALK(5L),
PF_ROUTE(16L),
// PF_LINK not defined
// PF_XTP not defined
// PF_COIP not defined
// PF_CNT not defined
// PF_SIP not defined
PF_IPX(4L),
// PF_RTIP not defined
// PF_PIP not defined
// PF_NDRV not defined
PF_ISDN(34L),
PF_KEY(15L),
PF_INET6(10L),
// PF_NATM not defined
// PF_SYSTEM not defined
// PF_NETBIOS not defined
// PF_PPP not defined
// PF_ATM not defined
// PF_NETGRAPH not defined
PF_MAX(37L);
private final long value;
private ProtocolFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 37L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
