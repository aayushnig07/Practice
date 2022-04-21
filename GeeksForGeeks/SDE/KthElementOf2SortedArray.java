import java.util.Arrays;

//https://www.geeksforgeeks.org/k-th-element-two-sorted-arrays/
/*
Given two sorted arrays of size m and n respectively, you are tasked with finding the element that would be at the k’th position of the final sorted array.

Examples: 

Input : Array 1 - 2 3 6 7 9
        Array 2 - 1 4 8 10
        k = 5
Output : 6
Explanation: The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
 */

public class KthElementOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 7};
        int[] arr2 = { 1, 2, 3, 7};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int k = 5;
        kthElement(arr1, arr2, len1, len2, k);
    }

    private static void kthElement(int arr1[], int arr2[], int len1, int len2, int k) {
        int[] newArr = new int[len1 + len2];
        int length = len1 + len2;
        int n1 = 0;
        int n2 = 0;
        int i=0;
        for (i = 0; i < length; i++) {
            if(n1==len1 || n2==len2)
                break;
            if(arr1[n1]<arr2[n2]){
                newArr[i] = arr1[n1];
                n1++;
            }
            else{
                newArr[i]=arr2[n2];
                n2++;
            }
        }
        if(n2!=len2){
            fillRemainingElements(newArr,i, arr2,n2,len2,k);
        }
        if(n1!=len1){
            fillRemainingElements(newArr,i, arr1,n1,len1,k);
        }

    }

    private static void fillRemainingElements(int []newArr,int index, int []arr, int start, int length,int k){
        for(int i=start;i<length;i++){
            newArr[index]=arr[i];
            index++;
        }

        Arrays.stream(newArr).forEach(System.out::print);

        System.out.println("Final answer!!=="+newArr[k-1]);
    }
}
