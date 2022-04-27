//https://www.geeksforgeeks.org/first-element-occurring-k-times-array/

/**
 * Given an array of n integers. The task is to find the first element that occurs k number of times. If no element occurs k times the print -1. The distribution of integer elements could be in any range.
Examples: 

Input: {1, 7, 4, 3, 4, 8, 7}, 
k = 2 
Output: 7 
Both 7 and 4 occur 2 times. 
But 7 is the first that occurs 2 times. 
 */

import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public class FirstElementThatOccurKtimes {

    public static void main(String[] args) {
        System.out.println(findFirstOccurance(new int[]{1, 7, 4, 3, 4, 8, 7}, 2).orElseThrow(null));
    }

    private static Optional<Entry<Integer, Integer>> findFirstOccurance(int []arr, int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element:arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1); 
            }
            else{
                map.put(element, 1);
            }
        }
        return map.entrySet().stream().filter(key->key.getValue()==k).findFirst();
 
    }
    
}
