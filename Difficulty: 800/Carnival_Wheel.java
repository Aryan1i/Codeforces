//Problem

    /*A. Carnival Wheel
    time limit per test1 second
    memory limit per test256 megabytes
    
    You have a prize wheel divided into 𝑙
     sections, numbered from 0
     to 𝑙−1
    . The sections are arranged in a circle, so after section 𝑙−1
    , the numbering continues again from section 0
    .
    
    Initially, the prize pointer is at section 𝑎
    . Each time you spin the wheel, the pointer moves exactly 𝑏
     sections forward. That is, after one spin, the pointer moves from section 𝑎
     to section (𝑎+𝑏)mod𝑙
    , after two spins to (𝑎+2𝑏)mod𝑙
    , and so on∗
    .
    
    You may spin the wheel any number of times (including zero). After you stop, the section where the pointer finally lands determines your prize: you receive an amount equal to the number of that section.
    
    What is the maximum prize you can obtain?
    
    ∗
    Here, 𝑥mod𝑦
     denotes the remainder from dividing 𝑥
     by 𝑦
    .
    
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤500
    ). The description of the test cases follows.
    
    The first line of each test case contains three integers 𝑙,𝑎
    , and 𝑏
     (1≤𝑙,𝑏≤5000
    , 0≤𝑎≤𝑙−1
    ).
    
    Output
    For each test case, output the maximum prize that can be obtained.
    
    Example
    InputCopy
    4
    5 3 2
    2 0 6
    8 2 4
    100 0 1
    OutputCopy
    4
    0
    6
    99
    Note
    In the first test case, by spinning the wheel three times and then claiming the reward, you can obtain a maximum value of 4
    . The sequence of pointer positions is: 3,0,2,4,1,3,0,…
    
    In the second test case, the pointer will remain on section 0
     indefinitely.
    
    In the fourth test case, with 𝑏=1
     and starting from section 0
    , the pointer will iterate over all sections, including the last one.*/

//Solution

import java.util.Scanner;
 
public class CarnivalWheel {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int l=scn.nextInt();
            int a=scn.nextInt();
            int b=scn.nextInt();
            
            int g=gcd(l,b);
            int k=(l-1-a)/g;
 
            int ans=a+k*g;
            
            System.out.println(ans);
        }
    }
 
    public static int gcd(int n1,int n2){
        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        return n2;
    }
}
