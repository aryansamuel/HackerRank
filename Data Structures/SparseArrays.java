import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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
