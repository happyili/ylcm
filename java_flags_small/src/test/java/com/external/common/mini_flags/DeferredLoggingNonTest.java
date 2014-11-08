package com.external.common.mini_flags;

import com.external.common.mini_flags.Flags;

public class DeferredLoggingNonTest {
    public static void main(String[] args) {
        System.out.println("no logging yet");
        Flags flags = Flags.withDeferredLogging("com.ajitgeorge.flags.sample");
        flags.parse("--string=value", "src/test/test.properties");
        System.out.println("out comes the evil");
        flags.undeferLogging();
    }
}
