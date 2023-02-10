package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Enter client data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("E-mail:");
		String email = sc.nextLine();
		System.out.println("Birth date: (DD/MM/YYYY)");
		Date date = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		System.out.println("Status:");
		String status = sc.nextLine();
		Order order = new Order(date, OrderStatus.valueOf(status));
		
		System.out.println("How many items to this order?");
		int items = sc.nextInt();

		for (int i = 1; i < items; i++) {
			System.out.println("Enter item #" + i + " data");
			System.out.println("Prduct name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderitem = new OrderItem(quantity, price);
			order.addItem(orderitem);
		}

		System.out.println("Order sumary:");
		
	}

}
