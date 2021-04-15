package LinkedList.LecturePracticeProblems.ReverseALinkedList.Iterative;


import java.util.ArrayList;


class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class Naive {
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
ArrayList<Integer> arrayList=new ArrayList<>();
while (curr!=null)
{
    arrayList.add(curr.data);
    curr=curr.next;
}
curr=head;


    while (curr!=null)
    {
       curr.data=arrayList.remove(arrayList.size()-1);
        curr=curr.next;

    }
    return head;
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
