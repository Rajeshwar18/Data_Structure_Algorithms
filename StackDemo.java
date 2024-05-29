import java.util.Scanner;
public class StackDemo{
	public static int push(int array[],int top,int x){
		int a[]=new int[10];
		int j=0;
		for(int i=0;i<10;i++){
			a[i]=array[i];
		}
			if(top>10){
				System.out.println("StackOverflow");
				return 0;
			}
			else{
				top++;
				a[top]=x;
				j++;
				return a[top];
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]=new int[10];
		int top=-1,n;
		for(int i=0;i<10;i++){
			System.out.print("Enter element of index "+i+" : ");
			n=sc.nextInt();
			array[i]=push(array,top,n);
		}
		System.out.println("---------Print Array---------");
		for(int j=0;j<10;j++){
			System.out.println("Array element at index "+j+" is "+array[j]);
		}
		
	}
}
