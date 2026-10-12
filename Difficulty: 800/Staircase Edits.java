//Problem
    
    /*An array 
    A
    A is called a staircase if it satisfies the following condition:
    
    A
    i
    −
    A
    i
    −
    1
    =
    1
    A 
    i
    ​
     −A 
    i−1
    ​
     =1 for all 
    2
    ≤
    i
    ≤
    ∣
    A
    ∣
    2≤i≤∣A∣
    You are given an array 
    A
    A of 
    N
    N integers, which you want to convert into a staircase array. In one operation, you can change the value of any one position in the array 
    A
    A to any integer you want.
    
    Find the minimum number of edits needed to transform the array 
    A
    A into a staircase.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains one integer 
    N
    N.
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
    For each test case, output on a new line the minimum edits to make the array 
    A
    A a staircase.
    
    Constraints
    1
    ≤
    T
    ≤
    10
    4
    1≤T≤10 
    4
     
    2
    ≤
    N
    ≤
    2
    ⋅
    10
    5
    2≤N≤2⋅10 
    5
     
    1
    ≤
    A
    i
    ≤
    N
    1≤A 
    i
    ​
     ≤N
    The sum of 
    N
    N over all test cases does not exceed 
    2
    ⋅
    10
    5
    2⋅10 
    5
     .
    Sample 1:
    Input
    Output
    3
    4
    1 2 3 4
    4
    4 4 1 2
    3
    3 2 1
    0
    2
    2
    Explanation:
    Test Case 1: The array is already a staircase.
    
    Test Case 2: You can change 
    A
    1
    A 
    1
    ​
      and 
    A
    2
    A 
    2
    ​
      to get the array 
    [
    −
    1
    ,
    0
    ,
    1
    ,
    2
    ]
    [−1,0,1,2].*/

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
		   int[] ori = new int[n];
		   
		   for(int i = 0; i < n; i++){
		      ori[i] = scn.nextInt();
		   }
		   
		   int[] arr = new int[2 * n + 1];
		   int ans = 0;
		   for(int i = 0; i < n; i++){
		       int temp = ori[i] - i;
		       
		       temp += n;
		       
		       arr[temp]++;
		       ans = Math.max(ans, arr[temp]);
		       
		   }
		   
		   System.out.println(n - ans);
		   
		}

	}
}
