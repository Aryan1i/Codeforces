    //Problem
    
    /*You have 
    N
    N cups of water, with the 
    i
    i-th cup of water containing 
    A
    i
    A 
    i
    ​
      amount of water.
    
    In one operation, you can do the following:
    
    Choose 
    2
    2 distinct cups 
    i
    i and 
    j
    j (
    1
    ≤
    i
    ,
    j
    ≤
    N
    ,
    i
    ≠
    j
    1≤i,j≤N,i=j), and move all the water in cup 
    i
    i to cup 
    j
    j.
    After this, cup 
    i
    i contains 
    0
    0, and cup 
    j
    j contains 
    A
    i
    +
    A
    j
    A 
    i
    ​
     +A 
    j
    ​
      amount of water.
    You must perform exactly 
    K
    K operations. Maximize the maximum amount of water in any cup at the end of your operations, and report this maximum value.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains 
    2
    2 integers 
    N
    N and 
    K
    K.
    The second line contains 
    N
    N integers - 
    A
    1
    ,
    A
    2
    ,
    …
    ,
    A
    N
    A 
    1
    ​
     ,A 
    2
    ​
     ,…,A 
    N
    ​
     .
    Output Format
    For each test case, output on a new line the maximum value of maximum amount of water in any cup after your operations.
    
    Constraints
    1
    ≤
    T
    ≤
    100
    1≤T≤100
    2
    ≤
    N
    ≤
    100
    2≤N≤100
    1
    ≤
    K
    ≤
    100
    1≤K≤100
    1
    ≤
    A
    i
    ≤
    100
    1≤A 
    i
    ​
     ≤100
    Sample 1:
    Input
    Output
    3
    2 1
    3 1
    5 2
    1 2 3 4 5
    3 100
    3 2 2
    4
    12
    7
    Explanation:
    Test Case 1: Move the water from cup 
    1
    1 to cup 
    2
    2.
    
    Test Case 2: Move the water from cup 
    3
    3 to cup 
    5
    5, and then from cup 
    5
    5 to cup 
    4
    4. Then, the array 
    A
    A looks like 
    [
    1
    ,
    2
    ,
    0
    ,
    12
    ,
    0
    ]
    [1,2,0,12,0].
    
    accepted
    Accepted
    2050
    total-Submissions
    Submissions
    2540
    accuracy
    Accuracy
    83.35*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		while(t-- > 0){
		    int n = scn.nextInt();
		    int k = scn.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i = 0; i < n; i++){
    		    arr[i] = scn.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    int ans = arr[n - 1];
		    for(int i = n - 2, j = 0; i >= 0 && j < k; j++, i--){
		        ans += arr[i];
		    }
		    
		    System.out.println(ans);
		}
	}
}
