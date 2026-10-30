    //Problem
    
    /*After escaping the abandoned arcade, Nikhil follows a narrow passage beneath the building and discovers an abandoned orbital station hidden underground. At its entrance lies a sealed security corridor, still guarded by an ancient system.
    
    The corridor contains 
    N
    N rooms arranged in a straight line. Some rooms still contain hostile sentry drones, and Nikhil must restore the station's security system before he can reach the control deck.
    
    A binary string 
    S
    S describes the corridor: 
    S
    i
    =
    1
    S 
    i
    ​
     =1 means that the 
    i
    i-th room is dangerous, while 
    S
    i
    =
    0
    S 
    i
    ​
     =0 means that it is safe.
    
    Nikhil can install alarms in some of the rooms.
    An alarm installed at room 
    p
    p (
    1
    ≤
    p
    ≤
    N
    1≤p≤N) protects all the rooms from 
    max
    ⁡
    (
    1
    ,
    p
    −
    K
    )
    max(1,p−K) through to 
    p
    p, inclusive of both ends.
    
    An alarm protects the room where it is installed and rooms to its left; it does not protect any room to its right.
    
    Determine the minimum number of alarms needed to protect every dangerous room.
    
    Input Format
    The first line of input contains a single integer 
    T
    T, the number of test cases.
    Each test case consists of two lines of input.
    The first line of each test case contains two integers 
    N
    N and 
    K
    K.
    The second line contains a binary string 
    S
    S of length 
    N
    N.
    Output Format
    For each test case, print one integer: the minimum number of alarms required to protect every dangerous room.
    
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
    0
    ≤
    K
    ≤
    N
    0≤K≤N
    S
    S consists only of the characters 0 and 1.
    Sample 1:
    Input
    Output
    4
    5 2
    00100
    6 1
    101010
    8 0
    01101001
    7 3
    1000011
    1
    3
    4
    2
    Explanation:
    Test case 
    1
    1: Room 
    3
    3 is the only dangerous room. An alarm installed in room 
    3
    3 protects it.
    
    Test case 
    2
    2: Alarms installed in rooms 
    1
    1, 
    3
    3 and 
    5
    5 protect all the dangerous rooms. It can be verified that fewer than 
    3
    3 alarms are not enough.
    
    Test case 
    3
    3: Alarms installed in rooms 
    2
    2, 
    3
    3, 
    5
    5 and 
    8
    8 protect all the dangerous rooms. It can be verified that fewer than 
    4
    4 alarms are not enough.
    
    Test case 
    4
    4: Alarms installed in rooms 
    4
    4 and 
    7
    7 protect rooms 
    1
    1 to 
    4
    4 and rooms 
    4
    4 to 
    7
    7 respectively, which covers all the dangerous rooms.*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            int k = sc.nextInt();
            
            String s = sc.next();

            int i = n - 1;
            int ans = 0;

            while (i >= 0) {
                if (s.charAt(i) == '1') {
                    ans++;
                    i = i - k - 1;
                } else {
                    i--;
                }
            }
            
            System.out.println(ans);
        }
	}
}
