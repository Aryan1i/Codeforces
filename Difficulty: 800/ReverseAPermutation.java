//Problem
    
    /*A permutation of length 𝑛
     is an array consisting of 𝑛
     distinct integers from 1
     to 𝑛
     in arbitrary order. For example, [2,3,1,5,4]
     is a permutation, but [1,2,2]
     and [1,3,4]
     are not permutations.
    
    You are given a permutation 𝑝
     of length 𝑛
    . You can perform the following operation exactly once:
    
    Choose two integers 𝑙,
     𝑟
     (1≤𝑙≤𝑟≤𝑛
    ).
    Reverse the segment [𝑙,𝑟]
     in the permutation 𝑝
    .
    Your task is to output the lexicographically maximum permutation that can be obtained by performing this operation. A permutation 𝑎
     is lexicographically greater than a permutation 𝑏
     if for the first position 𝑖
     where they differ, it holds that 𝑎𝑖>𝑏𝑖
    .
    Input
    Each test consists of several test cases. The first line contains a single integer 𝑡
     (1≤𝑡≤104
    ) — the number of test cases. The description of the test cases follows.
    
    The first line of each test case contains the number 𝑛
     (1≤𝑛≤2⋅105
    ).
    
    The second line of each test case contains 𝑛
     distinct integers 𝑝1,𝑝2,...,𝑝𝑛
     (1≤𝑝𝑖≤𝑛)
    .
    
    It is guaranteed that the sum of the values of 𝑛
     across all test cases does not exceed 2⋅105
    .
    
    Output
    For each test case, output the lexicographically maximum permutation that can be obtained with one operation.
    
    Example
    InputCopy
    4
    4
    3 2 1 4
    3
    3 1 2
    4
    4 3 2 1
    2
    2 1
    OutputCopy
    4 1 2 3 
    3 2 1 
    4 3 2 1 
    2 1 
    Note
    For the first test case, the best segment is [1,4]
    . After reversing, 𝑎=[4,1,2,3]
    . For the second test case, the best segment is [2,3]
    . After reversing, 𝑎=[3,2,1]
    .
    
    
    */

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
 
            int pos = 0;
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
                if (p[i] == n) pos = i;
            }
 
            // reverse from 0 to pos
            int l = 0, r = pos;
            while (l < r) {
                int temp = p[l];
                p[l] = p[r];
                p[r] = temp;
                l++;
                r--;
            }
 
            for (int x : p) System.out.print(x + " ");
            System.out.println();
        }
    }
}
