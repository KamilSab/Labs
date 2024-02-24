package MyLinkedList;

public class DoubleLinkedList {

    private static class Element {
        int value;
        Element next;
        Element previous;

        public Element(int value) {
            this.value = value;
        }
    }

    private Element head;
    private Element last;
    private Element currElem;
    public int count = 0;

    public void add(int value) {
        Element newElem = new Element(value);
        if (head == null) {
            head = newElem;
        } else {
            last.next = newElem;
        }
        newElem.previous = last;
        last = newElem;
        count++;
    }

    public int get(int index) {
        if (index < count && index > -1) {
            currElem = head;
            for (int i = 0; i < index; ++i) {
                currElem = currElem.next;
            }
        }
        return currElem.value;
    }

    public void sort() {
        Element end = null;
        while (head.next != end) {
            currElem = head;
            while (currElem.next != end) {
                if (currElem.value > currElem.next.value) {
                    swap(currElem, currElem.next);
                } else {
                    currElem = currElem.next;
                }
            }
            end = currElem;
        }
    }

    private void swap(Element e1, Element e2) {
        if (e1 == null || e2 == null) {
            return;
        }

        Element prev1 = e1.previous;
        Element prev2 = e2.previous;

        if (prev1 != null) {
            prev1.next = e2;
        } else {
            head = e2;
        }

        if (prev2 != null) {
            prev2.next = e1;
        } else {
            head = e1;
        }

        Element helper = e1.next;
        e1.next = e2.next;
        e2.next = helper;
    }
}

