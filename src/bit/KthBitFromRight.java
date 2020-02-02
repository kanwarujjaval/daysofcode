package bit;

public class KthBitFromRight {

    //check if kth bit si set in n
    static void isKthBit(int n, int k) {
        System.out.print(1 << (k - 1));
        if ((n & (1 << (k - 1))) != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

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
