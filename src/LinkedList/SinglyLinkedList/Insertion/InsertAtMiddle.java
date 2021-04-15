package LinkedList.SinglyLinkedList.Insertion;
class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class InsertAtMiddle {
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
         Node curr=new Node(x);
    curr.next=head;


return curr;
    }
    static void Mid(Node head)
    {
        if (head==null)
            return;
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);

    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,50);
        head=insert(head,40);
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);

        traverse(head);
        Mid(head);  }
}
