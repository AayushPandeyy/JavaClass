package j2se.basics;
import java.util.Scanner;

public class TernaryOperators {
	public static void main(String[] args) {
		System.out.println("Enter password: ");
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();
		String access = pw.equalsIgnoreCase("password")?"allowed":"blocked";
		System.out.println("You are "+access);
		
		
		
	}
}
