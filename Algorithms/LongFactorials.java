/*
You are given an integer N. Print the factorial of this number.

Input 
Input consists of a single integer N, where 1<=N<=100.

Output 
Print the factorial of N.
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger x = BigInteger.valueOf(in.nextInt());
        System.out.println(fact(x));
    }
    private static BigInteger fact(BigInteger x) {
        BigInteger n = x;
        while (!n.equals(BigInteger.ONE)) {
            n = n.subtract(BigInteger.valueOf(1));
            x = x.multiply(n);
        }
       return x;
    }
}
