package j2se.basics;
import java.util.Scanner;

public class ControlStatements {
	public static void main(String[] args) {
		char op;
		System.out.println("Cafe Menu: ");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("d. Cafe Latte");
		System.out.println("e. Hot Chocolate");
		Scanner sc = new Scanner(System.in);
		op = sc.next().charAt(0);
		if(op=='a') {
			System.out.println("You have chosen Americano.");
		}else if(op=='b') {
			System.out.println("You have chosen Mochaccino.");
		}else if(op=='c') {
			System.out.println("You have chosen Cappuccino.");
		}else if(op=='d') {
			System.out.println("You have chosen Cafe Latte.");
		}else if(op=='e') {
			System.out.println("You have chosen Hot Chocolate.");
		}else {
			System.out.println("No such option available.");
		}

		
			
	}
}

