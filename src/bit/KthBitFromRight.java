package bit;

public class KthBitFromRight {

    //check if kth bit si set in n

    /**
     * Move one to the kth position by left shift one by (k-1)
     * & with the number
     * !=0 means is set
     *
     * @param n
     * @param k
     */
    static void isKthBit(int n, int k) {
        System.out.print(1 << (k - 1));
        if ((n & (1 << (k - 1))) != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    /**
     * Move kth bit to the rightmost by rightshift by (k-1)
     * & that bit with 1
     * 1 gives true
     * 0 gives false
     *
     * @param n Required Number
     * @param k The bit position
     */
    static void isKthBit2(int n, int k) {
        if (((n >> (k - 1)) & 1) == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        KthBitFromRight.isKthBit(n, k);
        KthBitFromRight.isKthBit2(n, k);
    }
}
