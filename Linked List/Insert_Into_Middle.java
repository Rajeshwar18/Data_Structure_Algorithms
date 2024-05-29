class Link{
	static Node head=null;
	
	static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next = null;
		}
	}

	static void insertMiddle(){
		
	}

	static void insert(int m){
		Node last=null;
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			last=mNode;
		}
		else{
			int count=1;
			while(last.next!=null){
				last=last.next;
				count++;
			}
			
		}
	}
	 void display(){
		Node last=head;
		System.out.print("Linked List : ");
		while(last.next!=null){
			System.out.print(" "+last.value+" => ");
		}
		System.out.print(" "+last.value);
	}
}

class Insert_Into_Middle{
	public static void main(String[] args) {
		Link obj = new Link();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
	}
}