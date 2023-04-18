package bigo.nguyenthai.algorithm;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thaigogo2<br/>
 * Date: 3/21/2023<br/>
 * Time: 1:40 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int value) {
        this.data = value;
        left = right = null;
    }
    static class BinaryTree {
        Node root;

        public void addNode(int data) {
            Node newNode = new Node(data);

            if (root == null) {
                root = newNode;
            } else {
                Node focusNode = root;
                Node parent;

                while (true) {
                    parent = focusNode;

                    if (data < focusNode.data) {
                        focusNode = focusNode.left;
                        if (focusNode == null) {
                            parent.left = newNode;
                            return;
                        }
                    } else {
                        focusNode = focusNode.right;
                        if (focusNode == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
                }
            }
        }

        public void preOrderTraversal(Node focusNode) {
            if (focusNode != null) {
                System.out.print(focusNode.data + " ");
                preOrderTraversal(focusNode.left);
                preOrderTraversal(focusNode.right);
            }
        }
        public void inOrderTraversal(Node focusNode) {
            if (focusNode != null) {
                preOrderTraversal(focusNode.left);
                System.out.print(focusNode.data + " ");
                preOrderTraversal(focusNode.right);
            }
        }
        public void postOrderTraversal(Node focusNode) {
            if (focusNode != null) {
                preOrderTraversal(focusNode.left);
                preOrderTraversal(focusNode.right);
                System.out.print(focusNode.data + " ");
            }
        }
        public Node minNode(){
            Node focusNode = root;
            if(focusNode == null){
                return null;
            }else{
                while(focusNode.left !=null){
                    focusNode = focusNode.left;
                }
            }
            return focusNode;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(75);
        tree.addNode(1);
        tree.addNode(37);
        tree.addNode(43);
        tree.addNode(30);

        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);
        Node min = tree.minNode();
        System.out.println();
        System.out.println(min.data);
    }

}
