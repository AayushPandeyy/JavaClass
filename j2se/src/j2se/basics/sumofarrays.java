package j2se.basics;

import java.util.Scanner;

public class sumofarrays {
public static void main(String[] args) {
	int[] num = new int[5];
	int i,sum=0;
	Scanner sc= new Scanner(System.in);
	for(i=0;i<5;i++) {
		System.out.println("Enter number "+(i+1));
		num[i] = sc.nextInt();
		sum+=num[i];
	}
	System.out.println("The sum is: "+sum);


}
}
