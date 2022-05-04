
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// /https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/

/**
 * Given three arrays sorted in non-decreasing order, print all common elements
 * in these arrays.
 * 
 * Examples:
 * 
 * Input:
 * ar1[] = {1, 5, 10, 20, 40, 80}
 * ar2[] = {6, 7, 20, 80, 100}
 * ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
 * Output: 20, 80
 * 
 * Input:
 * ar1[] = {1, 5, 5}
 * ar2[] = {3, 4, 5, 5, 10}
 * ar3[] = {5, 5, 10, 20}
 * Output: 5, 5
 */

public class CommonElements {
    public static void main(String[] args) {
        returnCommonElementsList(new int[] { 1, 5, 5 }, new int[] { 3, 4, 5, 5, 10 }, new int[] { 5, 5, 10, 20 })
                .forEach(i -> System.out.print(i + " "));
    }

    private static List<Integer> returnCommonElementsList(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list1 = convertArraysToList(arr1);
        List<Integer> list2 = convertArraysToList(arr2);
        List<Integer> list3 = convertArraysToList(arr3);

        List<Integer> intersect = returnListIntersection(list1, list2);
        List<Integer> intersectFinal = returnListIntersection(list3, intersect);
        return intersectFinal;

    }

    private static List<Integer> returnListIntersection(List<Integer> list1, List<Integer> list2) {
        return list1.stream().filter(list2::contains).collect(Collectors.toList());
    }

    private static List<Integer> convertArraysToList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
