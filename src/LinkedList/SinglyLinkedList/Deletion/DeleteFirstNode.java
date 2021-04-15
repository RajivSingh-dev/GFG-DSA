package LinkedList.SinglyLinkedList.Deletion;


class Node
{
    int data;
Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class DeleteFirstNode {
    static void traverse(Node head)
    {
        Node node=head;
        while (node!=null)
        {
            System.out.println(node.data);

            node=node.next;

        }
    }
    static Node delete(Node head)
    {
        if (head==null)
            return null;

return head.next;
    }
    static Node insert(Node head,int x)
    {
        Node curr=new Node(x);
        curr.next=head;
        head=curr;

        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
      head=  delete(head);
        traverse(head);

    }

}
