package array;

public class TwoOddAppearanceInArray {

    static void oddAppearing(int[] arr) {
        int xor = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        int lastBit = xor & ~(xor - 1); // Find rightmost bit -

        /**
         * two get both odd appearing numbers
         */
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & lastBit) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + " " + res2);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        TwoOddAppearanceInArray.oddAppearing(arr);
    }
}
