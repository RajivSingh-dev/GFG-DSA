package LinkedList.SinglyLinkedList.Insertion.Lecture4;

class Node
{
    int data;
    Node next;

    public Node(int val) {
     data=val;
        next = null;
    }
}
public class SimpleLinkedList {

    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
head.next=temp1;
temp1.next=temp2;
        System.out.println(head.data);
    }

}
