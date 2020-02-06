package array;

public class OddAppearanceInArray {
    /**
     * Find the number that occurs an odd number of times
     */
    static int findOdd(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] OddOccurence = {1, 4, 5, 7, 5, 3, 4, 5, 7, 1, 3};
        System.out.println(OddAppearanceInArray.findOdd(OddOccurence));
    }
}
