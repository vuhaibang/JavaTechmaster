package BTVN_Buoi1;

public class Bai4 {
    public static void main(String[] args){
        byte a = 33;
        // check a
        if (a==1){
            System.out.println("Số a không phải số nguyên tố");
        }
        else if (a<3) {
            System.out.println("Số a là số nguyên tố");
        }
        byte b = (byte) Math.sqrt(a);
        for (byte s=2; s-1 < b; s++) {
            if (a % s == 0) {
                System.out.println("Số a không phải số nguyên tố");
                System.out.printf("Số a chia hết cho %s", s);
                break;
            } else if (s == b) {
                System.out.println("Số a là số nguyên tố");
            }
        }
    }
}
