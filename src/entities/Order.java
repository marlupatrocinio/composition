package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // use to set a date format.

	private Date moment;
	private OrderStatus status;

	private Client client; // import client class.

	private List<OrderItem> order = new ArrayList<>(); // we create a list of items in a specific order so we can storage this information and sum it later.

	public Order() {
		// in this case, we create a default constructor because it allows the class to be instantiated without any arguments being passed in.
	}

	public Order(Date moment, OrderStatus status, Client client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		order.add(item);
	}

	public void removeItem(OrderItem item) {
		order.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem item : order) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); //allows you to build and modify a string efficiently, without creating a new object each time you make a change.
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : order) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}