package BTVN_Buoi1;

public class Bai9 {
    // function test
    public static void test(byte x){
        byte sqrt = (byte) Math.sqrt(x);
        byte result = 1;
        for (byte i=2; i<sqrt+1; i++){
            if(x%i==0){
                result += i;
                if (x/i!=i){
                result += x/i;
                }
            }
        }
        if (result==x){
            System.out.print(x);
            System.out.println(" là số hoàn hảo");
        }
    }

    // Loop in array
    public static void main(String[] args){
        byte[] array = {2, 3, 4, 5, 6};
        for (byte x: array){
            test(x);
        }
    }
}
