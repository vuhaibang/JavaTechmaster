package BTVN_Buoi1;

public class Bai7 {
    public static void main(String[] args){
        byte dog, chicken;
        // dog + chicken = 36 and dog * 4 + chiken * 2 = 100
        for (dog = 0; dog < 37; dog++){
            chicken = (byte) (36 - dog);
            // test dog * 4 + chicken* 2 = 100
            byte test = (byte) (dog*4 + chicken*2);
            if (test ==100){
                System.out.printf("Số chó bằng:%s", dog);
                System.out.println();
                System.out.printf("Số gà bằng:%s", chicken);
            }
        }
    }
}
