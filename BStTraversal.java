//EXP 3 
import java.util.Scanner;

public class BStTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Node insertNode() {
        int data = sc.nextInt();

        if (data == -1)
            return null;

        Node node = new Node(data);

        System.out.print("Enter left child of " + data + "(-1 for NULL):");
        node.left = insertNode();

        System.out.print("Enter right child of " + data + "(-1 for NULL):");
        node.right = insertNode();

        return node;
    }

    static void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        System.out.println("Enter root node (-1 for NULL):");
        Node root = insertNode();

        System.out.println("preorder Traversal");
        preorder(root);

        System.out.println("\ninorder Traversal");
        inorder(root);

        System.out.println("\npostorder Traversal");
        postorder(root);
    }
}
