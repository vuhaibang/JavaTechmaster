package BTVN_Buoi1;

public class Bai1 {
    public static void hello(){
        System.out.println("Tôi là Bánh Khúc đây!");
    }
    public static void find_min(){
        byte a=9, b=8;
        byte c = (a<b)?a:b;
        System.out.println(c);
    }
    public static void compute_circle(){
        // Radius
        byte r = 2;
        float ares = (float) (r*r*3.14);
        float cir = (float) (2*3.14*r);
        System.out.print("Diện tích hình tròn bằng: ");
        System.out.println(ares);
        System.out.print("Chu vi hình tròn bằng: ");
        System.out.println(cir);
    }
    public static void main(String[] args){
        hello();
        find_min();
        compute_circle();
    }
}
