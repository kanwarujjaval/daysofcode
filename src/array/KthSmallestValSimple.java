package array;

//find Kth smallest value in array

import java.util.Arrays;

public class KthSmallestValSimple {

    public static int kthSmalles(Integer[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{12, 32445, 123, 435, 67, 234, 34};
        int k = 2;
        System.out.print(kthSmalles(arr, k));
    }

}
