package com.ylcmn.base;

import java.util.Comparator;

public class Comparators {
    public static final Comparator<Comparable> COMMON_COMPARATOR = new Comparator<Comparable>() {
        @Override
        public int compare(Comparable arg0, Comparable arg1) {
            if (arg0 == null) {
                if (arg1 == null) {
                    return 0;
                }
                return - arg1.compareTo(arg0);
            }
            return arg0.compareTo(arg1);
        }
    };
}
