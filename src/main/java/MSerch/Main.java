package MSerch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Сколько элементов в массиве?");
            int count = scanner.nextInt();
            int[] array = new int[count];
            int mini = 10000000;
            for (int i = 0; i < count; ++i) {
                array[i] = scanner.nextInt();
                if (array[i] < mini) {
                    mini = array[i];
                }
            }
            System.out.println("К какому числу надо найти минимальное ближайшее?");
            int sought = scanner.nextInt();
            Sercher s = new Sercher();
            System.out.println(s.serch(array, sought, mini));
        } catch (InvalidArgumentExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
