package MyList;

public class Main {
    public static void main(String args[]) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.size());
        stack.output();
        stack.pop();
        stack.output();

        System.out.println();

        MySet<String> set = new MySet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("e");
        set.contains("d");
        set.asList();
        set.delete("c");
        set.asList();
    }
}
