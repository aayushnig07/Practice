import java.util.Arrays;
import java.util.OptionalInt;

//https://www.geeksforgeeks.org/find-the-missing-number/
/*You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
*/

public class MissingElement {
    public static void main(String []arg){
        missingElement(new int[]{1,4,6,2,7,3});

    }
    private static void missingElement(int arr[]){
        int[] newArr = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[arr[i]-1] = arr[i];
        }
        int index = Arrays.stream(newArr).filter(i->0==newArr[i]).findFirst().orElse(-1);
        System.out.print(index+1);
    }
    
}
