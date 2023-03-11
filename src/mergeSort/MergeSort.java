package mergeSort;

public class MergeSort {
    public static void mergeSort(int [] arr){

        //get length of arr
        int arrLength = arr.length;

        //if the length of arr is 1 then return
        if(arrLength<2){
            return;
        }

        //divide arr into to subarrays
        int midIndex = arrLength/2;
        int [] leftHalf =new int[midIndex];

        int[] rightHalf = new int [arrLength - midIndex];

        // fill left array
        int i = 0; //it will be faster for large elements
        for(  i = 0; i< midIndex; i++){
            leftHalf[i] =arr[i];
        }

        //fill rightHalf
        int j = 0;
        for(j=midIndex ; j<arrLength; j++){
            rightHalf[j-midIndex] = arr[j];
        }

        //call the method recursively to divide left and right arrays until we get one element
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        //merge the arrays
        merge(arr, leftHalf, rightHalf);

    }

    private static void merge(int [] arr, int[] leftHalf, int[] rightHalf){

        //define length of leftHalf and rightHalf
        int leftSize = leftHalf.length;
        int rightSize= rightHalf.length;

        //3 pointers for the arrays
        int i = 0, j= 0, k = 0;

        while(i<leftSize && j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            } else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        //if any element left in leftHalf
        while (i<leftSize){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        //if any element left in rightHalf
        while (j<rightSize){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }

    }
}
