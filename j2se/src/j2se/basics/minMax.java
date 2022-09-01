package j2se.basics;

public class minMax {
public static void main(String[] args) {
	int[] num = {7,5,6,9,2};
	int max = num[0];
	int min = num[0];
	for(int i=1;i<5;i++) {
		if(max<num[i]) {
			max=num[i];
		}
		if(min>num[i]) {
			min=num[i];
		}
	}
	System.out.println("Max value: "+max);
	System.out.println("Min value: "+min);
}
}
