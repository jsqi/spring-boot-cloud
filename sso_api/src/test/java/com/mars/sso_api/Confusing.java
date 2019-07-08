package com.mars.sso_api;

public class Confusing {

    public Confusing(Object o) {
        System.out.println("Object");
    }
    public Confusing(int dArray) {
        System.out.println("double array");
    }

    public static void main(String args[]) {
        new Confusing(null);
    }

}
