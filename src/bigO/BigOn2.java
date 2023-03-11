package bigO;

public class BigOn2 {
    public static void main(String[] args) {
        //add each element of array to other elements, including itself
        int count = 0;
        int [] arr = {1, 4, 6, 4}; //1+1, 1+4, 1+6, 4+1, 4+4, 4+6, 6+1, 6+4, 6+6
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.println(arr[i] + arr[j]);
                count++;
            }
        }
        System.out.println("count: "+count);
    }
}
