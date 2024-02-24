package Pizzeria;

public class Order {
    private Pizza pizzaType;
    private Client client;
    private Cook cook;
    private int orderNumber;
    private Status status;
    private String date;

    public Order(Pizza pizzaType, Client client, Cook cook, int orderNumber, Status status, String date) {
        this.pizzaType = pizzaType;
        this.client = client;
        this.cook = cook;
        this.orderNumber = orderNumber;
        this.status = status;
        this.date = date;
    }

    public void get() {
        System.out.print(pizzaType + " ");
        System.out.print(client.name + " ");
        System.out.print(cook.name + " ");
        System.out.print(orderNumber + " ");
        System.out.print(status + " ");
        System.out.print(date + " ");
    }
}
