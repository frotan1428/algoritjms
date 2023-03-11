package mergeSort;

import qucikSort.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numberList = new int[1000000];
        for(int i = 0; i<numberList.length; i++){
            numberList[i] = random.nextInt(1000000);
        }

        int[] arr = {4, 3, 1, 2};
        System.out.println("======= Before Merge Sort ======");
        System.out.println(Arrays.toString(arr));
        System.out.println("======= After Merge Sort ======");
        MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
