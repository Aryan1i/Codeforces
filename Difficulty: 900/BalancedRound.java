//Problem
    
    /*You are the author of a Codeforces round and have prepared 𝑛
     problems you are going to set, problem 𝑖
     having difficulty 𝑎𝑖
    . You will do the following process:
    
    remove some (possibly zero) problems from the list;
    rearrange the remaining problems in any order you wish.
    A round is considered balanced if and only if the absolute difference between the difficulty of any two consecutive problems is at most 𝑘
     (less or equal than 𝑘
    ).
    
    What is the minimum number of problems you have to remove so that an arrangement of problems is balanced?
    
    Input
    The first line contains a single integer 𝑡
     (1≤𝑡≤1000
    ) — the number of test cases.
    
    The first line of each test case contains two positive integers 𝑛
     (1≤𝑛≤2⋅105
    ) and 𝑘
     (1≤𝑘≤109
    ) — the number of problems, and the maximum allowed absolute difference between consecutive problems.
    
    The second line of each test case contains 𝑛
     space-separated integers 𝑎𝑖
     (1≤𝑎𝑖≤109
    ) — the difficulty of each problem.
    
    Note that the sum of 𝑛
     over all test cases doesn't exceed 2⋅105
    .
    
    Output
    For each test case, output a single integer — the minimum number of problems you have to remove so that an arrangement of problems is balanced.
    
    Example
    InputCopy
    7
    5 1
    1 2 4 5 6
    1 2
    10
    8 3
    17 3 1 20 12 5 17 12
    4 2
    2 4 6 8
    5 3
    2 3 19 10 8
    3 4
    1 10 5
    8 1
    8 3 1 4 5 10 7 3
    OutputCopy
    2
    0
    5
    0
    3
    1
    4
    Note
    For the first test case, we can remove the first 2
     problems and construct a set using problems with the difficulties [4,5,6]
    , with difficulties between adjacent problems equal to |5−4|=1≤1
     and |6−5|=1≤1
    .
    
    For the second test case, we can take the single problem and compose a round using the problem with difficulty 10
    .
    
    
    */

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            
            Arrays.sort(arr);
            
            int maxLen = 1;
            int currLen = 1;
            
            for(int i = 1; i < n; i++){
                if(arr[i] - arr[i-1] <= k){
                    currLen++;
                } else {
                    maxLen = Math.max(maxLen, currLen);
                    currLen = 1;
                }
            }
            
            maxLen = Math.max(maxLen, currLen);
            
            System.out.println(n - maxLen);
        }
    }
}
