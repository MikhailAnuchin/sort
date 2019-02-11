package sorting;

//import java.util.Arrays;

public class Quick_Sort implements default_sorting /*, Cloneable*/ {
    @Override
    public int [ ] Sort(int [ ] arr) throws Exception{
        if (arr.length < 2) throw new Exception("The array length must be more than 1");
        /*int [ ] coparr = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(Arrays.toString(coparr));*/
        int startIndex = 0;
        int endIndex = arr.length - 1;
        quick_sort(arr, startIndex, endIndex);
        return arr;
    }

    /*public Quick_Sort clone() throws CloneNotSupportedException{

        return (Quick_Sort) super.clone();
    }*/

    private void quick_sort(int [ ] arr, int start, int end) {
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
        quick_sort(arr, start, cur);
        quick_sort(arr, cur+1, end);
        //return arr;
    }
}
