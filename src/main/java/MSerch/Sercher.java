package MSerch;

public class Sercher {
    public int serch(int[] array, int sought, int mini) throws InvalidArgumentExeption {
        if (array.length == 0) {
            throw new InvalidArgumentExeption("Массив не может быть пустым");
        }

        if (sought <= 0) {
            throw new InvalidArgumentExeption("Введенное число должно быть больше нуля");
        }

        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 0) {
                throw new InvalidArgumentExeption("Массив не должен соблюдать отрицательных чисел");
            }
        }

        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                throw new InvalidArgumentExeption("Элементы массива должны идти по возрастанию");
            }
        }

        if (mini > sought) {
            throw new InvalidArgumentExeption("Введенное число долдно быть больше минимального числа в массиве");
        }

        boolean flag = false;
        int res = 0;
        for (int i = sought - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == i) {
                    res = array[j];
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return res;
    }
}
