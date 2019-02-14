package sorting;

//import java.util.Arrays;

public class QuickSort implements DefaultSorting /*, Cloneable*/ {
    @Override
    public int [ ] sort(int [ ] arr) throws Exception{
        if (arr.length < 2) throw new Exception("The array length must be more than 1");
        /*int [ ] coparr = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(Arrays.toString(coparr));*/
        int startIndex = 0;
        int endIndex = arr.length - 1;
        quicksort(arr, startIndex, endIndex);
        return arr;
    }

    /*public Quick_Sort clone() throws CloneNotSupportedException{

        return (Quick_Sort) super.clone();
    }*/

    private void quicksort(int [ ] arr, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while ((arr[i] <= arr[cur]) && i < cur) {
                i++;
            }
            while ((arr[cur] <= arr[j]) && j > cur) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quicksort(arr, start, cur);
        quicksort(arr, cur+1, end);
        //return arr;
    }
}
