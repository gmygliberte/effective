package com.gmy.a4.b24;

/**
 * @author gmy
 * @date 2023/6/10 14:49
 */
public class MyStaticClass {
    private int a;
    int b;
    private static int sa;
    static int sb;

    static class Static {
        private int c;
        int d;
        private static int sc;
        static int sd;

        void getA() {
            System.out.println();
            print1();
        }

        private static void getSC() {
            System.out.println();
            print1();
        }
    }

    void print() {
        System.out.println(a);
        System.out.println();
    }

    static void print1() {
        System.out.println(sa);
        Static.getSC();
    }
}
