package j2se.basics;
import java.util.Scanner;
public class powerofnumber {
	public static void main(String[] args) {
		System.out.println("Enter digit and power: ");
	int num = new Scanner(System.in).nextInt();
	int pow = new Scanner(System.in).nextInt();
	int pro=1;
	int i=0;
	while(i<pow)
	{
		pro *=num;
		i++;
	}
	System.out.println(pro);
}
}
