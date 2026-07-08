package LongestCommonPrefix;

public class TestDemo {
    public static void main(String[] args){
        Solution str = new Solution();
        String[] testcase1 = {"flower","flow","flight"};
        String[] testcase2 = {"dog","racecar","car"};
        String[] testcase3 = {"a","ab"};
        String[] testcase4 = {"flower","flower","flower","flower"};
        String[] testcase5 = {"a","b"};
        String[] testcase6 = {"a"};
        String res1 = str.longestCommonPrefix(testcase1);
        System.out.println("輸出: " + res1);
        System.out.println("----------------------");
        String res2 = str.longestCommonPrefix(testcase2);
        System.out.println("輸出: " + res2);
        System.out.println("----------------------");
        String res3 = str.longestCommonPrefix(testcase3);
        System.out.println("輸出: " + res3);
        System.out.println("----------------------");
        String res4 = str.longestCommonPrefix(testcase4);
        System.out.println("輸出: " + res4);
        System.out.println("----------------------");
        String res5 = str.longestCommonPrefix(testcase5);
        System.out.println("輸出: " + res5);
        System.out.println("----------------------");
        String res6 = str.longestCommonPrefix(testcase6);
        System.out.println("輸出: " + res6);
    }
}
