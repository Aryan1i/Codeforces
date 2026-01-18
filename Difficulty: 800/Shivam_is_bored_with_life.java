//Problem

    /*Shivam is bored with life
    time limit per test1 s.
    memory limit per test256 MB
    Holidays have finished. Thanks to the help of the hacker Shivam, Millie managed to enter the university of her dreams which is located in Whitefield. It's well known that universities provide students with dormitory for the period of university studies. Consequently Millie had to leave Banaras and move to Whitefield. Thus Shivam was left completely alone in a quiet town Banaras. He almost even fell into a depression from boredom!
    
    Shivam came up with a task for himself to relax a little. He chooses two integers 𝐴
     and 𝐵
     and then calculates the greatest common divisor of integers "𝐴
     factorial" and "𝐵
     factorial". Formally the hacker wants to find out GCD(𝐴!,𝐵!)
    . It's well known that the factorial of an integer 𝑥
     is a product of all positive integers less than or equal to 𝑥
    . Thus 𝑥!=1⋅2⋅3⋅⋯⋅(𝑥−1)⋅𝑥
    . For example 4!=1⋅2⋅3⋅4=24
    . Recall that GCD(𝑥,𝑦)
     is the largest positive integer 𝑞
     that divides (without a remainder) both 𝑥
     and 𝑦
    .
    
    Shivam has learned how to solve this task very effective. You are able to cope with it not worse, aren't you?
    
    Input
    The first and single line contains two integers 𝐴
     and 𝐵
     (1≤𝐴,𝐵≤109,𝑚𝑖𝑛(𝐴,𝐵)≤12)
    .
    
    Output
    Print a single integer denoting the greatest common divisor of integers 𝐴!
     and 𝐵!
    .
    
    Example
    InputCopy
    4 3
    OutputCopy
    6
    Note
    Consider the sample.
    
    4!=1⋅2⋅3⋅4=24
    . 3!=1⋅2⋅3=6
    . The greatest common divisor of integers 24
     and 6
     is exactly 6*/

//Solution

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n1=scn.nextInt();
	    int n2=scn.nextInt();
	    int small=n1;
	    if(n2<n1)small=n2;
	    long fac=1;
	    for(int i=small;i>0;i--){
	        fac*=i;
	    }
		System.out.println(fac);
	}
}
