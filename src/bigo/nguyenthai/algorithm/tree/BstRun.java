package bigo.nguyenthai.algorithm.tree;

/**
 * Date: 3/21/2023<br/>
 * Time: 9:22 PM<br/>
 */
public class BstRun {
    public static void main(String[] args) {

    }

    public static void LNR(Node bst){
        if(bst != null){
            LNR(bst.getLeft());
            System.out.print(bst.getData() + " ");
            LNR(bst.getRight());
        }
    }

}
