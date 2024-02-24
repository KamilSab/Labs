package MyList;

public class ListImplAsArray<T> implements List<T> {
    int copasity;
    Object[] list;
    int size;

    public ListImplAsArray() {
        copasity = 100;
        list = new Object[copasity];
        size = 0;
    }
    public void add(T e) throws EmptyElementException {
        if (size < 100) {
            list[size] = e;
            size++;
        }
        else {
            copasity *= 2;
            Object[] newList = new Object[copasity];
            for (int i = 0; i < size; ++i) {
                newList[i] = list[i];
            }
            list = newList;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException {
        return (T) list[index];
    }

    public int size() {
        return size;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        list[index] = null;
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        --size;
    }

    public T pop() {
        return (T) list[--size];
    }

    public void output() {
        for (int i = 0; i < size; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
