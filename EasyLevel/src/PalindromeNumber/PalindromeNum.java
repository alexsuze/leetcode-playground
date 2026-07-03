package PalindromeNumber;

public class PalindromeNum {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;
        String str = String.valueOf(x);
        String revStr;
        for (int i = 0; i < str.length() / 2; i++) {
            revStr = str.substring(str.length() - 1 - i);
            if (str.charAt(i) == revStr.charAt(0)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
