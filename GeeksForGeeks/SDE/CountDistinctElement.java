
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/count-distinct-elements-in-every-window-of-size-k/

/**
 * Given an array of size n and an integer k, return the count of distinct
 * numbers in all windows of size k.
 * 
 * Example:
 * 
 * Input: arr[] = {1, 2, 1, 3, 4, 2, 3};
 * k = 4
 * Output: 3 4 4 3
 * 
 * Explanation:
 * First window is {1, 2, 1, 3}, count of distinct numbers is 3
 * Second window is {2, 1, 3, 4} count of distinct numbers is 4
 * Third window is {1, 3, 4, 2} count of distinct numbers is 4
 * Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
 */
public class CountDistinctElement {

    public static void main(String[] args) {
      countDistinctElements(new int[] { 1, 2, 1, 3, 4, 2, 3 },4);
      countDistinctElements(new int[] { 1, 2, 4, 4 },2);

    }

    private static void countDistinctElements(int[] arr, int k) {
        int len = arr.length;
        HashMap<Integer, Set<Integer>> holdCount = new HashMap<>();
        for (Integer i = 0; i < len - k + 1; i++) {
            Set<Integer> set = null;
            for (Integer j = i; j < i + k; j++) {
                set = holdCount.get(i);
                if (set == null)
                    set = new HashSet<>();
                set.add(arr[j]);
                holdCount.put(i, set);
            }
            
        }
        holdCount.forEach((key,value)->{
            System.out.println(value.size());
        });
    }

}
