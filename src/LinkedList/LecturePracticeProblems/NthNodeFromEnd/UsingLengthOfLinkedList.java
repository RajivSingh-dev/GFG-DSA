package LinkedList.LecturePracticeProblems.NthNodeFromEnd;
class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class UsingLengthOfLinkedList {
       static void traverse(Node head)
    {
   Node node=head;
        while (node!=null)
        {
            System.out.println(node.data);

            node=node.next;

        }
    }
static Node insert(Node head,int x)
{
    Node curr=new Node(x);
    curr.next=head;


return curr;
}
static void  nthFromEnd(Node head,int n)
{
    Node curr=head;
    int len=0;

    while (curr!=null)
    {
        len++;
        curr=curr.next;
    }
    System.out.println(len);
    if (n>len)
        return;
    curr=head;
    int i=1;
    while (i<(len-n+1))
    {
        curr=curr.next;
        i++;
    }
    System.out.println(curr.data);
}
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,50);
        head=insert(head,40);
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
        traverse(head);
        int n=4;
nthFromEnd(head,n);
    }
}
