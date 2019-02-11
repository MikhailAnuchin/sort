package sorting;

public interface default_sorting {
    default int[ ] Sort(int[ ] arr) throws Exception{
        if (arr.length < 2) throw new Exception("The array length must be more than 1");
        boolean swapped;
        for(int i =0; i < arr.length-1; i++){
            swapped = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        return arr;
    }
    //int[ ] Sort(int[ ] arr);
}
