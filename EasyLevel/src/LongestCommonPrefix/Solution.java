package LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest = Arrays.stream(strs)
                .min(Comparator.comparingInt(String::length))
                .orElse(null);

        String[] SearchArray = Arrays.stream(strs).filter(s -> !s.equals(shortest)).toArray(String[]::new);

        if(SearchArray.length == 0){
            return shortest;
        } else{
            for (int i = 0; i < shortest.length(); i++){
                char c = shortest.charAt(i);
                for (int j = 0; j < SearchArray.length; j++){
                    if(c != SearchArray[j].charAt(i)){
                        return shortest.substring(0 , i);
                    }
                }
            }
        }
        return shortest;
    }
}
