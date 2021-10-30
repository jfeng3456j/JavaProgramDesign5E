package BuildJavaPrograms.Chapter_17_BinaryTree;

public class IntTree {

    private IntTreeNode overallRoot;

    public IntTree(int max) {
        overallRoot = buildTree(1, max);
    }

    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            IntTreeNode left = buildTree(2 * n, max);
            IntTreeNode right = buildTree(2 * n + 1, max);

            return new IntTreeNode(n, left, right);
        }
    }

    public void printPreOrder() {
        System.out.print("Preorder: ");
        printPreOrder(overallRoot);
        System.out.println();
    }

    //post: [root, left, right]
    private void printPreOrder(IntTreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            //print the left subtree
            printPreOrder(root.left);
            //print the right subtree
            printPreOrder(root.right);
        }
    }

    public void printInorder() {
        System.out.print("Inorder: ");
        printInOrder(overallRoot);
        System.out.println();
    }

    //post: [left, root, right]
    private void printInOrder(IntTreeNode root) {
        if (root != null) {
            //print the left subtree
            printInOrder(root.left);
            System.out.print(root.data + " ");
            //print the right subtree
            printInOrder(root.right);
        }
    }

    public void printPostOrder() {
        System.out.print("PostOrder: ");
        printPostOrder(overallRoot);
        System.out.println();
    }

    //post: [left, right, root]
    private void printPostOrder(IntTreeNode root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //sum up all node values
    public int sum() {
        return sum(overallRoot);
    }

    private int sum(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.data + sum(root.left) + sum(root.right);
        }
    }

    public int countLevel() {
        return countLevel(overallRoot);
    }

    private int countLevel(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(countLevel(root.left), countLevel(root.right));
        }
    }

    //post: print the tree contents, one per line, following an inrdoer traveral and using indentation to indicate
    //node dept; prints the right to left so that it looks correct the output is rotate to the right
    public void printSideWay() {
        printSideWay(overallRoot, 0);
    }

    private void printSideWay(IntTreeNode root, int level) {
        if (root != null) {
            printSideWay(root.right, level + 1);

            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }

            System.out.println(root.data);

            printSideWay(root.left, level + 1);

        }
    }

}
