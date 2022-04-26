//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

/*
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers 
that has the largest sum.  
Lets take the example:
    {-2, -3, 4, -1, -2, 1, 5, -3}*/

public class KandaneAlgorithm {
    public static void main(String[] args) {
        kandaneAlgo(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
        kandaneAlgo(new int[]{2, 3, 4, -1, -2, 1, 5, -3});
        
    }

    private static void kandaneAlgo(int [] arr){
        int length = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<length-1;i++){
            int sum=0;
            for(int j=i;j<length;j++){
                sum=sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }

        System.out.println(max);

    }
    
}
