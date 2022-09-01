package j2se.basics;

import java.util.Scanner;

public class binarytodecimal {
public static void main(String[] args) {
	int digit,pow=1,dec=0;
	System.out.println("Enter a binary: ");
	Scanner sc = new Scanner(System.in);
	digit = sc.nextInt();
	while(digit!=0)
	{
		int rem = digit%10;
		dec += rem * pow;
		pow*=2;
		digit/=10;
	}
	System.out.println(dec);

}
}
