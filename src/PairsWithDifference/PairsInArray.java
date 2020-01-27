package PairsWithDifference;

//No of distinct pairs with diff equal to k
public class PairsInArray {

    static int pairsWithDiff(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    System.out.print(arr[i] +" ");
                    System.out.println(arr[j]);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 2, 5, 9, 1, 3};
        int k = 4;
        System.out.println(pairsWithDiff(arr, k));
    }
}
