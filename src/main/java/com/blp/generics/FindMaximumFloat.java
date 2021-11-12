package com.blp.generics;

public class FindMaximumFloat {

    public static Float getMaximumFloat(Float a, Float b, Float c){
        Float max = a;
        if (b.compareTo(max) > 0 && b.compareTo(max) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        System.out.println(max);
        return max;
    }
}
