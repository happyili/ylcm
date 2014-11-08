package com.external.common.mini_flags.sample;

import com.external.common.mini_flags.Flag;

import java.math.BigDecimal;

public class Argv {

    @Flag("string")
    public static String stringFlag = "default";

    @Flag("unsetString")
    public static String unsetStringFlag = "default";

    @Flag("undefaultedString")
    public static String undefaultedStringFlag;

    @Flag("int")
    public static int intFlag;

    @Flag("unsetInt")
    public static int unsetIntFlag;

    @Flag("integer")
    public static Integer integerFlag;

    @Flag("unsetInteger")
    public static Integer unsetIntegerFlag;

    @Flag("double")
    public static double doubleFlag;

    @Flag("unsetDouble")
    public static double unsetDoubleFlag;

    @Flag("doubleClass")
    public static Double doubleClassFlag;

    @Flag("unsetDoubleClass")
    public static Double unsetDoubleClassFlag;

    @Flag("bigdecimal")
    public static BigDecimal bigDecimalFlag;

    @Flag("unsetbigdecimal")
    public static BigDecimal unsetBigDecimalFlag;

    @Flag("true")
    public static boolean trueFlag;

    @Flag("mixedCaseTrue")
    public static boolean mixedCaseTrueFlag;

    @Flag("false")
    public static boolean falseFlag = true;

    @Flag("mixedCaseFalse")
    public static boolean mixedCaseFalseFlag = true;

    @Flag("unsetBoolean")
    public static boolean unsetBooleanFlag;

    @Flag("booleanClass")
    public static Boolean booleanClassFlag;

    @Flag("unsetBooleanClass")
    public static Boolean unsetBooleanClassFlag;

    @Flag("yes")
    public static boolean yesFlag;

    @Flag("no")
    public static boolean noFlag = true;
}
