  //Problem
  
  /*Chef is particular about the colour of the pens he uses to write in any exam.
  
  He needs either:
  
  3
  3 blue pens, or
  1
  1 blue pen and 
  1
  1 black pen.
  One blue pen costs 
  A
  A rupees, and one black pen costs 
  B
  B rupees. Find the minimum cost Chef has to pay.
  
  Input Format
  The first and only line contains 
  2
  2 integers - 
  A
  A and 
  B
  B.
  Output Format
  Output the minimum cost Chef has to pay to buy pens satisfying his requirement.
  
  Constraints
  10
  ≤
  A
  ,
  B
  ≤
  50
  10≤A,B≤50
  Sample 1:
  Input
  Output
  10 10
  20
  Explanation:
  Chef can buy one blue and one black pen for a cost of 
  20
  20.
  
  Sample 2:
  Input
  Output
  10 50
  30
  Explanation:
  Chef can buy 
  3
  3 blue pens for a cost of 
  30
  30.
  
  Did you like the problem statement?
  More Info
  Time limit1 secs
  Memory limit1.5 GB
  Source Limit50000 Bytes
  */

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if(3 * a < a + b){
		    System.out.println(3 * a);
		} else {
		    System.out.println(a + b);
		}
	}
}
