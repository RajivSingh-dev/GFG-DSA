package LinkedList.CircularLinkedList.CircularDoublyLinkedList.Insertion;

class Node{
    Node next;
    Node prev;
    int data;
    Node(int data)
    {
        this.data=data;
    }
}
public class InsertAtBeginning {
    static Node insert(int data,Node head)
    {

        Node newNode=new Node(data);

        Node curr=head;
        if (curr==null) {
            newNode.next=newNode;
           newNode.prev=newNode;
            return newNode;
        }
        else {
//O(n)
            /*while (curr.next != head)
                curr = curr.next;
            curr.next = newNode;
            newNode.next = head;*/
            //O(1)
           newNode.prev=head.prev;
           newNode.next=head;
           head.prev.next=newNode;
           head.prev=newNode;
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
        head=insert(50,head);
        head=insert(40,head);
        head=insert(30,head);
        head=insert(20,head);
        head=insert(10,head);
        traverse(head);
        int k=3;
       // traverse(head);

    }
}
