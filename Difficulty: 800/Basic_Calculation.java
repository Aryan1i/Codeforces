//Problem

    /*Basic Calculation
    time limit per test2 s.
    memory limit per test256 MB
    Nitin Sir asks all the great programmers of the world to solve a trivial problem. He gives them an integer 𝑚
     and asks for the number of positive integers 𝑛
    , such that the factorial of 𝑛
     ends with exactly 𝑚
     zeroes. Are you among those great programmers who can solve this problem?
    
    Input
    The only line of input contains an integer 𝑚
     (1≤𝑚≤100000
    ) — the required number of trailing zeroes in factorial.
    
    Output
    First print 𝑘
     — the number of values of 𝑛
     such that the factorial of 𝑛
     ends with 𝑚
     zeroes. Then print these 𝑘
     integers in increasing order.
    
    Examples
    InputCopy
    1
    OutputCopy
    5
    5 6 7 8 9 
    InputCopy
    5
    OutputCopy
    0
    Note
    The factorial of 𝑛
     is equal to the product of all integers from 1
     to 𝑛
     inclusive, that is 𝑛!=1⋅2⋅3⋅…⋅𝑛
    .
    
    In the first sample, 5!=120
    , 6!=720
    , 7!=5040
    , 8!=40320
     and 9!=362880
    .
    
    */

//Solution

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    long n=scn.nextInt();
	    
	    long num=0;
	    int flag=0;
	    long x=n*5;
	    while(flag==0 && x>0){
	        long m=travlingZero(x);
	        if(m==n){
	            num=x;
	            flag=1;
	        }
	        x-=5;
	    }
	    
	    if(flag==1){
	        System.out.println(5);
	        for(long i=num;i<num+5;i++){
	            System.out.print(i + " ");
	        }
	    }else{
	        System.out.println(0);
	    }
	    
	}
	
	public static long travlingZero(long n){
	    long sum=0;
	    while(n>0){
	        long x=n/5;
	        sum+=x;
	        n=n/5;
	    }
	    return sum;
	}
}
