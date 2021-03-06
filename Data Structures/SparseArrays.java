/*
Sparse Arrays
https://www.hackerrank.com/challenges/sparse-arrays

There are N strings. Each string's length is no more than 20 characters. There are also Q queries. For each query, you are given a string, 
and you need to find out how many times this string occurred previously.

Input Format:
The first line contains , the number of strings.
The next  lines each contain a string.
The nd line contains , the number of queries.
The following  lines each contain a query string.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0, n=0, q=0;
        n = in.nextInt();
        String[] N = new String[n];
        for (i=0; i<n; i++) {
            N[i] = in.next();
        }
        q = in.nextInt();
        String[] Q = new String[q];
        for (i=0; i<q; i++) {
            Q[i] = in.next();
        }
        
        for (i=0; i<q; i++) {
            int x=0;
            for (int j=0; j<n; j++) {
                if (Q[i].equals(N[j])) {
                x++;
                }
            }
            System.out.println(x);
        }
 
    }
}
