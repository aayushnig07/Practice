import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
/*
Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on. 

Examples: 

Input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

Input: arr[] = {1, 2, 3, 4, 5, 6} 
Output: arr[] = {6, 1, 5, 2, 4, 3} 
*/

public class RearrangeArrayInMaxMin {
    public static void main(String[] args) {
        arrangeMinMax(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}.length);
    }

    private static void arrangeMinMax(int []arr, int length){
        int []newArr = new int[length];
        int smallIndex = 0;
        int largeIndex = length-1;
        int k=0;
        while(smallIndex<largeIndex){
            newArr[k] = arr[largeIndex];
            k++;
            newArr[k] = arr[smallIndex];
            k++;
            smallIndex++;
            largeIndex--;
        }
        if(smallIndex==largeIndex){
            newArr[k] = arr[largeIndex];
        }

        Arrays.stream(newArr).forEach(System.out::print);
    }
    
}
