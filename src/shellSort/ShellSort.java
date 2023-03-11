package shellSort;

public class ShellSort {
   public static void shellSort(int a[], int n) {

        /* Rearrange the array elements at n/2, n/4, ..., 1 intervals */
        for (int interval = n/2; interval > 0; interval /= 2) {

            for (int i = interval; i < n; i ++) {
            /* store a[i] to the variable temp and make  the  position empty */
                int temp = a[i];
                int j;
                for (j = i; j >= interval && a[j - interval] > temp; j -= interval)
                    a[j] = a[j - interval];

            /* put temp (the original a[i]) in its correct  position */
                a[j] = temp;
            }
        }
    }
}
