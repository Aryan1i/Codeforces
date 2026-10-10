    //Problem
    
    /*An array 
    B
    B is called good if the parity of the elements keep alternating, i.e. odd, even, odd, .... or even, odd, even, ...
    
    You are given an array 
    A
    A containing 
    N
    N integers, and you can do the following action:
    
    Choose some subset of elements of 
    A
    A, and then rearrange that subset to form a good array.
    Find the maximum size of subset you can choose which can be rearranged to a good array.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains 
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
    For each test case, output on a new line the maximum size of a subset.
    
    Constraints
    1
    ≤
    T
    ≤
    100
    1≤T≤100
    1
    ≤
    N
    ≤
    100
    1≤N≤100
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
    2
    5
    1 3 7 4 5
    4
    1 1 2 4
    3
    4
    Explanation:
    Test Case 1: We can choose the subset 
    {
    1
    ,
    4
    ,
    5
    }
    {1,4,5}. There is no need to reorder it, as it is already alternating.
    
    Test Case 2: We can choose the subset 
    {
    1
    ,
    1
    ,
    2
    ,
    4
    }
    {1,1,2,4} and reorder to get 
    [
    1
    ,
    2
    ,
    1
    ,
    4
    ]
    [1,2,1,4] which is alternating parity.*/

//Soluiton

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
		     
		     int[] arr = new int[n];
		     
		     for(int i = 0; i < n; i++){
		         arr[i] = scn.nextInt();
		     }
		     
		     int odd = 0;
		     int even = 0;
		     
		     int ans = 0;
		     
		     for(int ele : arr){
		         if(ele % 2 == 0) even++;
		         else odd++;
		         
		         ans = 2 * Math.min(odd, even);
		     }
		     
		     if(even != odd) ans++;
		     
		     System.out.println(ans);
		 }
	}
}
