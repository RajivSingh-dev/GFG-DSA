package LinkedList.SinglyLinkedList.Deletion;


public class DeleteLastNode {
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
        if (head.next==null)
            return null;
        Node curr=head;
while (curr.next.next!=null)
{
 curr=curr.next;
}
curr.next=null;
        return head;
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
