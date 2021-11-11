package com.blp.generics;

public class FindMaximum {

    public static int getMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0 && b.compareTo(max) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        System.out.println(max);
        return max;
    }
}
