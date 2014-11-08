package com.external.common.mini_flags;

import java.math.BigDecimal;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

class Parsers {
    public static Map<Class, Parser> all() {
        Map<Class, Parser> all = newHashMap();

        all.put(String.class, new Parser<String>() {
            @Override
            public String parse(String stringValue) throws IllegalAccessException {
                return stringValue;
            }
        });

        all.put(int.class, new Parser<Integer>() {
            @Override
            public Integer parse(String stringValue) throws IllegalAccessException {
                return Integer.parseInt(stringValue);
            }
        });

        all.put(Integer.class, new Parser<Integer>() {
            @Override
            public Integer parse(String stringValue) throws IllegalAccessException {
                return new Integer(stringValue);
            }
        });

        all.put(double.class, new Parser<Double>() {
            @Override
            public Double parse(String stringValue) throws IllegalAccessException {
                return Double.parseDouble(stringValue);
            }
        });

        all.put(Double.class, new Parser<Double>() {
            @Override
            public Double parse(String stringValue) throws IllegalAccessException {
                return new Double(stringValue);
            }
        });

        all.put(BigDecimal.class, new Parser<BigDecimal>() {
            @Override
            public BigDecimal parse(String stringValue) throws IllegalAccessException {
                return new BigDecimal(stringValue);
            }
        });

        all.put(boolean.class, new Parser<Boolean>() {
            @Override
            public Boolean parse(String stringValue) throws IllegalAccessException {
                if ("yes".equals(stringValue.toLowerCase())) return Boolean.TRUE;
                if ("no".equals(stringValue.toLowerCase())) return Boolean.FALSE;
                return new Boolean(stringValue);
            }
        });

        all.put(Boolean.class, new Parser<Boolean>() {
            @Override
            public Boolean parse(String stringValue) throws IllegalAccessException {
                return new Boolean(stringValue);
            }
        });

        return all;
    }
}
