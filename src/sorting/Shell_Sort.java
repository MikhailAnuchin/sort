package sorting;

public class Shell_Sort implements default_sorting {
    @Override
    public int [ ] Sort(int [ ] arr) throws Exception {
        if (arr.length < 2) throw new Exception("The array length must be more than 1");
        int h = 1;
        while (h*3 < arr.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(arr, h);
            h = h/3;
        }
        return arr;
    }

    private void hSort(int[] arr, int h) {
        //int length = arr.length;
        for (int i = h; i < arr.length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (arr[j] < arr[j - h]) {
                    int temp = arr[j];
                    arr[j] = arr[j-h];
                    arr[j-h] = temp;
                    //swap(arr, j, j - h);
                }
                else
                    break;
            }
        }
    }
    /*private static void swap (int [] arr, int i, int j){
        int temp = arr[i];
        arr [i] = arr [j];
        arr [j] = temp;
    }*/
}
