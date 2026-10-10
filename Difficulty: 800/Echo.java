    //Problem
    
    /*A string of length 
    4
    4 is called an echo if 
    S
    1
    =
    S
    3
    S 
    1
    ​
     =S 
    3
    ​
      and 
    S
    2
    =
    S
    4
    S 
    2
    ​
     =S 
    4
    ​
     .
    Here, we are using 
    1
    1-indexing.
    
    You are given a string of length 
    4
    4. Check if it is an echo.
    
    Input Format
    The first and only line of input will contain a single string 
    S
    S of length 
    4
    4.
    Output Format
    Print Yes if 
    S
    S is an echo, and No otherwise.
    
    Each character of the output may be printed in either uppercase or lowercase, i.e. the strings NO, No, nO, and no will be treated as equivalent.
    
    Constraints
    S
    S has length 
    4
    4.
    S
    S consists of only lowercase English letters, i.e. the characters a, b, c, ..., z.
    Sample 1:
    Input
    Output
    meme
    Yes
    Explanation:
    The first and third characters of meme are both equal (to m), and its second and fourth characters are also both equal (to e).
    So, meme is an echo.
    
    Sample 2:
    Input
    Output
    ever
    No
    Explanation:
    The second character of ever is v, while its fourth character is r. These are not equal, so ever is not an echo.*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		if(str.charAt(0) == str.charAt(2) && str.charAt(1) == str.charAt(3)){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}

	}
}
