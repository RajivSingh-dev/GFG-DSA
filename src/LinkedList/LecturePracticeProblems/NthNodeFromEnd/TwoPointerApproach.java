package LinkedList.LecturePracticeProblems.NthNodeFromEnd;

public class TwoPointerApproach {
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

        Node first=head;
        Node second=head;

     int i=0;
     if (head==null)
         return;
     while (i<n )
     {
         if (first==null )
             return;
         first=first.next;
     i++;
     }
        System.out.println(first.data);
     while (first!=null ) {
         first = first.next;
         second = second.next;

     }
        System.out.println(second.data);
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
