package com.ylcmn.base;

import java.util.Comparator;

public class Pair<TFirst, TSecond> {
    private final TFirst first;
    private final TSecond second;

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public Pair(TFirst first, TSecond second) {
        this.first = first;
        this.second = second;
    }

    public TFirst getFirst() {
        return first;
    }

    public TSecond getSecond() {
        return second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<T1, T2>(first, second);
    }

    public static <T1, T2> Comparator<Pair<T1, T2>> getFirstComparator(
            final boolean accending, final Comparator<T1> comp) {
        return new Comparator<Pair<T1, T2>>() {
            @Override
            public int compare(Pair<T1, T2> o1, Pair<T1, T2> o2) {
                return (accending ? 1 : -1) * comp.compare(o1.getFirst(), o2.getFirst());
            }
        };
    }

    public static <T1, T2> Comparator<Pair<T1, T2>> getSecondComparator(
            final boolean accending, final Comparator<T2> comp) {
        return new Comparator<Pair<T1, T2>>() {
            @Override
            public int compare(Pair<T1, T2> o1, Pair<T1, T2> o2) {
                return (accending ? 1 : -1) * comp.compare(o1.getSecond(), o2.getSecond());
            }
        };
    }

    @Override
    public String toString() {
        return first.toString() + ", " + second.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (! (obj instanceof Pair)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        Pair<TFirst, TSecond> target = (Pair<TFirst, TSecond>) obj;

        if (target.getFirst() == first && target.getSecond() == second) {
            return true;
        }

        return target.getFirst().equals(first) && target.getSecond().equals(second);
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) +
               (second == null ? 0 : second.hashCode());
    }
}
