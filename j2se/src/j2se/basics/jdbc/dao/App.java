package j2se.basics.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in); //to use it in product object initiation
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDao Pdao = new ProductDao();
		int i;
		char ch;
		long id;
		do {
		
		System.out.println("-----Main Menu-----");
		System.out.println("1.Add Product");
		System.out.println("2.View a product");
		System.out.println("3. View all products");
		System.out.println("4. Update a product");
		System.out.println("5. Delete a product");

		do {
			System.out.println("Choice: " );
			ch=sc.next().charAt(0);
		}while(!(Integer.parseInt(ch+"")<6 && Integer.parseInt(ch+"")>0));
		if(ch=='1') {
			Product p = new Product();
			System.out.println("Enter the product details: ");
			p = getProductDetails();
			i = Pdao.save(p);
			if(i==1) {
				System.out.println("Product added to the database:");
			}else {
				System.out.println("Task Failed.");
			}
		}else if(ch=='2') {
			Product p = new Product();
			System.out.println("Enter the id of the product: ");
			id = sc.nextLong();
			p = Pdao.getOne(id);
			System.out.println(p);
		}else if(ch=='3') {
			Product p =new Product();
			ArrayList<Product> pro = new ArrayList<>();
			pro = Pdao.getAll();
			for(Product stp:pro) {
				System.out.println(stp);
			}
			System.out.println("---------End of List---------");
			
		}else if(ch=='5') {
			Product p = new Product();
			System.out.println("Enter the id of the product you want to delete: ");
			id = sc.nextLong();
			p = Pdao.getOne(id);
			System.out.println(p);
			System.out.println("Confirm Delete? (y/n)");
			do {
				System.out.println("Do you want to continue: (y/n):");
				ch = sc.next().charAt(0);
				
			}while(!(ch=='y'||ch=='n'));
			if(ch=='y') {
				i = Pdao.delete(id);
				
				if(i==1) {
					System.out.println("Product Deleted.");
				}else {
					System.out.println("Task Failed.");
				
			}

		}}else if(ch=='4') {
			Product p = new Product();
			System.out.println("Enter the id of the product: ");
			id = sc.nextLong();
			p = Pdao.getOne(id);
			System.out.println(p);
			System.out.println("Enter the updated details: ");
			p = getProductDetails();
			p.setId(id);
			i = Pdao.update(p);
			if(i==1) {
				System.out.println("Record Updated.");
			}else {
				System.out.println("Task Failed.");
			}
		}
		

		do {
			System.out.println("Do you want to continue: (y/n):");
			ch = sc.next().charAt(0);
			
		}while(!(ch=='y'||ch=='n'));
	}while(ch=='y');
}

	private static Product getProductDetails() {
		Product p = new Product();
		System.out.println("Name: ");
		p.setName(sc.next());
		System.out.println("Manufacturer: ");
		p.setManufacturer(sc.next());
		System.out.println("Description: ");
		p.setDescription(sc.next());
		System.out.println("Price: ");
		p.setPrice(sc.nextFloat());
		System.out.println("Is available: ");
		p.setInStock(sc.next().equalsIgnoreCase("yes")?true:false);
		return p;
	}
}
