package BTVN_Buoi1;

public class Bai8 {
    public static void main(String[] args){
        byte[] array = {2, 3, 4, 5};
        byte result;
        result = array[0];
        for (byte number : array){
            if (number <  result) {
                result = number;
            }
        }
        System.out.printf("Số nhỏ nhất là %s", result);
    }
}
