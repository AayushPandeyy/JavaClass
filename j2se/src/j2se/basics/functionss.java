package j2se.basics;

import java.util.Scanner;

public class functionss {
public static void main(String[] args) {
	int n,sum;
	System.out.println("Enter the range: ");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	sum=add(n);
	System.out.println("Sum = "+sum);
}

static int add(int n) {
	int sum = 0;
	while(n!=0) {
		sum+=n;
		n--;
	}
	return sum;
}
}
