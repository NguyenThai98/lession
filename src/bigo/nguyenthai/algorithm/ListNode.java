package bigo.nguyenthai.algorithm;


public class ListNode {
       Node head;
       Node tail;
       public ListNode() {
              this.head = null;
              this.tail = null;
       }
       public class Node{
              int val;
              Node next;

              public Node(int val) {
                     this.val = val;
              }
       }
       public void insertHead(int value){
              Node node = new Node(value);
              if(head == null){
                     head = tail = node;
              }else{
                   node.next = head;
                   head = node;
              }
       }
       public void insertTail(int value){
              Node node = new Node(value);
              if(head == null){
                     head = tail = node;
              }else{
                     tail.next = node;
                     tail = node;
              }
       }
       public void insert(int value, int index){
              if(index == 1){
                     insertHead(value);
              }else if (index < 1){
                     System.out.printf("Invalid pos: %d ", index);
                     System.out.println();
              } else{
                     boolean checkInsert = false;
                     Node node = new Node(value);
                     int i = 0;
                     for(Node p = head; p != null; p = p.next){
                            if(i == index - 2){
                                   node.next = p.next;
                                   p.next = node;
                                   checkInsert = true;
                                   break;
                            }
                            i++;
                     }
                     if(!checkInsert){
                            System.out.printf("Invalid pos: %d ", index);
                            System.out.println();
                     }
              }

       }

       public void removeHead(){
              if(head == null){
                     head = tail = null;
              }else{
                     head = head.next;
              }
       }
       public void removeTail(){
              if(head == null){
                     head = tail = null;
              }else{
                     Node second = head;
                     while(second.next.next != null){
                            second = second.next;
                     }
                     second.next = null;
                     tail = second;
              }
       }
       public void remove(int index){
              if(index == 1){
                     removeHead();
              }else if (index < 1){
                     System.out.printf("Invalid pos: %d ", index);
                     System.out.println();
              }else{
                     int i = 0;
                     boolean checkInsert = false;
                     for(Node p = head; p != null; p = p.next){
                            if(i == index - 2 &&  p.next != null){
                                   p.next = p.next.next;
//                                 p.next = null;
                                   checkInsert = true;
                                   break;
                            }
                            i++;
                     }
                     if(!checkInsert){
                            System.out.printf("Invalid pos: %d ", index);
                            System.out.println();
                     }
              }
       }
       public void printListNode(ListNode listNode){
              ListNode p = listNode;
              while(p.head != null){
                     System.out.print(p.head.val + " ");
                     p.head = p.head.next;
              }

       }
}
