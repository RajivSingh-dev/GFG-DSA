package LinkedList.LecturePracticeProblems;

public class SwapKthNodesFromEnd {
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
    static Node nthFromEnd(Node head,int n)
    {

        Node first=head;
        Node prev1 = null;
        Node prev2 = null;
        Node second=head;
        for(int i=0;i<n;i++)
        {
            if(i==n-2)
                prev1=first;
            first=first.next;

        }
        Node temp1=first;
        Node temp3=temp1;
        while(first!=null)
        {
            if(first.next==null)
                prev2=second;
            first=first.next;
            second=second.next;

        }
prev2.next=prev1.next;
      /*  Node temp2=second;
        second.next=null;
        second.next=temp1.next;
        temp3.next=null;
        first.next=temp2;*/

        System.out.println(prev1.data+" "+ prev2.data);
        return head;
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
       head= nthFromEnd(head,n);
        traverse(head);
   }
}
