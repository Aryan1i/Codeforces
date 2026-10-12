//Problem
    
    /*A fair has 
    N
    N stalls in a row, numbered 
    1
    1 to 
    N
    N from left to right.
    
    The fair organizers now need to put up some floodlights, so that the stalls can operate well even at night.
    It costs the organizers 
    C
    i
    C 
    i
    ​
      coins to install a floodlight on top of the 
    i
    i-th stall.
    
    Each floodlight has a power of 
    K
    K, meaning that it will illuminate all stalls at distance at most 
    K
    K from it.
    That is, if a floodlight is placed on top of stall 
    i
    i, it will illuminate stall 
    j
    j if and only if 
    ∣
    i
    −
    j
    ∣
    ≤
    K
    ∣i−j∣≤K.
    
    In order to save money, the organizers decide that they will put up exactly two floodlights, on two distinct stalls.
    
    Find the minimum possible cost of placing two floodlights, such that every stall is illuminated by at least one floodlight.
    If it's impossible to place two floodlights and light up all the stalls, print 
    −
    1
    −1 instead.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of two lines of input.
    The first line of each test case contains two space-separated integers 
    N
    N and 
    K
    K — the number of stalls and the power of each light.
    The second line contains 
    N
    N space-separated integers 
    C
    1
    ,
    …
    ,
    C
    N
    C 
    1
    ​
     ,…,C 
    N
    ​
     .
    Output Format
    For each test case,
    
    If it's not possible to place exactly two lights to illuminate all 
    N
    N stalls, print 
    −
    1
    −1.
    Otherwise, output the minimum total cost of placing two lights to illuminate all 
    N
    N stalls.
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
    N
    1≤K≤N
    1
    ≤
    C
    i
    ≤
    100
    1≤C 
    i
    ​
     ≤100
    Sample 1:
    Input
    Output
    4
    5 1
    1 8 1 4 7
    3 1
    6 2 2
    6 3
    9 4 2 7 2 6
    7 1
    4 1 7 3 6 1 5
    5
    4
    4
    -1
    Explanation:
    Test case 
    1
    1: We can place lights on top of stalls 
    1
    1 and 
    4
    4, for a cost of 
    C
    1
    +
    C
    4
    =
    1
    +
    4
    =
    5
    C 
    1
    ​
     +C 
    4
    ​
     =1+4=5.
    This will illuminate all stalls, because, with 
    K
    =
    1
    K=1:
    
    The light at 
    1
    1 will illuminate stalls 
    1
    ,
    2
    1,2.
    The light at 
    4
    4 will illuminate stalls 
    3
    ,
    4
    ,
    5
    3,4,5.
    5
    5 is the minimum cost needed to achieve this.
    
    Test case 
    2
    2: Place lights on stalls 
    2
    2 and 
    3
    3, for a cost of 
    A
    2
    +
    A
    3
    =
    4
    A 
    2
    ​
     +A 
    3
    ​
     =4.
    
    Test case 
    4
    4: No matter how two lights are placed, with a power of 
    K
    =
    1
    K=1 at least one stall will not be illuminated. So we print 
    −
    1
    −1.*/

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
		    
		    int[] c = new int[n];
		    for(int i = 0; i < n; i++){
		        c[i] = scn.nextInt();
		    }
		    
		    int ans = -1;
		    
		    int l = 0;
		    int r = 0;
		    
		    while(l < n){
    		    while(r < n){
    	
    		        if(l - k <= 0 && r + k >= n - 1 && r - l <= 2 * k + 1 && l != r){
    		            if(ans == -1){
    		                ans = c[l] + c[r];
    		            } else {
    		                ans = Math.min(ans, c[l] + c[r]);
    		            }
    		        } 
    		        r++;
    	
    		    }
    		    l++;
    		    r = l + 1;
		    }
		    System.out.println(ans);
		}
	}
}
