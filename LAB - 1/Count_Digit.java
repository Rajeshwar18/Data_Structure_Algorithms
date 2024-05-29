import java.util.Scanner;
class CalculateDigits{
	int count=0;
	public int printCount(int n){
		if(n==0)
			return 0;
		else{
			return count+1+printCount(n/10);
		}
	}
}
public class Count_Digit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		if(n==0)
			System.out.println("Digits of number = 1");
		else{
			CalculateDigits cd = new CalculateDigits();
			int a = cd.printCount(n);
			System.out.println("Digits of number = "+a);
		}
			
	}
}