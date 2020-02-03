package bit;

public class countSetBit {
    static int countSet(int n) {
        int res = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                //last bit is set
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Set bits by simple method = " + countSetBit.countSet(11));
    }
}
