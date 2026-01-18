//Problem

    /*Shruti v/s Anurag
    time limit per test2 s.
    memory limit per test256 MB
    Shruti and Anurag participate in a game TV show. When the game starts, the prize will be dropped to a certain point, and whoever gets to it first will get the prize.
    
    Shruti decided that she would start running from point 𝑎
    . Anurag, however, has not yet chosen his starting position.
    
    Anurag knows that the prize could drop either at point 𝑥
     or at point 𝑦
    . He also knows that he can reach the prize faster than Shruti if the distance from his starting position to the prize is strictly less than the distance from Shruti's starting position to the prize. The distance between any two points 𝑐
     and 𝑑
     is calculated as |𝑐−𝑑|
    .
    
    Your task is to determine whether Anurag can choose an integer point that is guarantee to get to the prize faster, regardless of where it appears (at point 𝑥
     or 𝑦
    ). Anurag can choose any integer point, except for 𝑎
     (in particular, he can choose to start in point 𝑥
    , point 𝑦
    , or any other point, but not 𝑎
    ).
    
    Input
    The first line contains a single integer 𝑡
     (1≤𝑡≤1000
    ) — the number of test cases.
    
    The only line of each test case contains three integers 𝑎
    , 𝑥
    , 𝑦
     (1≤𝑎,𝑥,𝑦≤100
    ). Points 𝑎
    , 𝑥
    , and 𝑦
     are pairwise distinct.
    
    Output
    For each test case, print "YES" (case insensitive) if Anurag can choose an integer point that is guarantee to get to the prize faster, regardless of where it appears. Otherwise, print "NO" (case insensitive).
    
    Example
    InputCopy
    3
    1 3 4
    5 3 1
    3 1 5
    OutputCopy
    YES
    YES
    NO
    Note
    In the first example, Anurag can choose point 4
    . If the prize will be at point 𝑥
    , then Anurag's distance is |4−3|=1
     and Shruti's distance is |1−3|=2
    . If the prize will be at point 𝑦
    , then Anurag's distance is |4−4|=0
     and Shruti's distance is |1−4|=3
    .
    
    In the second example, Anurag can choose point 2
    . If the prize will be at point 𝑥
    , then Anurag's distance is |2−3|=1
     and Shruti's distance is |5−3|=2
    . If the prize will be at point 𝑦
    , then Anurag's distance is |2−1|=1
     and Shruti's distance is |5−1|=4
    .
    
    In the third example, Anurag cannot choose a point to guarantee his victory.
    
    */

//Solution

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scn= new Scanner(System.in);
	    int t=scn.nextInt();
	    while(t-->0){
	        int a=scn.nextInt();
	        int x=scn.nextInt();
	        int y=scn.nextInt();
	        
	        int temp=x;
	        x=Math.min(x,y);
	        y=Math.max(temp,y);
	        if(a<y && a>x){
	            System.out.println("NO");
	        }else{
	           System.out.println("YES");
	        }
	    }
	    
	}
}
