package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // use to set a date format witch we'll use on line 31.

		System.out.println("Enter client data:");
		System.out.println("Name:");
		String name = sc.nextLine();

		System.out.println("E-mail:");
		String email = sc.nextLine();

		System.out.println("Birth date: (DD/MM/YYYY)");
		Date birthDate = sdf.parse(sc.next()); // "parse" is used to convert the String entered by the user.

		Client client = new Client(name, email, birthDate); // create a client with data provided by the user.

		System.out.println("Enter order data: ");

		System.out.println("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client); //"new Date()" records the moment the user register the order.

		System.out.println("How many items to this order?");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();

			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			Product product = new Product(productName, productPrice); // create the product with data provided by the user.

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product); // create the order item with data provided by the user.

			order.addItem(orderItem); //OrderItem is a ArrayList on order part so, after creates the order item, we storage this information via ArrayList command.
		}

		System.out.println();
		System.out.println("Order sumary:");
		System.out.println(order);

		sc.close();
	}

}
