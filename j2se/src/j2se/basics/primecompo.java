package j2se.basics;
import java.util.Scanner;
public class primecompo {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int i;
		for (i = 2; i<=num/2; i++) {
			if(num%i==0)
			{
				break;
			}
			
		}
		if(i==(num/2)+1)
		{
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
	}
}
