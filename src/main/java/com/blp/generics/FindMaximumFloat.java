package com.blp.generics;

public class FindMaximumFloat {

    public static Float getMaximumFloat(Float af, Float bf, Float cf){
        Float max = af;
        if (bf.compareTo(max) > 0 && bf.compareTo(max) > 0)
            max = bf;
        else if (cf.compareTo(max) > 0)
            max = cf;
        System.out.println(max);
        return max;
    }
}
