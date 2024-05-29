class AllMethodsOfQueue{
	static int front=-1,rear=-1,temp;
	static int tempForEnque=0;
	static int array[]=new int[5];
	public static void enque(int n){
		if(rear>=4){
			if(front>0 && front!=tempForEnque && flag){
				enque2(n);
			}
			else{
				rear=5;
				System.out.println("Queue Overflow");
				flag=false;
			}		
		}
		else{
			if(rear==-1)
				front=0;
			rear++;
			array[rear]=n;
		}
	}
	public static void enque2(int m){
		if(front>0 && front!=tempForEnque && flag){
			if(tempForEnque<=rear){
			array[tempForEnque]=m;
			tempForEnque++;
			rear=tempForEnque;
			}
		}
		else{
			
			flag=false;
		}	
	}
	public static int deque(){
		if(front>rear || rear==-1){
			System.out.println("Queue Underflow");
			return 0;
		}
		else{
			temp=front;
			front++;
			return array[temp];
		}
	}
	public static void display(){
		if(front>=rear){
			for(int j=front;j<5;j++){
				System.out.println("Queue element : "+array[j]);
				System.out.println("Loop2");		
			}
			for(int k=0;k<rear;k++){
				System.out.println("Queue element : "+array[k]);
			}
		}
		else{
			for(int i=front;i<=rear;i++){
				System.out.println("Queue element : "+array[i]);
				System.out.println("Loop");

			}
		}
		
	}
}
class Circular{
	public static void main(String[] args) {
		AllMethodsOfQueue obj=new AllMethodsOfQueue();
		obj.enque(1);
		obj.enque(2);
		obj.enque(3);
		obj.enque(4);
		obj.enque(5);
		System.out.println("Deque 1st element is : "+obj.deque());
		
		
		obj.enque(6);
		System.out.println("Deque 2nd element is : "+obj.deque());
		// obj.enque(7);
		obj.display();
	}
}