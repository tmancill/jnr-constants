// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-10-13 00:20:58 +0200
package jnr.constants.platform.fake;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(1),
SO_ACCEPTCONN(2),
SO_REUSEADDR(3),
SO_KEEPALIVE(4),
SO_DONTROUTE(5),
SO_BROADCAST(6),
SO_USELOOPBACK(7),
SO_LINGER(8),
SO_OOBINLINE(9),
SO_REUSEPORT(10),
SO_TIMESTAMP(11),
SO_ACCEPTFILTER(12),
SO_DONTTRUNC(13),
SO_WANTMORE(14),
SO_WANTOOBFLAG(15),
SO_SNDBUF(16),
SO_RCVBUF(17),
SO_SNDLOWAT(18),
SO_RCVLOWAT(19),
SO_SNDTIMEO(20),
SO_RCVTIMEO(21),
SO_ERROR(22),
SO_TYPE(23),
SO_NREAD(24),
SO_NKE(25),
SO_NOSIGPIPE(26),
SO_NOADDRERR(27),
SO_NWRITE(28),
SO_REUSESHAREUID(29),
SO_LABEL(30),
SO_PEERLABEL(31),
SO_ATTACH_FILTER(32),
SO_BINDTODEVICE(33),
SO_DETACH_FILTER(34),
SO_NO_CHECK(35),
SO_PASSCRED(36),
SO_PEERCRED(37),
SO_PEERNAME(38),
SO_PRIORITY(39),
SO_SNDBUFFORCE(40),
SO_RCVBUFFORCE(41),
SO_GET_FILTER(42),
SO_TIMESTAMPNS(43),
SO_RECVUCRED(44),
SO_MAC_EXEMPT(45),
SO_ALLZONES(46),
SO_PEERSEC(47),
SO_PASSSEC(48),
SO_MARK(49),
SO_TIMESTAMPING(50),
SO_PROTOCOL(51),
SO_DOMAIN(52),
SO_RXQ_OVFL(53),
SO_WIFI_STATUS(54),
SO_PEEK_OFF(55),
SO_NOFCS(56),
SO_LOCK_FILTER(57),
SO_SELECT_ERR_QUEUE(58),
SO_BUSY_POLL(59),
SO_MAX_PACING_RATE(60),
SO_BPF_EXTENSIONS(61),
SO_SECURITY_AUTHENTICATION(62),
SO_SECURITY_ENCRYPTION_NETWORK(63),
SO_SECURITY_ENCRYPTION_TRANSPORT(64);
private final long value;
private SocketOption(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 64L;
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
