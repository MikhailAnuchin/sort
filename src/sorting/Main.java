package sorting;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // R = new Random_Array();
        int [ ]arr = RandomArray.initarr();

        //Integer[ ]arr = R.initArr();

        //int[ ]arr = {5, 2, 3, 1, 10, 4, 2, 9, 8, 5, 2, 3, 1, 10, 4, 2, 9, 8};
        System.out.println("not_sorted_arr"+Arrays.toString(arr));
        /*Integer[] intarr = new Integer[arr.length];
        for(int ctr = 0; ctr < arr.length; ctr++) {
            intarr[ctr] = Integer.valueOf(arr[ctr]); // returns Integer value*/
        int [ ] arr1 = arr.clone();
        int [ ] arr2 = arr.clone();
        int [ ] arr3 = arr.clone();
        int [ ] arr4 = arr.clone();
        //Integer [ ] arr1 = arr.clone();
        //Integer [ ] arr2 = arr.clone();


        long st, en;
        //st = System.nanoTime();
        //long start = System.currentTimeMillis();
        //Bubble_Sort a =  new Bubble_Sort();
        //a.Sort(arr);
        //System.out.println(Arrays.toString(a.Sort(arr)));
        en = System.nanoTime();

        //System.out.println("Bubble_Sort:"+Arrays.toString(arr)+String.format("%,12d",en-st) + " ns");
        //System.out.println(String.format("%,12d",en-st) + " ns");
        //long finish = System.currentTimeMillis();
        //long timeConsumedMillis = finish - start;
        //System.out.println(timeConsumedMillis);

        //b.Sort(arr);
        try {
            st = System.nanoTime();
            ShellSort a = new ShellSort();
            a.sort(arr1);
            en = System.nanoTime();
            System.out.println("Shell_Sort:"+Arrays.toString(arr1)+String.format("%,12d",en-st) + " ns");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        //System.out.println("arr1:"+Arrays.toString(arr));
        try {
            st = System.nanoTime();
            QuickSort b = new QuickSort();
            b.sort(arr2);
            en = System.nanoTime();
            System.out.println("Quick_Sort:"+Arrays.toString(arr2)+String.format("%,12d",en-st) + " ns");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        try {
            st = System.nanoTime();
            MergeSort c = new MergeSort();
            c.sort(arr3);
            en = System.nanoTime();
            System.out.println("Merge_Sort:"+Arrays.toString(arr3)+String.format("%,12d",en-st) + " ns");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        try {
            st = System.nanoTime();
            BubbleSort d = new BubbleSort();
            d.sort(arr4);
            en = System.nanoTime();
            System.out.println("Bubble_Sort:"+Arrays.toString(arr4)+String.format("%,12d",en-st) + " ns");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
