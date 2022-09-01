package j2se.basics;

import java.util.Scanner;

public class matrrixinputMultiply {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int r1,c1,r2,c2,i,j,k;
	System.out.println("Enter the order of first matrix: ");
	r1 = sc.nextInt();
	c1 = sc.nextInt();
	System.out.println("Enter the order of second matrix: ");
	r2 = sc.nextInt();
	c2 = sc.nextInt();
	System.out.println("The order of first matrix is "+r1+"X"+c1);
	System.out.println("The order of second matrix is "+r2+"X"+c2);
	int[][] matA = new int[r1][c1];
	int[][] matB = new int[r2][c2];
	int[][] matP = new int[r1][c2];
	if(c1!=r2) {
		System.out.println("The matrices cannot be multiplied.");
	}else {
		System.out.println("Enter the elements of first matrix: ");
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++) {
				System.out.print("A["+i+"]["+j+"]");
				matA[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Enter the elements of second matrix: ");
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++) {
				System.out.print("B["+i+"]["+j+"]");
				matB[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Printing Matrix A:");
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++) {
				System.out.print(matA[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Printing Matrix B:");
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++) {
				System.out.print(matB[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Multiplication result: ");
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				matP[i][j] = 0;
				for(k=0;k<c1;k++) {
					matP[i][j]+=matA[i][k] * matB[k][j];
				}
				System.out.print(matP[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
}
