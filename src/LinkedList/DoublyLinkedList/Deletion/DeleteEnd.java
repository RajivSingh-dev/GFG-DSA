package LinkedList.DoublyLinkedList.Deletion;

public class DeleteEnd {
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
    static Node insert(int val,Node head)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
            head.prev=node;
        return node;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(30,head);
        head=insert(20,head);
        head=insert(10,head);
        traverse(head);
        head= delete(head);
        traverse(head);

    }
}
