package LinkedList.SinglyLinkedList.Searching;

public class RecursiveSearching {
    static Node insert(Node head,int val)
    {
        Node node=new Node(val);
        node.next=head;
        return node;
    }
    static void traverse(Node head)
    {
        Node node=head;
        while (node!=null)
        {
            System.out.println(node.data);
            node=node.next;

        }
    }
    static int search(int val,Node curr,int idx)
    {
        if (curr==null)
            return -1;
        if (curr.data==val)
            return idx;
        else
         return search(val,curr.next,++idx);
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
      int idx=1;
        int pos=search(10,head,idx);
        System.out.println(pos);
        traverse(head);
    }
}
