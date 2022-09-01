package j2se.basics;

import java.util.Scanner;

public class primecomposite {
public static void main(String[] args) {
	int n;
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int res = primeComp(n);
	if(res==1) {
		System.out.println("Prime");
	}else {
		System.out.println("Composite");
	}
}

static int primeComp(int n) {
	int i;
	for(i=2;i<=(n/2);i++) {
		if(n%i==0) {
			break;
			
		}
	}
	if(i==(n/2)+1) {
		return 1;
	}else {
		return 0;
	}
	
	
}
}
