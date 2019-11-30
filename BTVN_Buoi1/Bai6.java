package BTVN_Buoi1;

public class Bai6 {
    public static void main(String[] args){
        // input and covert input
        long n = 23231;
        String s = Long.toString(n);
        // Loop from (length - 1) to 1.
        int len = s.length() - 1;
        for (; len>0; len--){
            System.out.print(s.charAt(len));
            System.out.print(", ");
        }
        // Print first digit
        System.out.print(s.charAt(0));
        System.out.print(".");
    }
}
