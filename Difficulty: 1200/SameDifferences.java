    //Problem
    
    /*D. Same Differences
    time limit per test2 seconds
    memory limit per test256 megabytes
    You are given an array 𝑎
     of 𝑛
     integers. Count the number of pairs of indices (𝑖,𝑗)
     such that 𝑖<𝑗
     and 𝑎𝑗−𝑎𝑖=𝑗−𝑖
    .
    
    Input
    The first line contains one integer 𝑡
     (1≤𝑡≤104
    ). Then 𝑡
     test cases follow.
    
    The first line of each test case contains one integer 𝑛
     (1≤𝑛≤2⋅105
    ).
    
    The second line of each test case contains 𝑛
     integers 𝑎1,𝑎2,…,𝑎𝑛
     (1≤𝑎𝑖≤𝑛
    ) — array 𝑎
    .
    
    It is guaranteed that the sum of 𝑛
     over all test cases does not exceed 2⋅105
    .
    
    Output
    For each test case output the number of pairs of indices (𝑖,𝑗)
     such that 𝑖<𝑗
     and 𝑎𝑗−𝑎𝑖=𝑗−𝑖
    .
    
    Example
    InputCopy
    4
    6
    3 5 1 4 6 6
    3
    1 2 3
    4
    1 3 3 4
    6
    1 6 3 4 5 6
    OutputCopy
    1
    3
    3
    10
    
    */

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            HashMap<Long, Long> map = new HashMap<>();
            long ans = 0;
 
            for (int i = 0; i < n; i++) {
                long val = a[i] - i;
 
                if (map.containsKey(val)) {
                    ans += map.get(val);
                }
 
                map.put(val, map.getOrDefault(val, 0L) + 1);
            }
 
            System.out.println(ans);
        }
    }
}
