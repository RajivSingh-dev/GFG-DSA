package LinkedList.LecturePracticeProblems.ReverseALinkedList.Recursive;
class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class NonTailRecusive {
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
    if (head==null || head.next==null)
        return head;

    Node restHead=reverse(head.next);
    Node restTail=head.next;
    restTail.next=head;
    head.next=null;
    return restHead;
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
