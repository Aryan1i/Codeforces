//Problem

/* Pashmak and Flowers
time limit per test1 second
memory limit per test256 megabytes
Pashmak decided to give Parmida a pair of flowers from the garden. There are n flowers in the garden and the i-th of them has a beauty number bi. Parmida is a very strange girl so she doesn't want to have the two most beautiful flowers necessarily. She wants to have those pairs of flowers that their beauty difference is maximal possible!

Your task is to write a program which calculates two things:

The maximum beauty difference of flowers that Pashmak can give to Parmida.
The number of ways that Pashmak can pick the flowers. Two ways are considered different if and only if there is at least one flower that is chosen in the first way and not chosen in the second way.
Input
The first line of the input contains n (2 ≤ n ≤ 2·105). In the next line there are n space-separated integers b1, b2, ..., bn (1 ≤ bi ≤ 109).

Output
The only line of output should contain two integers. The maximum beauty difference and the number of ways this may happen, respectively.

Examples
InputCopy
2
1 2
OutputCopy
1 1
InputCopy
3
1 4 5
OutputCopy
4 1
InputCopy
5
3 1 2 3 1
OutputCopy
2 4
Note
In the third sample the maximum beauty difference is 2 and there are 4 ways to do this:

choosing the first and the second flowers;
choosing the first and the fifth flowers;
choosing the fourth and the second flowers;
choosing the fourth and the fifth flowers.
*/

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        Arrays.sort(arr);
        
        long minVal = arr[0];
        long maxVal = arr[n - 1];
        
        if (minVal == maxVal) {
            long ways = (long) n * (n - 1) / 2;
            System.out.println(0 + " " + ways);
            return;
        }
        
        long countMin = 0, countMax = 0;
        
        for (long x : arr) {
            if (x == minVal) countMin++;
            if (x == maxVal) countMax++;
        }
        
        long diff = maxVal - minVal;
        long ways = countMin * countMax;
        
        System.out.println(diff + " " + ways);
    }
}
