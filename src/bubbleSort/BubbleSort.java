package bubbleSort;

public class BubbleSort {

    public static void bubbleSort(int [] arr){
        boolean swapped = false;
        do{
            swapped = false; // to avoid infinitive loop
            for(int i = 1; i<arr.length; i++){
                if(arr[i-1]> arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true; //if any element swapped, we need to check one more time
                }
            }
        }while (swapped);
    }


}
