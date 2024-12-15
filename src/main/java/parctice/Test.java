package parctice;

import phonesystem.Main;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.exceptions());
    }
    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before"; // before
                v.length(); // null oldugu ucun exception verir
                result += "after";
            } catch (NullPointerException e) {
                result += "catch"; //beforecatch
            } finally {
                result += "finally";//beforecatchfinally
            }
        } catch (Exception e) {
            result += "done";//beforecatchfinallydone
        }
        return result;
    }
}
