package exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GirlBoyName {
    public static void main(String[] args) {
        Map<String, List<String>> namesMap = new HashMap<>();

        List<String> boysNames = new ArrayList<>();
        boysNames.add("Nihad");
        boysNames.add("Togrul");
        boysNames.add("Riyad");

        List<String> girlsNames = new ArrayList<>();
        girlsNames.add("Aysel");
        girlsNames.add("Zeyneb");
        girlsNames.add("Leyla");

        namesMap.put("Oğlan", boysNames);
        namesMap.put("Qız", girlsNames);

        namesMap.forEach((gender, names) -> {
            System.out.println(gender + " adları:");
            names.forEach(System.out::println);
            System.out.println();
        });
    }
}
