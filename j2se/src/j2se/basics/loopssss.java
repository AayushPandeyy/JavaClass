package j2se.basics;
import java.util.Scanner;

public class loopssss {

	public static void main(String[] args) {
		int i=1,pro=1,n;
		System.out.println("Enter a range of natural numbers: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(i<=n) {
			
			pro*=i;
			i++;
		}
		System.out.println("Factorial = "+pro);

	}

}
