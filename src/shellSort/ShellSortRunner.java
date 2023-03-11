package shellSort;

import mergeSort.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class ShellSortRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numberList = new int[1000000];
        for(int i = 0; i<numberList.length; i++){
            numberList[i] = random.nextInt(1000000);
        }

        int[] arr = {4, 3, 1, 2,-3};
        System.out.println("======= Before Shell Sort ======");
        System.out.println(Arrays.toString(arr));
        System.out.println("======= After Shell Sort ======");
        ShellSort.shellSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
