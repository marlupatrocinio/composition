package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter client data:");
		System.out.println("Name:");
		String name = sc.next();
		System.out.println("E-mail:");
		String email = sc.next();
		System.out.println("Birth date: (DD/MM/YYYY)");
		String date = sc.next();
		System.out.println("Enter order data: ");
		System.out.println("Status:");
		String status = sc.next();
		System.out.println("How many items to this order?");
		int items = sc.nextInt();
		
		

	}

}
