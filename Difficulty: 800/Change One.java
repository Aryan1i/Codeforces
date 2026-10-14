    //Problem
    
    /*You are given an array 
    A
    A of 
    N
    N integers, and you can change exactly one element in it.
    
    After changing one element, find the minimum possible value of 
    max
    ⁡
    (
    A
    )
    −
    min
    ⁡
    (
    A
    )
    max(A)−min(A), where 
    max
    ⁡
    (
    A
    )
    max(A) denotes the maximum element of the array 
    A
    A, and 
    min
    ⁡
    (
    A
    )
    min(A) denotes the minimum element of the array.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains a single integer 
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
    For each test case, output the minimum possible value of 
    max
    ⁡
    (
    A
    )
    −
    min
    ⁡
    (
    A
    )
    max(A)−min(A) after changing one element.
    
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
    2
    7 4
    3
    1 4 6
    3
    1 3 6
    0
    2
    2
    Explanation:
    Test Case 1: Change 
    A
    2
    =
    7
    A 
    2
    ​
     =7 to get 
    [
    7
    ,
    7
    ]
    [7,7] which has 
    max
    ⁡
    (
    A
    )
    −
    min
    ⁡
    (
    A
    )
    =
    0
    max(A)−min(A)=0.
    
    Test Case 2: Change 
    A
    1
    =
    4
    A 
    1
    ​
     =4 to get 
    [
    4
    ,
    4
    ,
    6
    ]
    [4,4,6].
    
    accepted
    Accepted
    16
    total-Submissions
    Submissions
    21
    accuracy
    Accuracy
    76.19*/

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
		    int min = Integer.MAX_VALUE;
		    int smin = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    int smax = Integer.MIN_VALUE;
		    
		    for(int i = 0; i < n; i++){
    		    int x = scn.nextInt();
    		    
    		    if(x <= min){
    		        smin = min;
    		        min = x;
    		    } else if (x < smin){
    		        smin = x;
    		    }
    		    
    		    if(x >= max){
    		        smax = max;
    		        max = x;
    		    } else if (x > smax){
    		        smax = x;
    		    }
		    
		    }
		    
		    if(n < 3) System.out.println(0);
		    else System.out.println(Math.min(max - smin, smax - min));
		}
	}
}
