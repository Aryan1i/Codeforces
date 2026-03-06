//Problem

    /*Kefa decided to make some money doing business on the Internet for exactly n days. He knows that on the i-th day (1 ≤ i ≤ n) he makes ai money. Kefa loves progress, that's why he wants to know the length of the maximum non-decreasing subsegment in sequence ai. Let us remind you that the subsegment of the sequence is its continuous fragment. A subsegment of numbers is called non-decreasing if all numbers in it follow in the non-decreasing order.
    
    Help Kefa cope with this task!
    
    Input
    The first line contains integer n (1 ≤ n ≤ 105).
    
    The second line contains n integers a1,  a2,  ...,  an (1 ≤ ai ≤ 109).
    
    Output
    Print a single integer — the length of the maximum non-decreasing subsegment of sequence a.
    
    Examples
    InputCopy
    6
    2 2 1 3 4 1
    OutputCopy
    3
    InputCopy
    3
    2 2 9
    OutputCopy
    3
    Note
    In the first test the maximum non-decreasing subsegment is the numbers from the third to the fifth one.
    
    In the second test the maximum non-decreasing subsegment is the numbers from the first to the third one.
    
    */

//Solution

import java.util.Scanner;
public class codeforces {
 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
 
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
 
        int i = 0;
        int j = 1;
 
        int ans = 0;
        while(j < arr.length){
            if( arr[j] < arr[j-1]){
                ans = Math.max(ans, j - i);
                i = j;
            }
            j++;
        }
 
        ans = Math.max(ans, n - i);
        System.out.println(ans);
    }
}
