package LinkedList.DoublyLinkedList.Insertion;

public class InsertionAtEnd {
    static Node insert(int val,Node head)
    {
        Node node=new Node(val);
        if(head==null)
            return node;
        Node curr=head;
        while (curr.next!=null)
        {

            curr=curr.next;

        }
        curr.next=node;
        node.prev=curr;
        return head;
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
