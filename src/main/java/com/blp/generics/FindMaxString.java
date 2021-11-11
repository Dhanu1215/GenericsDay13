package com.blp.generics;

public class FindMaxString {

    public static String getMaximumString(String a,String b,String c){
        String max = a;
        if (b.compareTo(max) > 0 && b.compareTo(max) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        System.out.println(max);
        return max;
    }
}
