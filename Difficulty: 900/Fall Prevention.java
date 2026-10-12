//Problem
    
    /*An array 
    A
    A of length 
    N
    N is called good if
    
    A
    1
    +
    A
    2
    +
    …
    +
    A
    i
    ≥
    0
    A 
    1
    ​
     +A 
    2
    ​
     +…+A 
    i
    ​
     ≥0
    for every 
    1
    ≤
    i
    ≤
    N
    1≤i≤N.
    
    You are given an array 
    A
    A. You may delete at most one element from the array, without changing the order of the remaining elements.
    Is it possible to do this such that the resulting array is good?
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of two lines of input.
    The first line of each test case contains a single integer 
    N
    N — the length of the array.
    The second line contains 
    N
    N space-separated integers 
    A
    1
    ,
    …
    ,
    A
    N
    A 
    1
    ​
     ,…,A 
    N
    ​
     .
    Output Format
    For each test case, output on a new line the answer: Yes if it's possible to obtain a good array after deleting at most one element, and No otherwise.
    
    Constraints
    1
    ≤
    T
    ≤
    10
    5
    1≤T≤10 
    5
     
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
     
    −
    10
    4
    ≤
    A
    i
    ≤
    10
    4
    −10 
    4
     ≤A 
    i
    ​
     ≤10 
    4
     
    The sum of 
    N
    N over all test cases won't exceed 
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
    4
    4
    1 0 2 -1
    3
    1 -2 -2
    5
    2 -1 -2 1 0
    4
    0 -1 -1 3
    YES
    NO
    YES
    NO
    Explanation:
    Test case 
    1
    1: We have 
    A
    =
    [
    1
    ,
    0
    ,
    2
    ,
    −
    1
    ]
    A=[1,0,2,−1]. The array is already good without deleting any elements, because the corresponding sums are:
    
    1
    1
    1
    +
    0
    =
    1
    1+0=1
    1
    +
    0
    +
    2
    =
    3
    1+0+2=3
    1
    +
    0
    +
    2
    +
    (
    −
    1
    )
    =
    2
    1+0+2+(−1)=2
    which are all 
    ≥
    0
    ≥0.
    
    Test case 
    2
    2: We have 
    A
    =
    [
    1
    ,
    −
    2
    ,
    −
    2
    ]
    A=[1,−2,−2].
    
    If we delete the 
    1
    1, the array starts with 
    −
    2
    −2 and hence is not good.
    If we delete one of the 
    −
    2
    −2's, the array becomes 
    [
    1
    ,
    −
    2
    ]
    [1,−2] and 
    1
    +
    (
    −
    2
    )
    =
    −
    1
    <
    0
    1+(−2)=−1<0, so this isn't good either.
    Thus, it's impossible to make the array good after a single deletion.
    
    Test case 
    3
    3: We can delete 
    A
    2
    =
    −
    1
    A 
    2
    ​
     =−1 to obtain the array 
    [
    2
    ,
    −
    2
    ,
    1
    ,
    0
    ]
    [2,−2,1,0], which can be verified to be good.*/

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
            int[] arr = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = scn.nextInt(); 
		    }
		    
		    int min = Integer.MAX_VALUE;
		    boolean flag = true;
		    long sum = 0;
		    boolean d = true;
		    for(int i = 0; i < n; i++){
		        sum += arr[i];
		        min = Math.min(arr[i], min);
		        if(flag && sum < 0){
		            flag = false;
		            if(min < 0){
		                sum = sum + (-min);
		            }
		            if(sum < 0){
		                System.out.println("No");
		                d = false;
		                break;
		            }
		        } else if (sum < 0){
		                System.out.println("No");
		                d = false;
		                break;
		        }
		    }
		    if(d){
		        System.out.println("Yes");
		    }
        }
	}
}
