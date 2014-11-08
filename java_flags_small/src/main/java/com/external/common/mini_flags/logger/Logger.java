package com.external.common.mini_flags.logger;

public interface Logger {
    void debug(String fmt, Object ... params);
    void info(String fmt, Object ... params);

    void undeferLogging();
}
