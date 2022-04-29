import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

//https://www.geeksforgeeks.org/find-the-element-that-appears-once-in-a-sorted-array/
/**
 * Given a sorted array in which all elements appear twice (one after one) and one element appears only once. Find that element in O(log n) complexity.

Example: 

Input:   arr[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8}
Output:  4

Input:   arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8}
Output:  8
 */

public class ElementAppearsOnce {
    public static void main(String[] args) {
        System.out.println(elementAppearsOnce(new int[]{1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8}).get().getKey());
    }

    private static Optional<Entry<Integer, Integer>> elementAppearsOnce(int []arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int element:arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);
            }
            else{
                map.put(element, 1);
            }
        }
        return map.entrySet().stream().filter(key->key.getValue()==1).findFirst();
    }
}
