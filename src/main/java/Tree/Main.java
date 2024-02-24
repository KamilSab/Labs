package Tree;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {2, 12, 3, 0, 15, 6, 21, -4};
        BTree tree = new BTree();
        for (int n : inputArray) {
            tree.add(n);
        }
    }
}
