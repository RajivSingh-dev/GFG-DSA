package LinkedList.SinglyLinkedList.Problems;



import java.util.Scanner;
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
        data = a;
        next = null;
    }
}
class MyStack{

    // Note that top is by default null
    // in Java
    StackNode top;
    StackNode insert(int a)
    {
        StackNode node=new StackNode(a);
        node.next=top;
        top=node;

        return top;
    }
    void push(int a) {
        top=insert(a);
    }
    int pop() {
        if(top!=null){
            int temp=top.data;
            top.next=null;
            top=top.next;
            return temp;}
        return -1;
    }
}
public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        while (t>0)
        {
            MyStack ob=new MyStack();
int q= scanner.nextInt();
while (q>0)
{
    int queryType=0;
    if (queryType==1)
    {
        int a= scanner.nextInt();
        ob.push(a);
    }
else if (queryType==2)
    {
        System.out.println(ob.pop()+" ");
    }
q--;
}
            System.out.println(" ");
t--;
        }
    }
}
