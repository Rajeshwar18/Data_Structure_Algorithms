class Method_Implement_Demo{
	static int a[]=new int[10];
	static int top=-1;
	public static void push(int n){
		if(top>=10){
			System.out.println("Stack Overflow");
		}
		else{
			a[++top]=n;
		}
	}
	public static int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			return a[top--];
		}
	}
	public static int peek(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			return a[top];
		}
	}
	public static int peep(int i){
		if(top-i+1<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			return a[top-i+1];
		}
	}
	public static void change(int i,int n){
		if(top-i+1<0){
			System.out.println("Stack Underflow");
		}
		else{
			a[top-i+1]=n;
		}
	}
	public static void display(){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
class Method_Implement{
	public static void main(String[] args) {
		Method_Implement_Demo mid=new Method_Implement_Demo();
		mid.push(5);
		mid.push(10);
		mid.push(15);
		mid.push(10);
		mid.push(14);
		mid.push(11);
		mid.push(12);
		mid.push(20);
		mid.push(30);
		mid.push(40);
		mid.pop();
		mid.peek();
		mid.peep(1);
		mid.change(1,2);
		mid.display();
	}
}

