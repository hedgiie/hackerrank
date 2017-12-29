import java.util.*;

class Node23D {
    Node23D left,right;
    int data;
    Node23D(int data){
        this.data=data;
        left=right=null;
    }
}

class Day23BSTLevelOrderTraversal{

    static void levelOrder(Node23D root){

        //Write your code here

        Queue<Node23D> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            Node23D current = queue.remove();
            System.out.print(current.data+" ");
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
    }

    public static Node23D insert(Node23D root, int data){
        if(root==null){
            return new Node23D(data);
        }
        else{
            Node23D cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23D root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

