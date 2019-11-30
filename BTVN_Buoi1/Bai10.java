package BTVN_Buoi1;

public class Bai10 {
    public static void main(String[] args){
        // initial array
        byte[] array = {4, 3, 4, 2, 6};
        // coumpute lenght array
        int len = array.length;
        //Loop in loop (1) --> (2).
        byte sw = (byte) (len - 1);
        // (2) If loop (1) not any swap break loop(2).
        while (sw!=0){
            sw = 4;
            // (1) Loop from 0 to (lenght - 2). If array[s] > array[s+1] swap
            for (byte s=0; s < len - 1; s++){
                if(array[s] > array[s+1]){
                    byte a = array[s];
                    byte b = array[s+1];
                    array[s] = b;
                    array[s+1] = a;
                }
                else{
                    sw--;
                }
            }
        }
        // Print array
        for (byte s=0; s < len; s++){
            System.out.print(array[s]);
        }
    }
}
