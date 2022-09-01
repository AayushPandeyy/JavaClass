package j2se.basics;

import java.util.Scanner;

public class decimaltobinary {
public static void main(String[] args) {
	System.out.println("Enter a decimal value: ");
	int dec;
	Scanner sc =  new Scanner(System.in);
	dec = sc.nextInt();
	int revBin = 1;
	while(dec!=0)
	{
		int rem = dec%2;
		revBin = revBin*10+rem;
		dec/=2;
	}
	int bin=0;
	while(revBin>1)
	{
		int rem = revBin%10;
		bin = bin*10+rem;
		revBin/=10;
	}
//	bin/=10;
	System.out.println(bin);

	
}
}
