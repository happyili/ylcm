package com.external.common.mini_flags.sample;

import com.external.common.mini_flags.Flag;

public class Both {
    @Flag("fromargv")
    public static String fromArgvFlag;

    @Flag("fromproperties")
    public static String fromPropertiesFlag;

    @Flag("fromfile")
    public static String fromFileFlag;

    @Flag("overridden")
    public static String overriddenFlag;
}
