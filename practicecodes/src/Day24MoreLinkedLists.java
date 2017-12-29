import java.io.*;
import java.util.*;
class Node24D {
    int data;
    Node24D next;
    Node24D(int d){
        data=d;
        next=null;
    }

}

class Day24MoreLinkedLists {
    public static Node24D removeDuplicates(Node24D head) {
        //Write your code here
        if (head == null || head.next == null){
            return head;
        }
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;
    }

    public static  Node24D insert(Node24D head,int data)
    {
        Node24D p=new Node24D(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node24D start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node24D head)
    {
        Node24D start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node24D head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}


