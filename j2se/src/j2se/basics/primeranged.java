package j2se.basics;
import java.util.Scanner;
public class primeranged {
public static void main(String[] args) {
	int i;
	System.out.println("Enter a number: ");
	int range = new Scanner(System.in).nextInt();
	for(int num=2;num<=range;num++)
	{
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				break;
			}
		}
		if(i==(num/2)+1) {
			System.out.println(num);
		}
	}

}
}
