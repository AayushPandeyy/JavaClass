package j2se.basics;

public class arraysorting {
public static void main(String[] args) {
	int[] arr = {5,4,3,2,1};
	int i,j;
	for(i=0;i<4;i++) {
		for(j=0;j<4;j++) {
			if(arr[j]>arr[j+1]) {
				arr[j]+=arr[j+1];
				arr[j+1] = arr[j]-arr[j+1];
				arr[j]-=arr[j+1];
			}
		}
		
	}
	for(i=0;i<5;i++) {
		System.out.print(arr[i]+"\t");
	}
}
}
