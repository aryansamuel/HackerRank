/*
You are given a sequence whose nth term is
                                    Tn = n^2 - (n-1)^2
You have to evaluate the series
                               Sn = T1 + T2 + T3 + ... + Tn
Find Sn mod (10^9 + 7).

Input Format
The first line of input contains T, the number of test cases. 
Each test case consists of one line containing a single integer n.
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger x = new BigInteger("0"), modulo = new BigInteger("1000000007");
        
        int n = in.nextInt();
        
        for (int i=0; i<n; i++) {
            x = in.nextBigInteger();
            System.out.println(x.modPow(BigInteger.valueOf(2), modulo));
        } 
    }
    
}
