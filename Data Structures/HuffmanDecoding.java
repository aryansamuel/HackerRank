/*
Since copy pasting the question won't be enough to understand the problem, I've provided a link to it:
https://www.hackerrank.com/challenges/tree-huffman-decoding
*/

/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root) {
    int i=0;
    Node N = root;
    while (i < S.length()) {
        if (S.charAt(i) == '1') {
            N = N.right;
        } else N = N.left; 
        
        if (N.left == null && N.right == null) {
            System.out.print(N.data);
            N = root;
        }
        i++;
    }
}

