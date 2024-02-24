package Pizzeria;

public class OrdersList implements IOrderList {

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node first;
    Node curr;

    public OrdersList() {
        first = new Node(0);
        curr = first;
        for (int i = 1; i <= 10; ++i) {
            curr.next = new Node(i);
            curr = curr.next;
        }
        curr = first;
    }

    @Override
    public int next() {
        curr = curr.next;
        return curr.value;
    }
}
