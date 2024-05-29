import java.util.Stack;
class Link{
	static Node head;
	static class Node{
		int value;
		Node next;
		Node(int n){
			value=n;
			next=null;
		}
	}
	static void insert(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
		}
		else{
			Node lastNode = head;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=mNode;
		}
	}
	// static void deleteAtlast(){
	// 	if(head==null){

	// 	}
	// 	else{
	// 		Node lastNode=head;
	// 		while(lastNode.next.next!=null){
	// 			lastNode=lastNode.next;
	// 		}
	// 		lastNode.next=null;
	// 	}
	// }

	static void delete(int n){
		Node lastNode = head;
		Node prev=null;
		if(lastNode.value==n){
			System.out.println("abc");
				head=lastNode.next;
		}
		else{
			while(lastNode.next!=null){
			 if(lastNode.value==n){
				prev.next=lastNode.next;
			System.out.println("matched");
			break;
			} 	
			prev=lastNode;
			lastNode=lastNode.next;	
			}
			if(lastNode.value==n){
				prev.next=null;
			}
		}
		
}

	static void display(){
		Link lastNode2=new Link();
		if(head==null){
			System.out.println("Empty");
		}
		else{
			System.out.print("\nLinked List :");
			Node lastNode = head;
			while(lastNode.next!=null){
				System.out.print(lastNode.value+" => ");
				lastNode=lastNode.next;
			}
			System.out.print(lastNode.value);
			
		}
	}
}

class LinkDemo{
	public static void main(String[] args) {
		// Stack<Integer> stack = new Stack<Integer>();
		Link obj = new Link();
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
		obj.insert(9);
		obj.insert(10);
		// obj.display();
		obj.insert(20);
		// obj.deleteAtlast();
		obj.delete(20);
		obj.display();
	}
}
