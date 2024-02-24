package MyList;

public class ListImplAsLinkedList<T> implements List<T> {

    private static class Element<T> {
        T value;
        Element<T> next;
        public Element(T value) {
            this.value = value;
        }
    }

    private Element<T> head;
    private Element<T> last;
    private Element<T> currElem;
    public int count = 0;

    @Override
    public void add(T e) throws EmptyElementException {
        Element<T> newElem = new Element<T>(e);
        if (head == null) {
            head = newElem;
        } else {
            last.next = newElem;
        }
        last = newElem;
        count += 1;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < count && index > -1) {
            currElem = head;
            for (int i = 0; i < index; ++i) {
                currElem = currElem.next;
            }
        }
        return currElem.value;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        Element<T> h = head;
        for (int i = 0; i < index - 1; ++i) {
            h = h.next;
        }
        h.next = h.next.next;
        count -= 1;
    }

    @Override
    public T pop() {
        T lastEl = last.value;
        Element<T> h = head;
        while (h.next != last) {
            h = h.next;
        }
        last = h;
        count -= 1;
        return lastEl;
    }

    public void output() {
        currElem = head;
        for (int i = 0; i < count; i++) {
            System.out.print(currElem.value + " ");
            currElem = currElem.next;
        }
        System.out.println();
    }
}
