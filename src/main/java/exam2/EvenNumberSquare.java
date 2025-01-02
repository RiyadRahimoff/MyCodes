package exam2;
import java.util.ArrayList;

public class EvenNumberSquare {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.stream().forEach(print->{
            if(print%2!=0){
                System.out.println(Math.pow(print,2));
            }
        });
    }
}
