    //Problem
    
    /*Chef is practising chess endgames. A white pawn stands on row 
    R
    R of an otherwise empty 
    8
    ×
    8
    8×8 chessboard. The rows are numbered 
    1
    1 to 
    8
    8 from White's side, so the pawn moves towards row 
    8
    8.
    
    In one move, the pawn moves forward by one row. However, a pawn standing on row 
    2
    2 (its starting row) may instead move forward by two rows in that move.
    
    Find the minimum number of moves the pawn needs to reach row 
    8
    8.
    
    Input Format
    The first and only line of input contains a single integer 
    R
    R — the row the pawn stands on.
    Output Format
    Output a single integer — the minimum number of moves the pawn needs to reach row 
    8
    8.
    
    Constraints
    2
    ≤
    R
    ≤
    7
    2≤R≤7
    Sample 1:
    Input
    Output
    7
    1
    Explanation:
    The pawn moves from row 
    7
    7 to row 
    8
    8 in one move.
    
    Sample 2:
    Input
    Output
    2
    5
    Explanation:
    The pawn first moves two rows, from row 
    2
    2 to row 
    4
    4, and then one row at a time to rows 
    5
    5, 
    6
    6, 
    7
    7 and 
    8
    8. That is 
    5
    5 moves in total.*/

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
