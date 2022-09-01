package j2se.basics;

import java.util.Scanner;

public class sumofn {
	public static void main(String[] args) {
		int i=1,sum=0,n;
		System.out.println("Enter a range of natural numbers: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(i<=n) {
			
			sum+=i;
			i++;
		}
		System.out.println("Sum = "+sum);

	}

}
