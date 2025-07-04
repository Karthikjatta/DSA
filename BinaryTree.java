import java.util.Scanner;
class BinaryTree{
    public BinaryTree(){
        
    }
      private static class node{
        node prev;
        int val;
        node next;
        private node(int val){
            this.val=val;
        }
    } 
    private node root;
    public void insert(Scanner sc){
        System.out.println("enter the root node");
        int val=sc.nextInt();
        root=new node(val);
        insert(root,sc);
    }
    public void insert(node node,Scanner sc){
        System.out.println("Do you want to enter left node of "+node.val);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value of left "+node.val);
            int val=sc.nextInt();
            node.prev=new node(val);
            insert(node.prev,sc);
        }
        System.out.println("Do you want to enter right node of "+node.val);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of right "+node.val);
            int val=sc.nextInt();
            node.next=new node(val);
            insert(node.next,sc);
        }
        
    }
    public void display()
    {
        display(root);
    }
    private void display(node node){
        if(node==null) return;
        System.out.println(node.val);
        display(node.prev);
        display(node.next);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    BinaryTree tree=new BinaryTree();
	    tree.insert(sc);
	    tree.display();
	}
}