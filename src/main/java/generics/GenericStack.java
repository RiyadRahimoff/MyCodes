package generics;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T peek() {
        for (T array : stack) {
            return stack.getLast();
        }
        return null;
    }

    public T pop() {
        for (T array : stack) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < stack.size(); i++) {
            for (int i1 = 0; i1 < stack.size(); i1++) {
                count++;
            }
            return count;
        }
        return 0;
    }
}

