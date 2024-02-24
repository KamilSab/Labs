package Tree;

public interface IBTree {
    void siftUp(Node node);
    void siftDown(Node node);
    void add(int value);
    int popRoot();
}
