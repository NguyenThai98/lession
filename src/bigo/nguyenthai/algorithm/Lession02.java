package bigo.nguyenthai.algorithm;
import java.util.Scanner;

public class Lession02 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Node node1 = new Node();
        Node cur1 = node1;

        int nextVal = sc.nextInt();
        if(nextVal != -1){
            node1.value = nextVal;
            nextVal = sc.nextInt();
        }
        while(nextVal != -1){
            Node node = new Node(nextVal);
            cur1.next = node;
            cur1 = node;
            nextVal = sc.nextInt();
        }

        nextVal = sc.nextInt();
        Node node2 = new Node();
        Node cur2 = node2;
        if(nextVal != -1){
            node2.value = nextVal;
            nextVal = sc.nextInt();
        }
        while(nextVal != -1){
            Node node = new Node(nextVal);
            cur2.next = node;
            cur2 = node;
            nextVal = sc.nextInt();
        }
        int arr[] = new int[107];
        boolean arrCheck[] = new boolean[107];
        boolean [] checkNumber = new boolean[107];
        while(node1 != null){
            checkNumber[node1.value] = true;
            node1 = node1.next;
        }
        int i=0;
        while(node2 != null && node2.value != 0){
            if(checkNumber[node2.value] && !arrCheck[node2.value]){
                arr[i++] =  node2.value;
                arrCheck[node2.value] = true;
            }
            node2 = node2.next;
        }
        for(int j=0; j < i; j++){
            System.out.print(arr[j] + " ");
        }
        if(i == 0){
            System.out.println("NO INTERSECTION");
        }


    }
    static class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node() {
            this.next = null;
        }
    }

}
