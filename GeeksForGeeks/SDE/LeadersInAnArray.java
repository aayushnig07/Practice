//https://www.geeksforgeeks.org/leaders-in-an-array/

/*
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
Let the input array be arr[] and size of the array be size.*/

class LeadersInAnArray{
  public static void main(String []args){
    int [] arr = {16, 17, 4, 3, 5, 2};
    int length = arr.length;

    for(int i=0;i<length;i++){
      if(checkLeader(arr, i, length))
        System.out.println(arr[i]);
    }
  }
  //O(n2) complexity
  private static boolean checkLeader(int [] arr, int index, int length){
    int leader = arr[index];
    for(int i=index+1;i<length-1;i++){
      if(leader<arr[i]){
        return false;
      }
    }
    return true;
  }
}
