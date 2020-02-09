package recursion;

public class palindrome {
    static boolean isPal(char[] str, int s, int e) {
        if (s == e || s > e) return true;
        if (str[s] != str[e]) return false;
        return isPal(str, s + 1, e - 1);
    }

    public static void main(String[] args) {
        char[] str = {'a', 'b', 'c', 'b', 'a'};
        System.out.println(palindrome.isPal(str, 0, 4));
    }
}
