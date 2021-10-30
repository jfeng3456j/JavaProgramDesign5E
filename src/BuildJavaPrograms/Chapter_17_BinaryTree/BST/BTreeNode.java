package BuildJavaPrograms.Chapter_17_BinaryTree.BST;

import BuildJavaPrograms.Chapter_9_Inheritance.Example.B;

public class BTreeNode {
    private BTreeNode overallRoot;
    public int data;
    public BTreeNode left;
    public BTreeNode right;

    //constructor
    public BTreeNode(int max) {
        overallRoot = buildTree(1, max);
    }


    //constructor for left and right subtree
    public BTreeNode(int data, BTreeNode left, BTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }


    private BTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            BTreeNode left = buildTree(2 * n, max);
            BTreeNode right = buildTree(2 * n + 1, max);
            System.out.println("n is " + n);
            return new BTreeNode(n, left, right);
        }
    }

    public void printPreOrder() {
        System.out.print("preorder: ");
        printPreOrder(overallRoot);
        System.out.println();
    }

    private void printPreOrder(BTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    public void printInOrder() {
        System.out.print("Inorder: ");
        printInOrder(overallRoot);
        System.out.println();
    }

    private void printInOrder(BTreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(" " + root.data );
            printInOrder(root.right);
        }
    }

    public void printPostOrder() {
        System.out.print("PostOrder: ");
        printPostOrder(overallRoot);
        System.out.println();
    }

    private void printPostOrder(BTreeNode root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(" " + root.data);
        }
    }

    public void printSideWay() {
        printSideWay(overallRoot, 0);
    }

    private void printSideWay(BTreeNode overallRoot, int level) {
        if (overallRoot != null) {
            printSideWay(overallRoot.right, level + 1);

            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(overallRoot.data);
            printSideWay(overallRoot.left, level + 1);
        }
    }


}
