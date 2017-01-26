/*
Self Balancing Tree
https://www.hackerrank.com/challenges/self-balancing-tree

Due to the complexity of the question, please follow the link above to read a description.
*/

   /* Class node is defined as :
    class Node 
       int val;   //Value
       int ht;      //Height
       Node left;   //Left child
       Node right;   //Right child
   */

    static Node insert(Node root, int val) {
        if (root == null) {
            Node N = new Node();
            N.val = val;
            N.ht = 0;
            return N;
        }
       
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
       
        root = rotate(root);
        return root;
    }

    private static Node rotate(Node root) {
        int bf = balFac(root);
        
        if (bf == 2) {
            if (balFac(root.left) == -1) root.left = rotateLeft(root.left);
            return rotateRight(root);
        } 
        if (bf == -2) {
            if (balFac(root.right) == 1) root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        
        height(root);
        return root;
    }

    private static Node rotateLeft(Node root) {
        Node N = root.right;
        root.right = root.right.left;
        N.left = root;
        height(root);
        height(N);
        return(N);
    }
    
    private static Node rotateRight(Node root) {
        Node N = root.left;
        root.left = root.left.right;
        N.right = root;
        height(N);
        height(root);
        return(N);
    }

    private static int balFac(Node root) {
        int leftH = -1, rightH = -1;
        if (root.left != null) leftH = root.left.ht;
        if (root.right != null) rightH = root.right.ht;
        return leftH - rightH;
    }
 
    private static void height(Node root) {
        int leftH = -1, rightH = -1;
        if (root.left != null) leftH = root.left.ht;
        if (root.right != null) rightH = root.right.ht;
        root.ht = 1 + Math.max(leftH, rightH);
    }
