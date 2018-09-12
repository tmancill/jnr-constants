// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 20:18:36 -0500
package jnr.constants.platform.darwin;
public enum AddressFamily implements jnr.constants.Constant {
AF_UNSPEC(0L),
AF_LOCAL(1L),
AF_UNIX(1L),
AF_INET(2L),
AF_IMPLINK(3L),
AF_PUP(4L),
AF_CHAOS(5L),
AF_NS(6L),
AF_ISO(7L),
AF_OSI(7L),
AF_ECMA(8L),
AF_DATAKIT(9L),
AF_CCITT(10L),
AF_SNA(11L),
AF_DECnet(12L),
AF_DLI(13L),
AF_LAT(14L),
AF_HYLINK(15L),
AF_APPLETALK(16L),
AF_ROUTE(17L),
AF_LINK(18L),
pseudo_AF_XTP(19L),
AF_COIP(20L),
AF_CNT(21L),
pseudo_AF_RTIP(22L),
AF_IPX(23L),
AF_SIP(24L),
pseudo_AF_PIP(25L),
AF_NDRV(27L),
AF_ISDN(28L),
AF_E164(28L),
pseudo_AF_KEY(29L),
AF_INET6(30L),
AF_NATM(31L),
AF_SYSTEM(32L),
AF_NETBIOS(33L),
AF_PPP(34L),
// AF_ATM not defined
pseudo_AF_HDRCMPLT(35L),
// AF_NETGRAPH not defined
// AF_AX25 not defined
AF_MAX(40L);
private final long value;
private AddressFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 40L;

static final class StringTable {
  public static final java.util.Map<AddressFamily, String> descriptions = generateTable();
  public static final java.util.Map<AddressFamily, String> generateTable() {
    java.util.Map<AddressFamily, String> map = new java.util.EnumMap<AddressFamily, String>(AddressFamily.class);
  map.put(AF_UNSPEC, "AF_UNSPEC");
  map.put(AF_LOCAL, "AF_LOCAL");
  map.put(AF_UNIX, "AF_UNIX");
  map.put(AF_INET, "AF_INET");
  map.put(AF_IMPLINK, "AF_IMPLINK");
  map.put(AF_PUP, "AF_PUP");
  map.put(AF_CHAOS, "AF_CHAOS");
  map.put(AF_NS, "AF_NS");
  map.put(AF_ISO, "AF_ISO");
  map.put(AF_OSI, "AF_OSI");
  map.put(AF_ECMA, "AF_ECMA");
  map.put(AF_DATAKIT, "AF_DATAKIT");
  map.put(AF_CCITT, "AF_CCITT");
  map.put(AF_SNA, "AF_SNA");
  map.put(AF_DECnet, "AF_DECnet");
  map.put(AF_DLI, "AF_DLI");
  map.put(AF_LAT, "AF_LAT");
  map.put(AF_HYLINK, "AF_HYLINK");
  map.put(AF_APPLETALK, "AF_APPLETALK");
  map.put(AF_ROUTE, "AF_ROUTE");
  map.put(AF_LINK, "AF_LINK");
  map.put(pseudo_AF_XTP, "pseudo_AF_XTP");
  map.put(AF_COIP, "AF_COIP");
  map.put(AF_CNT, "AF_CNT");
  map.put(pseudo_AF_RTIP, "pseudo_AF_RTIP");
  map.put(AF_IPX, "AF_IPX");
  map.put(AF_SIP, "AF_SIP");
  map.put(pseudo_AF_PIP, "pseudo_AF_PIP");
  map.put(AF_NDRV, "AF_NDRV");
  map.put(AF_ISDN, "AF_ISDN");
  map.put(AF_E164, "AF_E164");
  map.put(pseudo_AF_KEY, "pseudo_AF_KEY");
  map.put(AF_INET6, "AF_INET6");
  map.put(AF_NATM, "AF_NATM");
  map.put(AF_SYSTEM, "AF_SYSTEM");
  map.put(AF_NETBIOS, "AF_NETBIOS");
  map.put(AF_PPP, "AF_PPP");
  map.put(pseudo_AF_HDRCMPLT, "pseudo_AF_HDRCMPLT");
  map.put(AF_MAX, "AF_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
