//Problem
    
    /*Ali has a string 𝑠
     consisting of 𝑛
     lowercase Latin letters. He also has a character 𝑐
    , which is a lowercase Latin letter. In one coin, he can perform the following operation on the string 𝑠
    :
    
    First, he chooses an index 1≤𝑖≤𝑛
    .
    Then he replaces 𝑠𝑖
     with the character 𝑐
    .
    Ali wants to turn the string 𝑠
     into a palindrome∗
    , but he does not want to spend too many coins on it. Your task — compute the minimum number of coins he has to spend to turn the string 𝑠
     into a palindrome.
    
    ∗
    A string 𝑡
     of length 𝑚
     is a palindrome if 𝑡𝑖=𝑡𝑚−𝑖+1
     holds for every 1≤𝑖≤𝑚
    
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤500
    ). The description of the test cases follows.
    
    The first line of each test case contains an integer 𝑛
     and a lowercase Latin letter 𝑐
     (1≤𝑛≤100
    ) — the length of the string 𝑠
     and the character 𝑐
    .
    
    The second line of each test case contains the string 𝑠
     consisting of 𝑛
     lowercase Latin letters.
    
    Output
    For each test case, output one number — the minimum number of coins Ali needs to spend for the string to become a palindrome.
    
    Example
    InputCopy
    5
    4 b
    abca
    3 p
    xyx
    5 e
    abcbb
    8 d
    adbccbad
    10 c
    codeforces
    OutputCopy
    1
    0
    2
    2
    8
    Note
    In the first test case, in one coin, you can replace 𝑠3
     with 𝚋
    . After the replacement, the string becomes 𝚊𝚋𝚋𝚊
    , which is already a palindrome. It can be proven that 1
     is the minimum number of coins required.
    
    In the second test case, the string 𝑠
     is already a palindrome.
    
    In the third test case, it is enough to change 𝑠1
     and 𝑠5
     to 𝚎
    . After two replacements, the string becomes 𝚎𝚋𝚌𝚋𝚎
    , which is already a palindrome.
    
    In the fourth test case, in two coins, you can replace 𝑠1
     and 𝑠7
    .
    
    
    */

//Solution

import java.util.Scanner;
 
public class codeforces {
 
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		while(t-- > 0) {
			int n = scn.nextInt();
			char c = scn.next().charAt(0);
			
			String s = scn.next();
			
			int i = 0; 
			int j = n - 1;
			int ans = 0;
			
			while(i < j) {
				char chi = s.charAt(i);
				char chj = s.charAt(j);
				
				if(chi == chj) {}
				else if (chi == c || chj == c) ans += 1;
				else ans += 2;
				i++;
				j--;
			}
			
			System.out.println(ans);
		}
	}
 
}
