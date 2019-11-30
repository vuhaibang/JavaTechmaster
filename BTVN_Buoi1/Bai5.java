package BTVN_Buoi1;

public class Bai5 {
    public static void main(String[] args){
        // r from 1 to 5 ( 5 rows).
        for (byte r=1; r<6; r++){
            // Row n have n symbol.
            for (byte s=1; s<r; s++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
