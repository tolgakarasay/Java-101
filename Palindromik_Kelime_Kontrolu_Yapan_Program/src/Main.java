public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
    }

    static boolean isPalindrome(String str) {
        int i = 0;
        int n = str.length();

        while (i < n / 2) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
