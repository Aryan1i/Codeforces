//Problem

    /*Square?
    time limit per test1 second
    memory limit per test256 megabytes
    You are given 4
     sticks of lengths 𝑎
    , 𝑏
    , 𝑐
    , and 𝑑
    . You can not break or bend them.
    
    Determine whether it is possible to form a square∗
     using the given sticks.
    
    ∗
    A square is defined as a polygon consisting of 4
     vertices, of which all sides have equal length and all inner angles are equal. No two edges of the polygon may intersect each other.
    
    Input
    The first line contains a single integer 𝑡
     (1≤𝑡≤104
    ) — the number of test cases.
    
    The only line of each test case contains four integers 𝑎
    , 𝑏
    , 𝑐
    , and 𝑑
     (1≤𝑎,𝑏,𝑐,𝑑≤10
    ) — the lengths of the sticks.
    
    Output
    For each test case, print "YES" if it is possible to form a square using the given sticks, and "NO" otherwise.
    
    You may print each letter in any case (uppercase or lowercase). For example, the strings "yEs", "yes", "Yes", and "YES" will all be recognized as a positive answer.
    
    Example
    InputCopy
    7
    1 2 3 4
    1 1 1 1
    2 2 2 2
    1 2 1 2
    1 1 5 5
    5 5 5 5
    4 10 5 9
    OutputCopy
    NO
    YES
    YES
    NO
    NO
    YES
    NO*/

//Solution

import java.util.Scanner;
public class CarnivalWheel{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int w= scn.nextInt();
            int x=scn.nextInt();
            int y=scn.nextInt();
            int z=scn.nextInt();
 
            if(w==x && x==y && y==z && z==w){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
