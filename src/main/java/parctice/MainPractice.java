package parctice;

import generics.GenericStack;

public class MainPractice {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Peek: " + intStack.peek());
        System.out.println("Size: " + intStack.size());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Size: " + intStack.size());
    }
}
