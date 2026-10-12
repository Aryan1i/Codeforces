    //Problem
    
    /*Chef is running a sandwich shop. He has 
    B
    B pieces of bread, 
    H
    H pieces of ham, and 
    C
    C pieces of cheese.
    
    To make a sandwich, Chef uses 
    2
    2 pieces of bread, and one piece of either ham or cheese, not both.
    
    Find the maximum number of sandwiches Chef can make.
    
    Input Format
    The first line contains 
    3
    3 integers - 
    B
    B, 
    H
    H and 
    C
    C.
    Output Format
    Output the maximum number of sandwiches Chef can make.
    
    Constraints
    1
    ≤
    B
    ,
    H
    ,
    C
    ≤
    10
    1≤B,H,C≤10
    Sample 1:
    Input
    Output
    8 3 1
    4
    Explanation:
    Chef can make 
    3
    3 ham sandwiches, and 
    1
    1 cheese sandwich, using exactly 
    8
    8 pieces of bread, 
    3
    3 pieces of ham, and 
    1
    1 piece of cheese.
    
    Sample 2:
    Input
    Output
    3 2 2
    1*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int b = scn.nextInt();
		int h = scn.nextInt();
		int c = scn.nextInt();
		
		int x = b / 2;
		int y = h + c;
		
		System.out.println(Math.min(x, y));
	}
}
