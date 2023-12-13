package java.lab21;

class AnyTypeArray<T> {
    private T[] array;

    public AnyTypeArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }
}

public class task1 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        AnyTypeArray<Integer> integerArray = new AnyTypeArray<>(intArray);
        System.out.println(integerArray.getElement(0));

        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        AnyTypeArray<Double> doubleTypeArray = new AnyTypeArray<>(doubleArray);
        System.out.println(doubleTypeArray.getElement(0));
    }
}
