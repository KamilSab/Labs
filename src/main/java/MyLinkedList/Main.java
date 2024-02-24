package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(2);
        list.add(3);
        list.add(1);
        list.sort();
        for (int i = 0; i < list.count; ++i) {
            System.out.println(list.get(i));
        }
    }
}
