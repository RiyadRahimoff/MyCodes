package generics;

import java.util.LinkedList;

public class HashmapGeneric<T, E> {
    LinkedList<T> key;//hashset
    LinkedList<E> value;

    public HashmapGeneric() {
        key = new LinkedList<>();
        value = new LinkedList<>();
    }

    public void put(T inKey, E inValue) {
        key.add(inKey);
        value.add(inValue);
    }

    public void get(T Key) {
        int count = 0;
        for (int i = 0; i < key.size(); i++) {
            if (Key.equals(key.get(i))) {
                System.out.println(value.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("null");
        }

    }

    public void clear() {
        key.clear();
        value.clear();
    }

    public boolean containsK(T Key) {

        for (int i = 0; i < key.size(); i++) {
            if (Key.equals(key.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsV(E value) {

        for (int i = 0; i < this.value.size(); i++) {
            if (value.equals(this.value.get(i))) {
                return true;
            }
        }
        return false;
    }

}

