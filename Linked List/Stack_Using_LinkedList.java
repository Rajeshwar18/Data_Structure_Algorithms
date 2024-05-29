import java.util.Scanner;

class Link{
	static Node head;
	static Node top=null;
	static Node temp;
	static class Node{
		int value;
		Node next;
		Node(int n){
			value=n;
			next=null;
		}
	}

	public void push(int n){
			top = insert(n);
	}
	public int pop(){
		if(top==null){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			temp=top;
			top = delete(top.value);
			return temp.value;
		}		
	}
	static Node insert(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			return head;
		}
		else{
			Node lastNode = head;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=mNode;
			return mNode;
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
	static Node delete(int n){
		Node lastNode = head;
		Node prev=null;
		if(lastNode.value==n){
			// System.out.println("abc");
				head=lastNode.next;
				return head;
		}
		else{
			while(lastNode.next!=null){
			 if(lastNode.value==n){
				prev.next=lastNode.next;
				System.out.println("matched");
				// return prev;
				} 	
				prev=lastNode;
				lastNode=lastNode.next;	
				// return prev;
			}
			if(lastNode.value==n){
				prev.next=null;
				// return prev;
			}
			return prev;
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

class Stack_Using_LinkedList{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Link obj = new Link();
		System.out.print("Enter no. of Stack element : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element of Stack : ");	
			obj.push(sc.nextInt());
		}

		System.out.println("Popped Element : "+obj.pop());
		System.out.println("Popped Element : "+obj.pop());
		System.out.println("Popped Element : "+obj.pop());

		obj.display();
		// System.out.println("Popped Element : "+obj.pop());
		// System.out.println("Popped Element : "+obj.pop());
		// System.out.println("Popped Element : "+obj.pop());

		
	}
}
