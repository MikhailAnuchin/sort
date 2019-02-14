package sorting;

import java.util.Arrays;

public class MergeSort implements DefaultSorting {
    @Override
    public int [ ] sort(int [ ] arr) throws Exception {
        if (arr.length < 2) throw new Exception("The array length must be more than 1");
        /*int [ ] coparr = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(Arrays.toString(coparr));*/
        sorting(arr);
        return arr;
    }
    private void sorting (int [ ] arr){
        if (arr.length > 1) {
            int q = arr.length/2;

//changed range of leftArray from 0-to-q to 0-to-(q-1)
            int[] leftArray = Arrays.copyOfRange(arr, 0, q);
//changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(arr, q, arr.length);

            sorting(leftArray);
            sorting(rightArray);

            merge(arr,leftArray,rightArray);
        }
    }

    /*public Merge_Sort clone() throws CloneNotSupportedException{

        return (Merge_Sort) super.clone();
    }*/

    private void merge(int[] arr, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    arr[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    arr[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        arr[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                //if (ri >= r.length) {
                    while (li < l.length) {
                        arr[i] = l[li];
                        li++;
                        i++;
                    }
                //}
            }
        }
        //return arr;
    }
}
