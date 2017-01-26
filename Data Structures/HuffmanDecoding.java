/*
Huffman Decoding
https://www.hackerrank.com/challenges/tree-huffman-decoding

Due to the complexity of the question, please follow the link above to read its description.
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

