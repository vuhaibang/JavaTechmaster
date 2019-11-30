package BTVN_Buoi1;

public class Bai3 {
    public static void main(String[] args){
        // m:month, y:year
        int m=3, y=1990;
        System.out.printf("Trong tháng %s có: ", m);
        if (m==2&&(y%4==0)){
            System.out.print("29 ngày");
        }
        else if (m==2){
            System.out.print("28 ngày");
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.print("30 ngày");
        } else {
            System.out.print("31 ngày");
        }
    }
}
