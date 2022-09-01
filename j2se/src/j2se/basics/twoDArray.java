package j2se.basics;

public class twoDArray {
public static void main(String[] args) {
	int[][] matA = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] matB = {{9,8,7},{6,5,4},{3,2,1}};
	int[][] sum = new int[3][3];
	int i,j;
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			sum[i][j]+=matA[i][j]+matB[i][j];
		}
	}
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			System.out.print(sum[i][j]+"\t");
		}
		System.out.println();
	}
}
}
