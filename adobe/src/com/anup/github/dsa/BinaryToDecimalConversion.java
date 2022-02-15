package com.anup.github.dsa;

/**
 * Program for Binary To Decimal Conversion
 */

public class BinaryToDecimalConversion {

    public static void main(String[] args) {

        String binary = "101";

        System.out.println(method1(binary));
        System.out.println(method2(binary));
    }

    private static double method1(String binary) {
        binary = binary.trim();
        double out = 0;

        for(int i=binary.length()-1;i>=0;i--) {
            char s = binary.charAt(i);

            if(s == '1')
            {
                out = out + Math.pow(2, binary.length()-i-1);
            }

        }

        return out;
    }

    private  static double method2(String binary) {

        return Integer.parseInt(binary, 2);

    }
}
