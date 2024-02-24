package MyList;

public interface List<T> {
    void add(T e) throws EmptyElementException;
    T get(int index) throws IndexOutOfBoundsException;
    int size();
    void delete(int index) throws IndexOutOfBoundsException;
    T pop();
}
