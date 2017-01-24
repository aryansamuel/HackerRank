/*
Consider a matrix with n rows and m columns, where each cell contains either a 0 or a 1 and any cell containing a 1 is called a filled cell. 
Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally; 
in other words, cell [i][j] is connected to cells [i-1][j-1], [i-1][j], [i-1][j], [i-1][j+1], [i][j-1], [i][j+1], [i+1][j-1], and [i+1][j+1], 
provided that the location exists in the matrix for that .

If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to 
at least one other cell in the region but is not necessarily directly connected to all the other cells in the region.

Given an n X m matrix, find and print the number of cells in the largest region in the matrix. 
Note that there may be more than one region in the matrix.
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    public static boolean[][] visit;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), max=0;
        int[][] M = new int[n][m];
        visit = new boolean[n][m];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                M[i][j] = in.nextInt();
                visit[i][j] = false;
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (!visit[i][j]) max = Math.max(max, connections(M, n, m, i, j));
            }
        }
        
        System.out.println(max);
       
    }
    
    private static int connections (int[][] M, int rows, int cols, int i, int j) {
        if (i<0 || j<0 || i>=rows || j>=cols) return 0;
        if (visit[i][j]) return 0;
        visit[i][j] = true;
        if (M[i][j] == 1) {
            return 1 +
            connections(M, rows, cols, i-1, j-1) + connections(M, rows, cols, i-1, j) +
            connections(M, rows, cols, i-1, j+1) + connections(M, rows, cols, i, j-1) +
            connections(M, rows, cols, i, j+1) + connections(M, rows, cols, i+1, j-1) +
            connections(M, rows, cols, i+1, j) + connections(M, rows, cols, i+1, j+1);
        } else return 0;
    }
}
