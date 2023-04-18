package bigo.nguyenthai.algorithm.tree;

/**
 * Date: 3/21/2023<br/>
 * Time: 9:09 PM<br/>
 */
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int value) {
        this.data = value;
        left = right = null;
    }
    public void addToNode(int value){
        if(value < data){
            if(left == null){
                Node node = new Node(value);
                left = node;
            }else{
                left.addToNode(value);
            }
        } else if(value > data){
            if(right == null){
                Node node = new Node(value);
                right = node;
            }else{
                right.addToNode(value);
            }
        }else{
            // do nothing
        }
    }
    public int minNode(){
      Node l = left;
      if(l == null){
          return data;
      }else{
          while(l.left != null){
              l = l.left;
          }
          return l.getData();
      }
    }
    public int maxNode(){
        Node r = right;
        if(r == null){
            return data;
        }else{
            while(r.right != null){
                r = r.right;
            }
        }

        return r.getData();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

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
}