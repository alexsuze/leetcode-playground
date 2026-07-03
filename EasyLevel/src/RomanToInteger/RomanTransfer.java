package RomanToInteger;

import java.util.Arrays;

public class RomanTransfer {
    public int romanToInt(String s) {
        String[] roman = {"I","V","X","L","C","D","M"};
        String[] num = {"1","5","10","50","100","500","1000"};
        String[] str = s.split("");
        int[] res = new int[str.length];
        int sum = 0;
        System.out.println(Arrays.toString(str));
        for(int i = 0; i < str.length; i++){
            int index = Arrays.asList(roman).indexOf(str[i]);
            res[i] = Integer.parseInt(num[index]);
            if(i != 0){
                if(res[i] > res[i-1]){
                    res[i-1] = -res[i-1];
                }
            }
        }
        sum = Arrays.stream(res).sum();
        return sum;
    }
}
