/*
Your algorithms have become so good at predicting the market that you now know what the share price of Wooden Orange Toothpicks Inc. (WOT) 
will be for the next N days.
Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own, or not make any transaction at all.
What is the maximum profit you can obtain with an optimum trading strategy?

Input Format
The first line contains the number of test cases T. T test cases follow:
The first line of each test case contains a number N. The next line contains N integers, denoting the predicted price of WOT shares 
for the next N days.
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    
    int T;
    scanf("%d", &T);
    for (int i=0; i<T; i++) {
        
        int n;
        scanf("%d", &n);
        long max=0, profit=0;
        int stock[n];
        
        for (int j=0; j<n; j++) {
            scanf("%d", &stock[j]);
        }
        
        for (int j=n-1; j>=0; j--) {
            if (max < stock[j]) max = stock[j];
            profit += max - stock[j];
        }
        printf("%ld\n", profit);
    }
    
    return 0;
}
