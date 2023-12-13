package java.lab21;

import java.util.ArrayList;
import java.util.List;

class ArrayConverter<T> {
    public List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}

public class task2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayConverter<Integer> intConverter = new ArrayConverter<>();
        System.out.println(intConverter.convertArrayToList(intArray));

        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        ArrayConverter<Character> charConverter = new ArrayConverter<>();
        System.out.println(charConverter.convertArrayToList(charArray));
    }
}
