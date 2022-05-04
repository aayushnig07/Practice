import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/find-four-elements-that-sum-to-a-given-value-set-2/

/**
 * Given an array of integers, find anyone combination of four elements in the
 * array whose sum is equal to a given value X.
 * 
 * For example,
 * 
 * Input: array = {10, 2, 3, 4, 5, 9, 7, 8}
 * X = 23
 * Output: 3 5 7 8
 * Sum of output is equal to 23,
 * i.e. 3 + 5 + 7 + 8 = 23.
 */
public class FourElementsWithAGivenSum {
    public static void main(String[] args) {
        find4Elements(new int[]{10, 2, 3, 4, 5, 9, 7, 8}, 23);
    }


    private static void find4Elements(int []arr, int k){
        HashMap<Integer, List<int[]>> map = populateAllPossiblePairs(arr);
        //try try try

    }

    private static HashMap<Integer, List<int[]>> populateAllPossiblePairs(int[] arr) {
        HashMap<Integer, List<int[]>> map=new HashMap<>();
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int sum = arr[i]+arr[j];
                if(map.containsKey(sum)){
                    List<int[]> entry = map.get(sum);
                    entry.add(new int[]{arr[i],arr[j]});
                    map.put(sum, entry);
                }
                else{
                    List<int[]> entry=new ArrayList<>();
                    entry.add(new int[]{arr[i],arr[j]});
                    map.put(sum, entry);
                }
            }
        }
        return map;

    }
}
