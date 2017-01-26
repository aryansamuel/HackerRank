/*
Queue using Two Stacks
https://www.hackerrank.com/challenges/queue-using-two-stacks

Due to the complexity of the question, please follow the link above to read a description.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Queue<Integer> Q = new Queue<Integer>();
        
        for (int i=0; i<q; i++) {
            int type = in.nextInt();
            if (type == 1) Q.enqueue(in.nextInt());
            else if (type == 2) Q.dequeue();
            else System.out.println(Q.peek());
        }
    }
    
}

class Queue<type> {
    Stack<type> S1 = new Stack<type>();
    Stack<type> S2 = new Stack<type>();
    
    void enqueue(type data) {
        S1.push(data);
    }
    
    type dequeue() {
        transfer();
        return S2.pop();
    }
    
    type peek() {
        transfer();
        return S2.peek();
    }
    
    void transfer() {
        if (S2.isEmpty()) {
            while (!S1.isEmpty()) S2.push(S1.pop());
        }
    }
    
}
