package bigo.nguyenthai.algorithm;
import java.util.Scanner;

public class Lession09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ListNode list = new ListNode();
        for(int i = 0; i < length; ++i){
            Action action = new Action(sc.nextInt());
            if(action.getAction() == 1){
                int value = sc.nextInt();
                list.insertTail(value);
            }
            if(action.getAction() == 0){
                list.removeHead();
            }
        }
        System.out.println(list.toString());



    }

    static class Action{
        int action;

        public int getAction() {
            return action;
        }

        public void setAction(int action) {
            this.action = action;
        }

        public Action(int action) {
            this.action = action;
        }
    }
    static class ListNode{
        private Node head;
        private Node tail;
        public ListNode() {
           this.head  = null;
            this.tail  = null;

        }
        public void insertTail(int x){
            Node node = new Node(x);
            if(head == null){
                head=tail= node;
            }else{
                tail.next = node;
                tail = node;
            }
        }
        public void insertHead(int x){
            Node node = new Node(x);
            if(head == null){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
        }
        public void removeHead(){
            if(head == null){
                head = tail = null;
            }else{
                head = head.next;
            }
        }

        @Override
        public String toString() {
            Node p = head;
            while(p != null){
                System.out.print(p.value + " ");
                p = p.next;
            }
            return "";
        }
    }
    static class Node{
        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }
    }


}
