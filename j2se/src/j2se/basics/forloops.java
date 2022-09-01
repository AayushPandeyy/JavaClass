package j2se.basics;

import java.util.Scanner;

public class forloops {
	public static void main(String[] args) {
		int num,a=0,b=1,c;
		System.out.println("Enter a range: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(a<=num) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
//			num--;
		}
	}
}
