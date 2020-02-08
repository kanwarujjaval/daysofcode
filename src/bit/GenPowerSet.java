package bit;

import static java.lang.Math.pow;

public class GenPowerSet {

    static void printPowerSet(char[] str, int length) {
        int powSize = (int) pow(2, length);
        for (int counter = 0; counter < powSize; counter++) {
            for (int j = 0; j < length; j++) {
                if ((counter & (1 << j)) != 0) {
                    // left shift, multplies number by 2
                    System.out.print(str[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};
        printPowerSet(set, 3);
    }
}
