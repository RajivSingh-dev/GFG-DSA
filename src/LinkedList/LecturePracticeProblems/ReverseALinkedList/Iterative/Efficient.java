package LinkedList.LecturePracticeProblems.ReverseALinkedList.Iterative;

import java.util.ArrayList;

public class Efficient {
    static void traverse(Node head)
    {
        Node node=head;
        while (node!=null)
        {
            System.out.print(node.data+" ");

            node=node.next;

        }
    }
    static Node insert(Node head,int x)
    {
        Node curr=new Node(x);
        curr.next=head;


        return curr;
    }
    static Node reverse(Node head)
    {
     Node curr=head;
     Node next;
Node prev=null;
     while (curr!=null)
     {
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
     }
     return prev;
    }

    public static void main(String[] args) {
        Node head=null;
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
        traverse(head);
        head= reverse(head);
        traverse(head);

    }

}
