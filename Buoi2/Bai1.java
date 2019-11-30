package Buoi2;

public class Bai1 {
    public static void main(String[] args){
        long[] input = {1, 2, 3, 4, 5, 6};
        long result=0;
        for(long a: input){
            if(a%5==0){
                result +=a;
            }
        }
        System.out.print(result);
    }
}
