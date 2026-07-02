package TwoSum;

import java.util.Arrays;

public class RunTest {
     static int[] num1 = {2,7,11,15};
     static int target1 = 9;

     public static void main(String[] args){
         TwoSum res = new TwoSum();
         int[] out = new int[0];
         out = res.twoSum(num1,target1);
         System.out.println(Arrays.toString(out));
     }
}
