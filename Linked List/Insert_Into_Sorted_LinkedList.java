import java.util.Scanner;
class Link{
	static Node head;
	static int temp;
	static class Node{
		int value;
		Node next;
		int temp;
		Node(int n){
			value=n;
			next=null;

	.	}
	}
	static void insert(int m){
		Node mNode = new Node(m);
		Node prev = null;
		if(head==null){
			head=mNode;
		}
		else{
			Node lastNode = head;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			prev=lastNode.next;
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
		Node prev = null;
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

	static void insert_into_sorted(int n){
		Node mNode = new Node(n);
		Node prev = null;
		if(head==null){
			head=mNode;
		}
		else{
			Node lastNode = head;
			while(lastNode.next!=null){
				if(lastNode.next.value<n){
					lastNode=lastNode.next;
				}
				else{
					mNode.next=lastNode.next;
					lastNode.next=mNode;
					break;
				}
				
			}
			prev=lastNode.next;
			// lastNode.next=mNode;
		}

	}

	static void sortLinkedList(){
		Node lastNode = head;
			Node next =null;
			while(lastNode!=null){
				next = lastNode.next;
				while(next!=null){
					if(next.value<lastNode.value){		
						temp = next.value;
						next.value = lastNode.value;
						lastNode.value = temp;
					}
					next=next.next;
				}
				lastNode = lastNode.next;	
			}
	}

	static void display(){
		Node lastNode=null;
		if(head==null){
			System.out.println("Empty");
		}
		else{
			System.out.print("\nLinked List :");
			
			lastNode=head;
			while(lastNode.next!=null){
				System.out.print(lastNode.value+" => ");
				lastNode=lastNode.next;
			}
			System.out.print(lastNode.value);	
		}
	}
}

class Insert_Into_Sorted_LinkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Link obj = new Link();
		System.out.print("Enter no. of LinkedList element : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element of LinkedList : ");	
			obj.insert(sc.nextInt());
		}
		obj.sortLinkedList();
		obj.insert_into_sorted(5);
		obj.display();
	}
}
