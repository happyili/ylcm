package com.ylcmn.datetime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeTracker {
    private final static Logger logger = LoggerFactory.getLogger(TimeTracker.class);

    private long startTime = 0;
    private long startTimeMillis = 0;

    public TimeTracker() {
        start();
    }

    // Start the timer (or restart if already started).
    public void start() {
        this.startTime = System.nanoTime();
        this.startTimeMillis = System.currentTimeMillis();
    }

    public double getElapsedSeconds() {
        return getElapsedMillis() / 1000.0;
    }

    public long getElapsedNanos() {
        return System.nanoTime() - this.startTime;
    }

    public long getElapsedMillis() {
        return System.currentTimeMillis() - this.startTimeMillis;
    }

    // print time spent and restart.
    public double checkpoint(String tag) {
        double time = this.getElapsedSeconds();
        logger.warn(tag + " time spent: " + time);
        start();
        return time;
    }
}
