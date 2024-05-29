class AllMethodsOfQueue{
	static int front=-1,rear=-1;
	static int array[]=new int[100];
	public static void enque(int n){
		if(rear>=99){
			System.out.println("Queue Overflow");
		}
		else{
			if(rear=-1)
				front=0;
			rear++;
			array[rear]=n;
		}
	}
	public static int deque(){
		if(rear<=0){
			System.out.println("Queue Underflow");
		}
		else{
			return array[front];
			front++;
		}
	}
	public static void display(){
		for(int i=front;i<=rear;i++){
			System.out.println("Queue element : "+array[front]);
		}
	}
}
class ExecuteAllMethodsOfQueue{
	public static void main(String[] args) {
		AllMethodsOfQueue obj=new AllMethodsOfQueue();
		obj.enque(5);
		obj.enque(6);
		obj.display();
	}
}