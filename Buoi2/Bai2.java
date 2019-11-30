package Buoi2;

public class Bai2 {
    public static void main(String[] args){
        long input = 123456789;
        long result = 0;
        do {
            result += input%10;
            input /= 10;
        } while (input!=0);
        System.out.print(result);
    }
}
