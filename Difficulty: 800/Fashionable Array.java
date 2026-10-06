//Problem
    
    /*The mode of an array — is the number that appears the maximum number of times in the array. If several numbers appear the maximum number of times, the mode is the largest among them. For example, the mode of the array [1,1,2]
     is 1
    , and the mode of the array [3,4]
     is 4
    .
    
    You are given an array 𝑎
     consisting of 𝑛
     integers. You may arbitrarily permute the numbers in array 𝑎
     in any order. Your task — is to rearrange the numbers in array 𝑎
     so that the sum of the modes over all prefixes of the array is maximized.
    
    For example, the array [2,3,2]
     can be rearranged as [3,2,2]
    . Then the sum of the modes over all prefixes is determined as follows:
    
    The prefix of length 1
     is [3]
    . The mode of this prefix is 3
    .
    The prefix of length 2
     is [3,2]
    . The mode of this prefix is 3
    .
    The prefix of length 3
     is [3,2,2]
    . The mode of this prefix is 2
    .
    Thus, the sum of the modes is 3+3+2=8
    . It can be proven that for this arrangement of array 𝑎
    , the answer is maximal.
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤500
    ). The description of the test cases follows.
    
    The first line of each test case contains one integer 𝑛
     (1≤𝑛≤100
    ) — the size of the array.
    
    The second line of each test case contains 𝑛
     integers 𝑎1,𝑎2,…𝑎𝑛
     (1≤𝑎𝑖≤100
    ) — the elements of the array.
    
    Output
    For each test case, output a new array whose sum of the modes over all prefixes is maximal. If there are several optimal answers, output any of them.
    
    Example
    InputCopy
    7
    3
    2 3 2
    6
    4 4 2 1 3 1
    5
    1 3 2 4 2
    4
    1 1 1 2
    7
    1 2 3 4 5 6 7
    8
    1 1 4 2 3 3 3 2
    8
    4 3 3 3 2 1 4 1
    OutputCopy
    3 2 2
    4 4 3 2 1 1
    4 1 3 2 2
    2 1 1 1
    7 1 2 3 4 5 6
    4 3 2 1 3 3 1 2
    4 4 3 3 2 1 1 3
    Note
    The first test case is described in the statement of the problem.
    
    In the second test case, one suitable arrangement is [4,4,3,2,1,1]
    . The mode of each prefix is 4
    .
    
    In the third test case, the arrangement [4,1,3,2,2]
     is a valid answer. The mode of each prefix:
    
    The prefix of length 1
     is [4]
    . The mode of this prefix is 4
    .
    The prefix of length 2
     is [4,1]
    . The mode of this prefix is 4
    .
    The prefix of length 3
     is [4,1,3]
    . The mode of this prefix is 4
    .
    The prefix of length 4
     is [4,1,3,2]
    . The mode of this prefix is 4
    .
    The prefix of length 5
     is [4,1,3,2,2]
    . The mode of this prefix is 2
    .
    Then the sum of the modes is 4+4+4+4+2=18
    . It can be proven that this arrangement maximizes the sum of the modes.*/

//Solution

import java.util.Scanner;
 
public class codeforces {
 
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		while(t-- > 0) {
			int n = scn.nextInt();
			
			int[] fre = new int[101];
			for(int i = 0; i < n; i++) {
				fre[scn.nextInt()]++;
			}
			
			int[] ans = new int[n];
			
			int i = 0;
			while(i < n) {
				for(int j = 100; j > 0 && i < n; j--) {
					if(fre[j] > 0) {
						fre[j]--;
						ans[i++] = j;
					}
				}
			}
			
			for(i = 0; i < n; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println();
		}
	}
 
}
