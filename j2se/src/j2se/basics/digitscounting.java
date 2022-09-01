package j2se.basics;

import java.util.Scanner;

public class digitscounting {
	public static void main(String[] args) {
		int num,count=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num!=0)
		{
			count++;
			num/=10;
		}
		System.out.println("Length = "+count);
	}
}
