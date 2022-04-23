import java.util.HashMap;

//https://www.geeksforgeeks.org/check-if-two-arrays-are-equal-or-not/
/*
Given two given arrays of equal length, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain the same set of elements, arrangements (or permutation) of elements may be different though.

Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal. 

Examples : 

Input  : arr1[] = {1, 2, 5, 4, 0};
         arr2[] = {2, 4, 5, 0, 1}; 
Output : Yes
*/

class Check2ArrayEquality {
    public static void main(String[] args) {
        System.out.println(checkArrayEquality(new int[] { 1, 2, 5, 4, 0 }, new int[] { 2, 4, 5, 0, 9 }));
    }

    private static boolean checkArrayEquality(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        if (len1 == len2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : arr1) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else
                    map.put(i, 1);
            }

            for (int i : arr2) {
                if (!map.containsKey(i))
                    return false;
                else
                    map.put(i, map.get(i) - 1);

            }
            return map.entrySet().stream().allMatch(i -> (i.getValue() == 0));
        } else
            return false;
    }
}