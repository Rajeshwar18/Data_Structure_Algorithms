import java.util.Stack;

class BinarySearchTree{
    static Node root=null,temp=null;
    static class Node{
        int data;
        Node right,left;

        public Node(int m){
            this.data=m;
            this.right=null;
            this.left=null;
        }
    }
    void insert(int n){
        Node mNode=new Node(n);
        if(root==null){
            root=mNode;
        }
        else{
            temp=root;
            while(temp.right!=null || temp.left!=null){
                if(mNode.data>temp.data && temp.right!=null){
                    temp=temp.right;
                }
                else if(mNode.data<temp.data && temp.left!=null){
                    temp=temp.left;
                }
                else{
                    break;
                }
            }
            if(mNode.data>temp.data){
                temp.right=mNode;
            }
            else{
                temp.left=mNode;
            }
        }
    }
    void printInOrder(){
        
        if(root==null){
            System.out.println("Tree is Empty");
        }
        else{
            temp=root;
            Stack <Node> st = new Stack<Node>();
            while(temp!=null || st.size()>0){
                while(temp!=null){
                    st.push(temp);
                    temp=temp.left;
                }
                temp=st.pop();
                System.out.print("[" + temp.data + "] ");
                temp=temp.right;
            }
        }
    }
    static void printPreOrder(){
        if(root==null){
            System.out.println("Tree is empty");
        }
        else{
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                Node temp = stack.pop();
                System.out.print("[ "+temp.data+" ]");
                if(temp.right!=null){
                    stack.push(temp.right);
                }
                if(temp.left!=null){
                    stack.push(temp.left);
                }
            }
            System.out.println();
        }
    }
    static void  printPostOrder() {
        if (root == null) {
            System.out.println("Tree is empty");
        }
        else{
            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();
            stack1.push(root);

            while (!stack1.empty()) {
                Node temp = stack1.pop();
                stack2.push(temp);
                if (temp.left != null)
                    stack1.push(temp.left);
                if (temp.right != null)
                    stack1.push(temp.right);
            }

            while (!stack2.empty()) {
                Node temp = stack2.pop();
                System.out.print("[" + temp.data + "] ");
            }
            System.out.println();
        }
    }
    public void delete(int n){
       
        Node parent=null,temp=root;
        while(temp!=null && temp.data!=n){

            parent=temp;
            if(n>temp.data){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }         
        }
        if(temp.left==null && temp.right==null){
            if(parent.data>n){
                
                parent.left=null;

            }
            else{
                parent.right=null;
            }
        }
        else if(temp.left!=null && temp.right==null){
            parent.left=temp.left;
        }
        else if(temp.right!=null && temp.left==null){
            parent.right=temp.right;
        }
        else{
            Node t = inOrderSuccessor(temp);
            temp.data=t.data; 
        }
    }

    public static Node inOrderSuccessor(Node temp){
        boolean rChild=true;
        Node parent=temp;
        temp=temp.right;
        if(temp.left!=null){
            rChild=false;
        }
        while(temp.left!=null){
            parent=temp;
            temp=temp.left;
        }
        if(rChild){
            parent.right=temp.right;

        }
        else{
            parent.left=temp.right;
        }
        return temp;
    }

    public static void main(String args[]){
        InsertIntoBinarySearchTree obj = new InsertIntoBinarySearchTree();
       
        obj.insert(6);
        obj.insert(8);
        obj.insert(9);
        obj.insert(3);
        
    
        obj.delete(9);
        obj.printInOrder();
        // obj.printPreOrder();
        // obj.printPostOrder();
    }
}