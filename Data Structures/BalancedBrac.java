/*
Balanced Brackets
https://www.hackerrank.com/challenges/balanced-brackets

Due to the complexity of the question, please follow the link above to read its description.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i=0; i<n; i++) {
            String S = in.next();
            if (match(S)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    private static boolean match(String S) {
        Stack<Character> C = new Stack<Character>();
        for (int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if ((c == '{') || (c == '(') || (c == '[')) C.push(c);
            else {
                if (C.isEmpty()) return false;
                char brac = C.pop();
                if (! (((brac == '{') && (c == '}')) || 
                       ((brac == '(') && (c == ')')) ||
                       ((brac == '[') && (c == ']')))  ) {
                    return false;
                }
            }
        }
        return C.isEmpty();
    }

}
