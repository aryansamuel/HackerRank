/*
It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride!

There are n people queued up, and each person wears a sticker indicating their initial position in the queue 
(i.e.: 1, 2, ... , n-1, n with the first number denoting the frontmost position).

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, 
they still wear the same sticker denoting their original place in line. One person can bribe at most two other persons.
That is to say, if n = 8 and Person 5 bribes Person 4, the queue will look like this: 1, 2, 3, 5, 4, 6, 7, 8.

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place 
to get the queue into its current state!

Note: Each Person X wears sticker X, meaning they were initially the Xth person in queue.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // # of test cases
        
        for (int i=0; i<t; i++) {
            int n = in.nextInt(), b=0; // # of people in queue, # of bribes
            String B = null;
            boolean complete = false;
            int[] Q = new int[n]; // int array of queue
            int[] sQ = new int[n+1]; // int array of # of bribes
            for (int j=0; j<n; j++) {
                Q[j] = in.nextInt();
            }
            while (!complete) {
                complete = true;
                for (int j=0; j<n-1; j++) {
                    if (Q[j] > Q[j+1]) {
                        sQ[Q[j]]++;
                        if (sQ[Q[j]] > 2) {
                            B = "Too chaotic";
                            complete = true;
                        } else {
                            int temp = Q[j];
                            Q[j] = Q[j+1];
                            Q[j+1] = temp;
                            b++;
                            B = String.valueOf(b);
                            complete = false;
                        }
                    
                    }       
                }
            }
            System.out.println(B);
        }
        
    }

}
