package j2se.basics;

public class matrixmultiply {
public static void main(String[] args) {
	int[][] matA = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] matB = {{9,8,7},{6,5,4},{3,2,1}};
	int[][] matP = new int[3][3];
	int i,j,k;
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			matP[i][j]=0;
			for(k=0;k<3;k++) {
				matP[i][j] += matA[i][k] * matB[k][j];
			}
			System.out.print(matP[i][j]+"\t");
		}
		System.out.println();
		
	}
}
}
