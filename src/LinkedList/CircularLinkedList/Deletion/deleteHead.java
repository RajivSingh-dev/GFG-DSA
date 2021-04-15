package LinkedList.CircularLinkedList.Deletion;
class Node
{
    int data;
   Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class   deleteHead {
    static Node insert(int data,Node head)
    {

        Node newNode=new Node(data);

        Node curr=head;
        if (curr==null) {
            newNode.next=newNode;
            return newNode;
        }
        else {
//O(n)
            /*while (curr.next != head)
                curr = curr.next;
            curr.next = newNode;
            newNode.next = head;*/
            //O(1)
            newNode.next=head.next;
            head.next=newNode;
            int temp=head.data;
            head.data=newNode.data;
            newNode.data=temp;
            return head;
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
     Node delete(Node head)
    {

        if (head==null   )
            return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    public static void main(String[] args) {
        deleteHead deleteHead=new deleteHead();
        Node head=null;
        head=insert(30,head);
        head=insert(20,head);
        head=insert(10,head);
        traverse(head);
        Node t=deleteHead.delete(head);
        System.out.println(t.data);
    }
}
