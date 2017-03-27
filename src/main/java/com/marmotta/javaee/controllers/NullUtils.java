package com.marmotta.javaee.controllers;

/**
 * Created by marmotta on 25.03.2017.
 */
public class NullUtils {

    public static boolean b(Boolean b) {
        System.out.println("NullUtils");
        if (b == null) return false;
        return b;
    }



}
