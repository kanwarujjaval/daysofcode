package bit;

public class PowerOfTwo {

    boolean isPow2Naive(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0) return false;
            n = n / 2;
        }
        return true;
    }

    int countSetBit(int n) {
        int res = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

    boolean isPow2BitSet(int n) {
        return countSetBit(n) == 1;
    }

    boolean isPow2(int n) {
        // unset the only bit that is set for 2s powers
        // n=4
        //100(n) & 011(n-1) = 0
        if (n == 0) return false;
        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        PowerOfTwo pow = new PowerOfTwo();
        System.out.println(pow.isPow2Naive(16));
        System.out.println(pow.isPow2BitSet(16));
        System.out.println(pow.isPow2(256));
    }
}
