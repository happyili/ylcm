package com.ylcmn.base;

import java.util.Comparator;

public class Comparators {
    /*
    public class MyComparator<T extends Comparable> implements Comparator<T> {
        @Override
        public int compare(T arg0, T arg1) {
            if (arg0 == null) {
                if (arg1 == null) {
                    return 0;
                }
                return - arg1.compareTo(arg0);
            }
            return arg0.compareTo(arg1);
        }
    };
    */

    public static final Comparator<Double> DOUBLE_COMPARATOR = new Comparator<Double>() {
        @Override
        public int compare(Double arg0, Double arg1) {
            if (arg0 == arg1) {
                return 1;
            }
            if (arg0 == null) {
                return - arg1.compareTo(arg0);
            }
            return Double.compare(arg0,  arg1);
        }
    };

    public static final Comparator<Integer> INTEGER_COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer arg0, Integer arg1) {
            if (arg0 == arg1) {
                return 1;
            }
            if (arg0 == null) {
                return - arg1.compareTo(arg0);
            }
            return arg0.compareTo(arg1);
        }
    };

    public static final Comparator<String> STRING_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String arg0, String arg1) {
            if (arg0 == arg1) {
                return 1;
            }
            if (arg0 == null) {
                return - arg1.compareTo(arg0);
            }
            return arg0.compareTo(arg1);
        }
    };
}
