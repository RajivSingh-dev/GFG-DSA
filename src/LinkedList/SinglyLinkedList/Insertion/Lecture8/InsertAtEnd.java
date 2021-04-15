package LinkedList.SinglyLinkedList.Insertion.Lecture8;


class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class InsertAtEnd {
    static void traverse(Node head)
    {
  Node node=head;
        while (node!=null)
        {
            System.out.println(node.data);
            node=node.next;

        }
    }
   static Node insert(Node head, int x)
    {
        Node node=new Node(x);
        if(head==null)
            return node;
Node curr=head;
        while(curr.next!=null)
        {

            curr=curr.next;
        }
        curr.next=node;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
        traverse(head);
    }
}
