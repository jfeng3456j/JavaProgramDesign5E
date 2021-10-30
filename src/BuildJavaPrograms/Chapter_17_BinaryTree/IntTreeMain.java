package BuildJavaPrograms.Chapter_17_BinaryTree;

public class IntTreeMain {

    public static void main (String[] args) {
        IntTree t = new IntTree(12);
        System.out.println("Tree Structure");

        t.printSideWay();
        System.out.println();

        t.printPreOrder();
        t.printInorder();
        t.printPostOrder();

        System.out.println();

        System.out.println("find the sum of tree: " + t.sum());
        System.out.println();

        System.out.println("find the height of tree: " + t.countLevel());
        System.out.println();

    }




}
