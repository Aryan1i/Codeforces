//Problem
    
    /*There are 
    N
    N seats numbered 
    1
    1, 
    2
    2, 
    …
    …, 
    N
    N, and 
    M
    M of them are already occupied - seats numbered 
    A
    1
    ,
    A
    2
    ,
    …
    ,
    A
    M
    A 
    1
    ​
     ,A 
    2
    ​
     ,…,A 
    M
    ​
     .
    
    K
    K more people will enter one by one, and each of them will occupy the lowest numbered seat that is available. For each of these 
    K
    K people, find the seat number where they will seat.
    
    It is guaranteed that there are at least 
    K
    K seats empty.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains 
    3
    3 integers - 
    N
    N, 
    M
    M and 
    K
    K.
    The second line contains 
    M
    M integers - 
    A
    1
    ,
    A
    2
    ,
    …
    ,
    A
    M
    A 
    1
    ​
     ,A 
    2
    ​
     ,…,A 
    M
    ​
     .
    Output Format
    For each test case, output on a new line 
    K
    K integers - the seat numbers where each of the new people will sit, in order.
    
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
    M
    ,
    K
    ≤
    N
    1≤M,K≤N
    M
    +
    K
    ≤
    N
    M+K≤N
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
    A
    i
    <
    A
    i
    +
    1
    A 
    i
    ​
     <A 
    i+1
    ​
     
    Sample 1:
    Input
    Output
    3
    4 2 2
    1 3
    6 2 3
    3 4
    5 1 1
    5
    2 4
    1 2 5
    1
    Explanation:
    Test Case 1: Person 
    1
    1 comes and notices seat 
    1
    1 is already taken, and so sits in seat numbered 
    2
    2. Person 
    2
    2 comes and notices seats 
    1
    1, 
    2
    2 and 
    3
    3 are taken, and hence sits in 
    4
    4.*/

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
		    int m = scn.nextInt();
		    int k = scn.nextInt();
		    
		    boolean[] b = new boolean[n + 1];
		    for(int i = 1; i <= m; i++){
		        int x = scn.nextInt();
		        b[x] = true;
		    }
		    
		    int temp = 0;
		    for(int i = 1; i <= n; i++){
		        if(b[i] == false) {
		            temp++;
		            System.out.print(i + " ");
		            if(temp == k) break;
		        }
		    }
		    
		    System.out.println();
		}

	}
}
