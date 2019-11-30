package Buoi2;

public class Bai3 {
    public static int sum_divisor(int input){
        if (input<2){
            return 0;
        }
        int result = 1;
        for (int s=2; s < Math.sqrt(input); s++){
            if (input%s==0){
                result += s;
                result += input/s;
            }
        }
        if (input%Math.sqrt(input)==0){
            result += Math.sqrt(input);
        }
        return result;
    }
    public static void main(String[] args){
        int input_a = 6, input_b = 6;
        if (sum_divisor(input_a)==input_b+1||sum_divisor(input_b)==input_a+1){
            System.out.print("Hai số là số hứa hôn!");
        } else {
            System.out.print("Hai số chưa có ý định kết hôn!");
        }
    }
}
