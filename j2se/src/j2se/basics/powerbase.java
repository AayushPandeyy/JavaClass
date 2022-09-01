package j2se.basics;

import java.util.Scanner;

public class powerbase {
public static void main(String[] args) {
	int b,p,res;
	System.out.println("Enter the base: ");
	Scanner sc = new Scanner(System.in);
	b = sc.nextInt();
	System.out.println("Enter the power: ");
	p = sc.nextInt();
	res = power(b,p);
	System.out.println("Result: "+res);
	
}

static int power(int b, int p) {
	int r=1;
	while(p!=0) {
		r*=b;
		p--;
	}
	return r;
}
}
