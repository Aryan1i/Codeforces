//Problem
    
    /*You have 
    N
    N cups of water, with the 
    i
    i-th cup of water containing 
    A
    i
    A 
    i
    ​
      amount of water.
    
    In one operation, you can do the following:
    
    Choose 
    2
    2 distinct cups 
    i
    i and 
    j
    j (
    1
    ≤
    i
    ,
    j
    ≤
    N
    ,
    i
    ≠
    j
    1≤i,j≤N,i=j), such that the 
    i
    i-th cup has non-zero amount of water, and move all the water in cup 
    i
    i to cup 
    j
    j.
    After this, cup 
    i
    i contains 
    0
    0, and cup 
    j
    j contains 
    A
    i
    +
    A
    j
    A 
    i
    ​
     +A 
    j
    ​
      amount of water.
    You must perform exactly 
    K
    K operations. Minimize the maximum amount of water in any cup at the end of your operations, and report this minimum value.
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of multiple lines of input.
    The first line contains 
    2
    2 integers 
    N
    N and 
    K
    K.
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
    For each test case, output on a new line the minimum value of maximum amount of water in any cup after your operations.
    
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
    100
    1≤K≤100
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
    2 1
    3 1
    5 2
    1 2 3 4 5
    3 100
    3 2 2
    4
    5
    4
    Explanation:
    Test Case 1: Move the water from cup 
    1
    1 to 
    2
    2 in one move. Now, the array is 
    [
    0
    ,
    4
    ]
    [0,4].
    
    Test Case 2: Do the following 
    2
    2 moves:
    
    move the water from cup 
    1
    1 to cup 
    2
    2
    move the water from cup 
    3
    3 to cup 
    4
    4.
    At the end, the array is 
    [
    0
    ,
    5
    ,
    0
    ,
    5
    ,
    5
    ]
    [0,5,0,5,5], and the maximum is 
    5
    5.
    
    accepted
    Accepted
    9112
    total-Submissions
    Submissions
    21862
    accuracy
    Accuracy
    44.85*/

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

        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                pq.add(scn.nextInt());
            }

            for (int i = 0; i < k; i++) {
                int a = pq.remove();
                int b = pq.remove();

                pq.add(a + b);
                pq.add(0);
            }

            int ans = 0;
            while (pq.size() > 0) {
                ans = Math.max(ans, pq.remove());
            }

            System.out.println(ans);
        }

	}
}
