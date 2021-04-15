package LinkedList.CircularLinkedList.Insertion;


public class InsertAtEnd {
    static Node insert(int data, Node head)
    {

        Node newNode=new Node(data);

        Node curr=head;
        if (curr==null) {
            newNode.next=newNode;
            return newNode;
        }
        else {
            newNode.next=head.next;
            head.next=newNode;
            int temp=head.data;
            head.data=newNode.data;
            newNode.data=temp;
            return newNode;
        }

    }
    static void traverse(Node head)
    {
        if (head==null)
            return;
        System.out.println(head.data);
        for (Node r = head.next; r !=head ; r=r.next) {
            System.out.println(r.data);
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
