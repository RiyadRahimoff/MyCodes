package exam2;

import java.util.ArrayList;

public class ReverseWords {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<>();
        words.add("Salam");
        words.add("Riyad");
        words.add("Necesen");
        words.stream().forEach(print->{
            for(int i=1;i<=print.length();i++){
                System.out.print(print.charAt(print.length() - i));
            }
            System.out.println();
        });

}
}
