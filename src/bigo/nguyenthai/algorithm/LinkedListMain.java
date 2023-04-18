package bigo.nguyenthai.algorithm;

public class LinkedListMain {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.insertTail(1);
        listNode.insertTail(2);
        listNode.insertTail(3);
        listNode.insertTail(4);
        listNode.insertTail(5);
        listNode.insertTail(6);
        listNode.remove(7);
        listNode.printListNode(listNode);

    }
}
