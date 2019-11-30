package BTVN_Buoi1;

public class Bai2 {
    public static void main(String[] args){
        // x^2 - 2x - 3 = 0
        int a=1, b= -2, c=-3;
        // check a=b=c=0 and a=b=0, c!=0
        if (a==0&&b==0){
            if(c==0){
                System.out.println("Phương trình có vô số nghiệm!");
            }
            else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
        // compute delta
        else{
            double delta = b*b - 4*a*c;
            if (delta<0){
                System.out.println("Phương trình vô nghiệm!");
            }
            else if (delta==0){
                float x = -b/(float) (2*a);
                System.out.print("Phương trình có 1 nghiệm duy nhất: x = ");
                System.out.println(x);
            }
            else {
                double x1 = (-b - Math.sqrt(delta))/(2*a);
                double x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.print("x1 = ");
                System.out.println(x1);
                System.out.print("x2 = ");
                System.out.print(x2);
            }
        }
    }
}
