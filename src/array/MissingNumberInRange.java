package array;

public class MissingNumberInRange {
    /**
     * find 1 missing number k from array for rang 1..n
     * if each number occurs only once
     */
    static int findMissing(int[] arr) {
        int res = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
            res = res ^ (i + 1);
        }
        res = res ^ (i + 1);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        System.out.println(MissingNumberInRange.findMissing(arr));
    }
}
