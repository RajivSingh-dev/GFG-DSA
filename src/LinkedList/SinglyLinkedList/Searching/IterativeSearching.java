package LinkedList.SinglyLinkedList.Searching;
class Node
{
    int data;
   Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class IterativeSearching {
    static Node insert(Node head,int val)
    {
        Node node=new Node(val);
            node.next=head;
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
    static int search(int val,Node head)
    {
        int pos=1;
        Node curr=head;

while (curr!=null)
{
    if (curr.data==val)
        return pos;
   else {
    curr=curr.next;
pos++;
   }
}
return -1;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
      int pos=search(20,head);
        System.out.println(pos);
        traverse(head);
    }
}
