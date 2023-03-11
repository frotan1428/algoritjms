package bubbleSort;

import insertionSort.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortRunner {

    public static void main(String[] args) {

        // do this after first running
        Random random = new Random();
        int [] numberList = new int[1000];
        for(int i = 0; i<numberList.length; i++){
            numberList[i] = random.nextInt(10000);
        }

        int[] arr = {4, 3, 1, 2};
        System.out.println("======= Before Bubble Sort ======");
        System.out.println(Arrays.toString(arr));
        System.out.println("======= After Bubble Sort ======");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
