//Problem

    /*2-3 Moves
    time limit per test1 second
    memory limit per test256 megabytes
    You are standing at the point 0
     on a coordinate line. Your goal is to reach the point 𝑛
    . In one minute, you can move by 2
     or by 3
     to the left or to the right (i. e., if your current coordinate is 𝑥
    , it can become 𝑥−3
    , 𝑥−2
    , 𝑥+2
     or 𝑥+3
    ). Note that the new coordinate can become negative.
    
    Your task is to find the minimum number of minutes required to get from the point 0
     to the point 𝑛
    .
    
    You have to answer 𝑡
     independent test cases.
    
    Input
    The first line of the input contains one integer 𝑡
     (1≤𝑡≤104
    ) — the number of test cases. Then 𝑡
     lines describing the test cases follow.
    
    The 𝑖
    -th of these lines contains one integer 𝑛
     (1≤𝑛≤109
    ) — the goal of the 𝑖
    -th test case.
    
    Output
    For each test case, print one integer — the minimum number of minutes required to get from the point 0
     to the point 𝑛
     for the corresponding test case.
    
    Example
    InputCopy
    4
    1
    3
    4
    12
    OutputCopy
    2
    1
    2
    4*/

//Solution

import java.util.Scanner;
public class move23 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
 
        while(t-->0){
            int n=scn.nextInt();
            int ans=findmove(n);
            System.out.println(ans);
        }
        scn.close();
    }
    public static int findmove(int n){
        if(n==1){
            return 2;
        }else if(n%3==0){
            return n/3;
        }else{
            return 1+(n/3);
        }
    }
}
