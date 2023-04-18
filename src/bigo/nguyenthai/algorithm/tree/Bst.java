package bigo.nguyenthai.algorithm.tree;

import java.util.Scanner;

/**
 * Date: 3/21/2023<br/>
 * Time: 9:13 PM<br/>
 */
public class Bst {
    Node root;

    public Bst(){
        root = null;
    }
    public int minBst(){
        return root.minNode();
    }
    public void LNR(Node bst){
        if(bst != null){
            LNR(bst.left);
            System.out.print(bst.data + " ");
            LNR(bst.right);
        }
    }
    public int height(Node root) {
        Node p = root;
        if (p == null)
            return -1;

        int leftHeight = height(p.left);
        int rightHeight = height(p.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public  void addToBst(int value){
        if(root == null){
            Node p = new Node(value);
            root = p;
        }else{
            root.addToNode02(value);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Bst bst = new Bst();
        for(int i = 0; i < length; i++){
            bst.addToBst(sc.nextInt());
        }
        System.out.println("MIN: " + bst.minBst());

        System.out.println(bst.height(bst.root));
    }

    class Node{
        int data;
        Node left;
        Node right;
        public Node(int value){
            data = value;
            left = right = null;
        }
        public int minNode(){
            Node l = left;
            if(l == null){
                return data;
            }else{
                while(l.left != null){
                    l = l.left;
                }
            }
            return l.data;
        }

        public void addToNode(int value){
            if(value > data){
                if(right == null){
                    Node p = new Node(value);
                    right = p;
                }else{
                    right.addToNode(value);
                }

            }else if(value < data){
                if(left == null){
                    Node p = new Node(value);
                    left = p;
                }else{
                    left.addToNode(value);
                }

            }else{
                // do nothing
            }
        }
        public void addToNode02(int value){
             Node p = new Node(value);
             Node parent = root;
             Node insertNode = null;
             while(parent != null){
                 insertNode = parent;
                 if(value > parent.data){
                     parent = parent.right;
                 }else if(value < parent.data){
                     parent = parent.left;
                 }else{
                     break;
                 }
             }
             if(insertNode == null){
                 insertNode = p;
             }else if(value > insertNode.data){
                 insertNode.right = p;
             }else if(value < insertNode.data){
                 insertNode.left = p;
             }

        }
    }
}
