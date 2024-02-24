package MyList;

public class MyStack<T> {

    private static class Elem<T> {
        T value;
        Elem<T> next;

        public Elem(T value) {
            this.value = value;
        }
    }

    Elem<T> head;
    int size;

    public void push(T e) {
        Elem<T> newElem = new Elem<T>(e);
        if (head == null) {
            head = newElem;
        } else {
            newElem.next = head;
            head = newElem;
        }
        size++;
    }

    public void pop() {
        System.out.println("Удалили вершину, которая имеет значение " + head.value);
        head = head.next;
        size--;
    }

    public int size() {
        return size;
    }

    public void output() {
        Elem<T> currElem = head;
        for (int i = 0; i < size; ++i) {
            System.out.print(currElem.value + " ");
            currElem = currElem.next;
        }
        System.out.println();
    }
}
