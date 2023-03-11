import bubbleSort.BubbleSort;
import insertionSort.InsertionSort;
import mergeSort.MergeSort;
import qucikSort.QuickSort;
import selectionSort.SelectionSort;
import shellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class CompareAlgorithms {

    public static void main(String[] args) {

       // int [] orderedArray = createOrderedArray(10000);
        int [] unOrderedArray = createRandomArray(100000);
        int [] unOrderedArray1 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int [] unOrderedArray2 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int [] unOrderedArray3 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int [] unOrderedArray4 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int [] unOrderedArray5 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int [] unOrderedArray6 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);


        long startTime;
        long endTime;
        double estimatedTime;

        //Insertion Sort
        startTime = System.currentTimeMillis();
       InsertionSort.insertionSort(unOrderedArray);
       // InsertionSort.insertionSort(orderedArray);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Insertion Sort = "+ estimatedTime);


        //Selection Sort
        startTime = System.currentTimeMillis();
        SelectionSort.selectionSort(unOrderedArray1);
       // SelectionSort.selectionSort(orderedArray);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Selection Sort = "+ estimatedTime);

        //Bubble Sort
        startTime = System.currentTimeMillis();
       BubbleSort.bubbleSort(unOrderedArray2);
       // BubbleSort.bubbleSort(orderedArray);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Bubble Sort = "+ estimatedTime);

        //Quick Sort
        startTime = System.currentTimeMillis();
       QuickSort.quickSort(unOrderedArray3, 0, unOrderedArray3.length-1);
      //  QuickSort.quickSort(orderedArray, 0, orderedArray.length-1);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Quick Sort = "+ estimatedTime);

        //Merge Sort
        startTime = System.currentTimeMillis();
       MergeSort.mergeSort(unOrderedArray4);
       // MergeSort.mergeSort(orderedArray);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Merge Sort = "+ estimatedTime);

        //Shell Sort
        startTime = System.currentTimeMillis();
        ShellSort.shellSort(unOrderedArray5,unOrderedArray5.length);
        //ShellSort.shellSort(orderedArray,orderedArray.length);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Shell Sort = "+ estimatedTime);


        //Arrays Sort
        startTime = System.currentTimeMillis();
        Arrays.sort(unOrderedArray);

        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime)/1000;
        System.out.println("Arrays Sort = "+ estimatedTime);

    }

    //to generate Array with random elements
    public static int [] createRandomArray(int numOfElement){
        Random random = new Random();
        int [] numberList = new int[numOfElement];
        for(int i = 0; i<numberList.length; i++){
            numberList[i] = random.nextInt(10000);
        }
        return numberList;
    }

    //to generate ordered array
    public static int [] createOrderedArray(int numOfElement){
        int [] arr = new int [numOfElement];
        for(int i =0; i< arr.length; i++){
            arr[i] = i;
        }
        return arr;
    }

}
