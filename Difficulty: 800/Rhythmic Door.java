//Problem
    
    /*Nikhil discovers a sealed room hidden beneath an abandoned arcade. Its entrance is controlled by an old rhythm lock with two buttons, A and B.
    
    The lock records every button press. Whenever the same button has been pressed three consecutive times, the door opens once, and the lock immediately resets its counter to zero.
    Any remaining presses start a fresh count, even if they use the same button.
    If the button changes before three consecutive presses are reached, the new button starts a new streak; and the old streak is lost.
    
    Nikhil has recovered the complete sequence of button presses recorded by the lock. Given this sequence, determine how many times the door opened.
    
    Input Format
    The first line of input contains a single integer 
    T
    T, the number of test cases.
    Each test case consists of two lines of input.
    The first line of each test case contains a single integer 
    N
    N, the number of button presses.
    The second line contains a string 
    S
    S of length 
    N
    N, consisting only of the characters A and B, representing the sequence of button presses.
    Output Format
    For each test case, print a single integer: the number of times the door opened.
    
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
    S
    S consists only of the characters A and B.
    Sample 1:
    Input
    Output
    5
    5
    AABBB
    6
    AAABBB
    8
    AAAAAAAA
    6
    ABABBA
    16
    BBBBAAAAABBBBBBB
    1
    2
    2
    0
    4
    Explanation:
    Test case 
    1
    1: The last three presses are all B, so the door opens once.
    
    Test case 
    2
    2: The first three presses are all A and the last three presses are all B, so the door opens twice.
    
    Test case 
    3
    3: The door opens after the 
    3
    3-rd press and again after the 
    6
    6-th press. The remaining two presses are not enough to open it again.
    
    Test case 
    4
    4: No button is pressed three consecutive times, so the door never opens.*/

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
            if(n == 0) continue;
            
            String s = sc.next();
            
            int c = 1;
            int ans = 0;
            char pre = s.charAt(0);
            for(int i = 1; i < s.length(); i++){
                char ch = s.charAt(i);
                if(pre == ch){
                    c += 1;
                } else {
                    pre = ch;
                    c = 1;
                }
                if(c == 3) {
                    ans++;
                    c = 0;
                }
            }
            System.out.println(ans);
        }
	}
}
