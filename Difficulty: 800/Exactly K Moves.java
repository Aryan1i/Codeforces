    //Problem
    
    /*Chef is climbing a staircase with 
    N
    N steps. In one move, he climbs either 
    1
    1 step or 
    2
    2 steps.
    
    Chef's fitness watch wants him to reach the top of the staircase (step 
    N
    N) in exactly 
    K
    K moves. He must not go past the top.
    
    Determine whether this is possible.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    The first and only line of each test case contains two space-separated integers 
    N
    N and 
    K
    K — the number of steps and the required number of moves.
    Output Format
    For each test case, output on a new line YES if Chef can reach the top in exactly 
    K
    K moves, and NO otherwise.
    
    Each letter of the output may be printed in either uppercase or lowercase, i.e., the strings NO, no, nO, and No will all be treated as equivalent.
    
    Constraints
    1
    ≤
    T
    ≤
    1000
    1≤T≤1000
    1
    ≤
    N
    ,
    K
    ≤
    1000
    1≤N,K≤1000
    Sample 1:
    Input
    Output
    4
    5 3
    5 2
    3 4
    4 2
    YES
    NO
    NO
    YES
    Explanation:
    Test case 
    1
    1: Chef can climb 
    2
    2, 
    2
    2 and then 
    1
    1 steps.
    
    Test case 
    2
    2: In 
    2
    2 moves, Chef climbs at most 
    4
    4 steps, so he cannot reach step 
    5
    5.
    
    Test case 
    3
    3: In 
    4
    4 moves, Chef climbs at least 
    4
    4 steps, which is more than the 
    3
    3 steps of the staircase.
    
    Test case 
    4
    4: Chef climbs 
    2
    2 steps twice.
    
    accepted
    Accepted
    32
    total-Submissions
    Submissions
    41
    accuracy
    Accuracy
    80.49*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int ans = 8 - r;
		if(r == 2) ans--;
		System.out.println(ans);
	}
}
