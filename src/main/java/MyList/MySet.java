package MyList;

public class MySet<T> {
    int copasity = 100;
    int size = 0;
    Object[] list = new Object[copasity];

    public void add(T e) {
        for (int i = 0; i < size; ++i) {
            if (list[i].equals(e)) {
                return;
            }
        }
        list[size++] = e;
    }

    public void asList() {
        ListImplAsArray<T> arList = new ListImplAsArray();
        for (int i = 0; i < size; ++i) {
            try {
                arList.add((T) list[i]);
            } catch (EmptyElementException e) {
                throw new RuntimeException(e);
            }
        }
        arList.output();
    }

    public void contains(T e) {
        for (int i = 0; i < size; ++i) {
            if (list[i].equals(e)) {
                System.out.println("Элемент " + e + " есть в множестве");
            }
        }
    }

    public void delete(T e) {
        for (int i = 0; i < size; ++i) {
            if (list[i].equals(e)) {
                for (int j = i; j < size; ++j) {
                    list[j] = list[j + 1];
                }
                size--;
                return;
            }
        }
        System.out.println("Такого элемента нет в множестве");
    }
}
