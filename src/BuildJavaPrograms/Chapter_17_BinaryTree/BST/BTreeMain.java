package BuildJavaPrograms.Chapter_17_BinaryTree.BST;

public class BTreeMain {

    public static void main (String[] args) {
        BTreeNode bt = new BTreeNode(12);
        System.out.println("Binary Search Tree");
        bt.printSideWay();
        System.out.println();
        bt.printPreOrder();
        bt.printInOrder();
        bt.printPostOrder();
    }
}
