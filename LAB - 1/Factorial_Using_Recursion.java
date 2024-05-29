import java.util.Scanner;
class CalculateFactorial{
	int fact=1;
	public int printFactorial(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*printFactorial(n-1);
		}
	}
}
public class Factorial_Using_Recursion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		CalculateFactorial fact1 = new CalculateFactorial();
		int answer=fact1.printFactorial(n);
		System.out.println("Factorial = "+answer);
	}
}