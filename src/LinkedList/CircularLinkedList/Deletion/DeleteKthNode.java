package LinkedList.CircularLinkedList.Deletion;

public class DeleteKthNode {
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
    static Node deleteKth(Node head,int k)
    {
deleteHead d=new deleteHead();
        if (head==null   )
            return null;
        if(k==1)
            d.delete(head);
        Node curr=head;
        int i=1;
        while (i<k-1)
        {
           curr=curr.next;
           i++;
        }
        curr.next=curr.next.next;

        return head;
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
        Node t=deleteKth(head,k);
        traverse(head);

    }
}
