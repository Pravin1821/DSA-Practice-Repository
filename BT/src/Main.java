import java.util.*;
public class Main{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        BST bst = new BST();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
            bst.add(scan.nextInt());
//        System.out.println("In Order Traversal: ");
//        bst.inOrder();
//        System.out.println("Pre Order Traversal: ");
//        bst.preOrder();
//        bst.delete(scan.nextInt());
//        bst.inOrder();
//        System.out.println("Post Order Traversal: ");
//        bst.postOrder();
//        System.out.println("Level Order Traversal: ");
//        bst.levelOrder();
//        System.out.println("Spiral Order Traversal: ");
//        bst.spiralOrder();
//        System.out.println("Left view: ");
//        bst.preOrder();
//        System.out.println("Right view: ");
//        bst.rightView();
//        System.out.println("Bottom view: ");
//        bst.bottomView();
        System.out.println("Top view: ");
        bst.topView();
        System.out.println("Vertical Order Traversal: ");
        bst.verticalOrder();

    }
}