//Problem

    /*Digits Sum
    time limit per test1 second
    memory limit per test256 megabytes
    Let's define 𝑆(𝑥)
     to be the sum of digits of number 𝑥
     written in decimal system. For example, 𝑆(5)=5
    , 𝑆(10)=1
    , 𝑆(322)=7
    .
    
    We will call an integer 𝑥
     interesting if 𝑆(𝑥+1)<𝑆(𝑥)
    . In each test you will be given one integer 𝑛
    . Your task is to calculate the number of integers 𝑥
     such that 1≤𝑥≤𝑛
     and 𝑥
     is interesting.
    
    Input
    The first line contains one integer 𝑡
     (1≤𝑡≤1000
    )  — number of test cases.
    
    Then 𝑡
     lines follow, the 𝑖
    -th line contains one integer 𝑛
     (1≤𝑛≤109
    ) for the 𝑖
    -th test case.
    
    Output
    Print 𝑡
     integers, the 𝑖
    -th should be the answer for the 𝑖
    -th test case.
    
    Example
    InputCopy
    5
    1
    9
    10
    34
    880055535
    OutputCopy
    0
    1
    1
    3
    88005553*/

//Solution

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int t;
	    Scanner scn = new Scanner(System.in);
	    t=scn.nextInt();
	    
	    while(t-->0){
	        long n;
	        n=scn.nextInt();
	        if(n%10==9){
	            System.out.println((n/10)+1);
	        }else{
	            System.out.println(n/10);
	        }
	    }
	}
}
