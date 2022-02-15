package com.anup.github.dsa;

/**
Count set bits in an integer
 **/
public class CountSetBits {

    public static void main(String[] args) {

        int n = 7;

        System.out.println("Set bits in " + n + " is " + method1(n));
        System.out.println("Set bits in " + n + " is " + method2(n));


    }

    private static int method1(int n) {
        int count = 0;

        while( n > 0 ) {
            count = count + (n&1);
            n = n >> 1;
        }

        return count;
    }

    private static int method2(int n)
    {
        int count = 0;
        while(n > 0) {

            n = n & (n-1);
            count++;

        }
        return count;
    }
}
