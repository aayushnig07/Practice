import java.util.OptionalLong;
import java.util.stream.LongStream;

//https://practice.geeksforgeeks.org/problems/product-of-primes5328/1
/*
Given two numbers L and R (inclusive) find the product of primes within this range. Print the product modulo 109+7. If there are no primes in that range you must print 1.

Example 1:

Input: L = 1, R = 10
Output: 210
Explaination: The prime numbers are 
2, 3, 5 and 7.
 */

 class ProductOfPrimesAayush{
     public static void main(String[] args) {
         System.out.println(productOfPrimes(1, 20));
     }

     static long productOfPrimes(long a, long b){
         OptionalLong result = LongStream.rangeClosed(a, b).filter(i->isPrime(i)).reduce((x,y)->x*y);
         return result.getAsLong()%10000007;

     }

     private static boolean isPrime(long n){
         if(n==1)
            return false;

         boolean result = LongStream.rangeClosed(2, n/2).noneMatch(i->n%i==0);
        return result;
     }
 }