package generics;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        HashmapGeneric<String, String> hashmapGeneric = new HashmapGeneric<>();

        hashmapGeneric.put("3", "Senan");
        hashmapGeneric.put("19", "Nihat");
        hashmapGeneric.put("6", "Riyad");
        System.out.println("----------------------------");
        hashmapGeneric.get("3");
        hashmapGeneric.get("19");
        System.out.println(hashmapGeneric.containsK("3"));
        System.out.println(hashmapGeneric.containsV("Rustem"));
        hashmapGeneric.clear();
        hashmapGeneric.get("3");
        hashmapGeneric.get("19");
        hashmapGeneric.get("4");

    }
}
