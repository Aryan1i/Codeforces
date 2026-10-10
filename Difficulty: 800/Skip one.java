    //Problem
    
    /*You have 
    K
    K coins with you, and up ahead are 
    N
    N items. The 
    i
    i-th item costs you 
    A
    i
    A 
    i
    ​
      coins to buy.
    
    You also have a special one-time only discount coupon, which can be used to make one item of your choice free to buy.
    
    You have a special constraint that you can buy items in the order 
    1
    ,
    2
    ,
    …
    ,
    N
    1,2,…,N, and if you choose to not buy some item, you cannot buy the later ones either.
    
    Find the maximum number of items you can buy under these constraints.
    
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
    For each test case, output on a new line the maximum items you can buy.
    
    Constraints
    1
    ≤
    T
    ≤
    10
    4
    1≤T≤10 
    4
     
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
     
    1
    ≤
    A
    i
    ≤
    10
    4
    1≤A 
    i
    ​
     ≤10 
    4
     
    1
    ≤
    K
    ≤
    10
    9
    1≤K≤10 
    9
     
    The sum of 
    N
    N does not exceed 
    2
    ⋅
    10
    5
    2⋅10 
    5
     
    Sample 1:
    Input
    Output
    3
    7 11
    1 2 3 4 5 6 1
    2 5
    7 7
    4 4
    100 2 1 1
    5
    1
    4
    Explanation:
    Test Case 1: We can buy the first 
    5
    5 items, using a discount token on the fifth, spending a total of 
    1
    +
    2
    +
    3
    +
    4
    =
    10
    1+2+3+4=10 coins on the others. Note that we cannot buy the 
    7
    7th item even though we have the coins left for it, because we are forced to buy the 
    6
    6th first.
    
    Test Case 2: We do not have enough coins for any items, but we can still use our discount token for the first.*/

//Solution

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();

            long sum = 0;
            long max = 0;
            int ans = 0;

            for (int i = 0; i < N; i++) {
                long x = sc.nextLong();

                sum += x;
                max = Math.max(max, x);

                if (sum - max <= K) {
                    ans = i + 1;
                }
            }

            System.out.println(ans);
        }
	}
}
