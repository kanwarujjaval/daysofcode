package recursion;

public class TailRecursiveFactorial {
    /**
     * @param n   number for factorial
     * @param val = 1
     * @return
     */
    static int fact(int n, int val) {
        if (n == 0) return val;
        return fact(n - 1, n * val);
    }

    public static void main(String[] args) {
        System.out.println(TailRecursiveFactorial.fact(3, 1));
    }
}
