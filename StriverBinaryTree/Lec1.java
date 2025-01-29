package StriverBinaryTree;

public class Lec1 {
   static class Node {
        int data;
        Node left;
        Node right;

        public Node(int key) {
            data = key;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(0);
        root.right = new Node(23);
        root.right.left = new Node(24);
      
    }
}
