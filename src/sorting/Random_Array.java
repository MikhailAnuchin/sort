package sorting;

import java.util.Random;

public class Random_Array implements Cloneable {
    public static int ARRAY_LENGTH = 30;
    private static int[] arr = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static int[ ] initArr() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            arr[i] = generator.nextInt(100);
        }
        //return arr;
        /*Integer[] intarr = new Integer[arr.length];
        for(int ctr = 0; ctr < arr.length; ctr++) {
            intarr[ctr] = Integer.valueOf(arr[ctr]); // returns Integer value
        }*/
        return arr;

    }
    public Random_Array clone() throws CloneNotSupportedException{

        return (Random_Array) super.clone();
    }
}
