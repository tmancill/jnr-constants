// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-06-03 02:37:29 +0000
package jnr.constants.platform.linux.aarch64;
public enum LangInfo implements jnr.constants.Constant {
CODESET(14L),
D_T_FMT(131112L),
D_FMT(131113L),
T_FMT(131114L),
DAY_1(131079L),
DAY_2(131080L),
DAY_3(131081L),
DAY_4(131082L),
DAY_5(131083L),
DAY_6(131084L),
DAY_7(131085L),
ABDAY_1(131072L),
ABDAY_2(131073L),
ABDAY_3(131074L),
ABDAY_4(131075L),
ABDAY_5(131076L),
ABDAY_6(131077L),
ABDAY_7(131078L),
MON_1(131098L),
MON_2(131099L),
MON_3(131100L),
MON_4(131101L),
MON_5(131102L),
MON_6(131103L),
MON_7(131104L),
MON_8(131105L),
MON_9(131106L),
MON_10(131107L),
MON_11(131108L),
MON_12(131109L),
ABMON_1(131086L),
ABMON_2(131087L),
ABMON_3(131088L),
ABMON_4(131089L),
ABMON_5(131090L),
ABMON_6(131091L),
ABMON_7(131092L),
ABMON_8(131093L),
ABMON_9(131094L),
ABMON_10(131095L),
ABMON_11(131096L),
ABMON_12(131097L),
RADIXCHAR(65536L),
THOUSEP(65537L),
YESEXPR(327680L),
NOEXPR(327681L),
CRNCYSTR(262159L);
private final long value;
private LangInfo(long value) { this.value = value; }
public static final long MIN_VALUE = 14L;
public static final long MAX_VALUE = 327681L;

static final class StringTable {
  public static final java.util.Map<LangInfo, String> descriptions = generateTable();
  public static final java.util.Map<LangInfo, String> generateTable() {
    java.util.Map<LangInfo, String> map = new java.util.EnumMap<LangInfo, String>(LangInfo.class);
  map.put(CODESET, "CODESET");
  map.put(D_T_FMT, "D_T_FMT");
  map.put(D_FMT, "D_FMT");
  map.put(T_FMT, "T_FMT");
  map.put(DAY_1, "DAY_1");
  map.put(DAY_2, "DAY_2");
  map.put(DAY_3, "DAY_3");
  map.put(DAY_4, "DAY_4");
  map.put(DAY_5, "DAY_5");
  map.put(DAY_6, "DAY_6");
  map.put(DAY_7, "DAY_7");
  map.put(ABDAY_1, "ABDAY_1");
  map.put(ABDAY_2, "ABDAY_2");
  map.put(ABDAY_3, "ABDAY_3");
  map.put(ABDAY_4, "ABDAY_4");
  map.put(ABDAY_5, "ABDAY_5");
  map.put(ABDAY_6, "ABDAY_6");
  map.put(ABDAY_7, "ABDAY_7");
  map.put(MON_1, "MON_1");
  map.put(MON_2, "MON_2");
  map.put(MON_3, "MON_3");
  map.put(MON_4, "MON_4");
  map.put(MON_5, "MON_5");
  map.put(MON_6, "MON_6");
  map.put(MON_7, "MON_7");
  map.put(MON_8, "MON_8");
  map.put(MON_9, "MON_9");
  map.put(MON_10, "MON_10");
  map.put(MON_11, "MON_11");
  map.put(MON_12, "MON_12");
  map.put(ABMON_1, "ABMON_1");
  map.put(ABMON_2, "ABMON_2");
  map.put(ABMON_3, "ABMON_3");
  map.put(ABMON_4, "ABMON_4");
  map.put(ABMON_5, "ABMON_5");
  map.put(ABMON_6, "ABMON_6");
  map.put(ABMON_7, "ABMON_7");
  map.put(ABMON_8, "ABMON_8");
  map.put(ABMON_9, "ABMON_9");
  map.put(ABMON_10, "ABMON_10");
  map.put(ABMON_11, "ABMON_11");
  map.put(ABMON_12, "ABMON_12");
  map.put(RADIXCHAR, "RADIXCHAR");
  map.put(THOUSEP, "THOUSEP");
  map.put(YESEXPR, "YESEXPR");
  map.put(NOEXPR, "NOEXPR");
  map.put(CRNCYSTR, "CRNCYSTR");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
