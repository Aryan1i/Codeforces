//Problem
    
    /*You are given an array 
    A
    A of 
    N
    N positive integers.
    
    You may perform the following operation at most once:
    
    Choose an index 
    i
    i (
    1
    ≤
    i
    ≤
    N
    1≤i≤N) and set 
    A
    i
    :
    =
    2
    ⋅
    A
    i
    A 
    i
    ​
     :=2⋅A 
    i
    ​
     .
    After that, let 
    f
    (
    A
    )
    f(A) be the maximum possible value of 
    sum
    (
    A
    )
    −
    max
    ⁡
    (
    A
    )
    sum(A)−max(A), that is, the sum of all its elements except one copy of the largest one.
    
    Given an array of 
    N
    N elements, find 
    f
    (
    A
    )
    f(A).
    
    Input Format
    The first line of input will contain a single integer 
    T
    T, denoting the number of test cases.
    Each test case consists of two lines of input.
    The first line of each test case contains a single integer 
    N
    N — the length of the array.
    The second line contains 
    N
    N space-separated integers 
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
    For each test case, output on a new line the maximum possible score 
    f
    (
    A
    )
    f(A).
    
    Constraints
    1
    ≤
    T
    ≤
    1000
    1≤T≤1000
    2
    ≤
    N
    ≤
    5000
    2≤N≤5000
    1
    ≤
    A
    i
    ≤
    10
    9
    1≤A 
    i
    ​
     ≤10 
    9
     
    The sum of 
    N
    N over all test cases does not exceed 
    5000
    5000.
    Sample 1:
    Input
    Output
    4
    3
    1 2 3
    2
    5 5
    3
    1 6 10
    5
    7 3 9 2 9
    4
    5
    11
    24
    Explanation:
    Test case 
    1
    1: Doubling 
    A
    1
    A 
    1
    ​
      gives 
    [
    2
    ,
    2
    ,
    3
    ]
    [2,2,3], with score 
    7
    −
    3
    =
    4
    7−3=4. Doubling 
    A
    2
    A 
    2
    ​
      gives 
    [
    1
    ,
    4
    ,
    3
    ]
    [1,4,3], with score 
    8
    −
    4
    =
    4
    8−4=4 as well. No choice does better.
    
    Test case 
    2
    2: Without the operation, the score is 
    10
    −
    5
    =
    5
    10−5=5. Doubling either element gives score 
    15
    −
    10
    =
    5
    15−10=5.
    
    Test case 
    3
    3: Doubling 
    A
    2
    A 
    2
    ​
      gives 
    [
    1
    ,
    12
    ,
    10
    ]
    [1,12,10]. The maximum changes, but the score is 
    23
    −
    12
    =
    11
    23−12=11, which is optimal.*/

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
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextLong();
            }

            long ans = 0;

            long sum = 0;
            long max = 0;

            for (long ele : arr) {
                sum += ele;
                max = Math.max(max, ele);
            }

            ans = sum - max;

            for (int i = 0; i < n; i++) {
                arr[i] *= 2;

                sum = 0;
                max = 0;

                for (long ele : arr) {
                    sum += ele;
                    max = Math.max(max, ele);
                }

                ans = Math.max(ans, sum - max);

                arr[i] /= 2;
            }

            System.out.println(ans);
		}
	}
}
