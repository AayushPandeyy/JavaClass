package j2se.basics;

public class selectionSort {
public static void main(String[] args) {
	int[] num = {7,5,6,2,9};
	int i,j;
	for(i=0;i<5;i++) {
		for(j=i+1;j<5;j++) {
			if(num[i]>num[j]) {
				num[i]+=num[j];
				num[j] = num[i]-num[j];
				num[i]-=num[j];
			}
		}
		System.out.print(num[i]+"\t");
	}
	
}
}
