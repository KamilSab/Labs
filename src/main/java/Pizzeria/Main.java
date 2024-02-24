package Pizzeria;

public class Main {
    public static void main(String[] args) {
        OrdersList ordersList = new OrdersList();

        Client client1 = new Client("Kamil", Gender.Male);
        Client client2 = new Client("Anna", Gender.Female);
        Client client3 = new Client("Polina", Gender.Female);

        Cook cook1 = new Cook("Pablo", Gender.Male);
        Cook cook2 = new Cook("Margarita", Gender.Female);

        Order order1 = new Order(Pizza.Margarita, client1, cook1, ordersList.next(), Status.Unready, "11 may");
        order1.get();
        System.out.println();
        Order order2 = new Order(Pizza.Margarita, client1, cook1, ordersList.next(), Status.Unready, "11 may");
        order2.get();
        System.out.println();
        Order order3 = new Order(Pizza.Margarita, client1, cook1, ordersList.next(), Status.Unready, "11 may");
        order3.get();
        System.out.println();
    }
}
