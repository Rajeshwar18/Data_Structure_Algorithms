class AVLTree{
Node root;
class Node{
int data,height;
Node left,right;
Node(int a){
data=a;
height=1;
left=right=null;
}
}
int getHeight(Node T) {
if(T==null) {
return 0;
}
else {
return T.height;
}
}
int getMax(int a,int b) {
if(a>b) {
return a;
}
else {
return b;
}
}
Node leftRotate(Node X) {
Node Y=X.right;
Node Z=Y.left;
Y.left=X;
X.right=Z;
X.height=getMax(getHeight(X.left),getHeight(X.right))+1;
Y.height=getMax(getHeight(Y.left),getHeight(Y.right))+1;
return Y;
}
int getBalance(Node N) {
if(N==null) {
return 0;
}
return (getHeight(N.left)-getHeight(N.right));
}
Node rightRotate(Node X) {
Node Y=X.left;
Node Z=Y.right;

Y.right=X;
X.left=Z;

X.height=getMax(getHeight(X.left),getHeight(X.right))+1;
Y.height=getMax(getHeight(Y.left),getHeight(Y.right))+1;

return Y;
}
Node insert(Node node,int a) {
Node nn=new Node(a);
if(node==null) {
node=nn;
return node;
}
else {
Node temp=node;
while(temp.left!=null || temp.right!=null) {
if(nn.data>temp.data && temp.right!=null) {
temp=temp.right;
}
else if(nn.data<temp.data && temp.left!=null) {
temp=temp.left;
}
else {
break;
}
}
if(nn.data>=temp.data) {
temp.right=nn;
}
else {
temp.left=nn;
}
node.height=getMax(getHeight(node.left), getHeight(node.right))+1;
int balance = getBalance(node);

if(balance>1 && a <node.left.data) {
return rightRotate(node);
}
if(balance<-1 && a>node.right.data) {
return leftRotate(node);
}
if(balance>1 && a>node.left.data) {
node.left=leftRotate(node.left);
return rightRotate(node);
}
if(balance<-1 && a<node.right.data) {
node.right=rightRotate(node.right);
return leftRotate(node);
}
}
return node;
}
void inorder(Node node) {
if(node!=null) {
inorder(node.left);
System.out.println(node.data+" ");
inorder(node.right);
}
}

}
public class TestAVL{
public static void main(String [] args) {
AVL a=new AVL();
a.root=a.insert(a.root, 10);
a.root=a.insert(a.root, 20);
a.root=a.insert(a.root, 30);
a.root=a.insert(a.root, 40);
a.root=a.insert(a.root, 50);
a.root=a.insert(a.root, 25);
a.root=a.insert(a.root, 32);
a.inorder(a.root);
}
}
