package LinkedList.SinglyLinkedList.Insertion.Lecture6;


class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
     next = null;
    }
}
public class TraversingSinglyLinkedList {
    static void traverse(Node head)
    {
        Node node=head;
        while (node!=null)
        {
            System.out.println(node.data);
            node=node.next;

        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);
head.next=node2;
node2.next=node3;
node3.next=node4;
traverse(head);

    }


}
