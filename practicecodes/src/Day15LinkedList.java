
import java.util.*;

class Node15D {
    int data;
    Node15D next;
    Node15D(int d) {
        data = d;
        next = null;
    }
}

class Day15LinkedList {

    public static Node15D insert(Node15D head, int data) {
        //Complete this method
        if(head == null)
            return new Node15D( data);
        else if(head.next == null){
            head.next = new Node15D(data);
        }
        else{
            insert(head.next,data);
        }

        return head;
    }

    public static void display(Node15D head) {
        Node15D start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node15D head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}