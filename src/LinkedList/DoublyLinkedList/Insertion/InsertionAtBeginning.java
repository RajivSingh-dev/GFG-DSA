package LinkedList.DoublyLinkedList.Insertion;
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
this.data=data;
prev=null;
next=null;
    }
}
public class InsertionAtBeginning {
    static Node insert(int val,Node head)
    {
        Node node=new Node(val);
    node.next=head;
    node.prev=null;
    if(head!=null)
        head.prev=node;
    return node;
    }
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
        Node head=null;
        head=insert(30,head);
        head=insert(20,head);
        head=insert(10,head);
        traverse(head);
    }
}
