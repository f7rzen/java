package java.lab20;

import java.io.Serializable;
class Animal implements Serializable {
    //поля и методы для класса Animal
}
class Dog extends Animal {
    //поля и методы для класса Dog
}

class Cat extends Animal {
    //поля и методы для класса Dog
}

class Box<K , V extends Animal & Serializable, T extends Comparable<T>> {
    private K key;
    private V value;
    private T value2;

    public Box(K key, V value, T value2) {
        this.key = key;
        this.value = value;
        this.value2 = value2;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public void printClassNames() {
        System.out.println("Class of key: " + key.getClass());
        System.out.println("Class of value: " + value.getClass());
        System.out.println("Class of value2: " + value2.getClass());
    }
}

public class task1 {
    public static void main(String[] args) {
        Box<String, Dog, Float> box1 = new Box<>("Str", new Dog(), 3.5f);
        Box<String, Cat, Float> box2 = new Box<>("Str", new Cat(), 6.5f);

        box1.printClassNames();
        box2.printClassNames();
    }
}