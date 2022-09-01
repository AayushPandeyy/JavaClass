package j2se.basics;

import java.util.Scanner;

public class arrayysss {
public static void main(String[] args) {
	int[] num = {1,2,3,4,5};
	int[] arr = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 number: ");
	for(int i=0;i<5;i++) {
		arr[i] = sc.nextInt();
	}
	for(int j=0;j<5;j++) {
		System.out.println(arr[j]);
	}
	int marks[] = new int[13];
	for(int i=0;i<13;i++) {
		System.out.println("Enter the marks of "+(i+1)+"th student: ");
		marks[i] = sc.nextInt();
	}
	for(int i=0;i<13;i++) {
		System.out.println("The marks obtained by "+(i+1)+"th student is: "+marks[i]);
	}
}
}
