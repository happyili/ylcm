package com.external.common.mini_flags;

interface Parser<T> {
    T parse(String stringValue) throws IllegalAccessException;
}

