//Problem

    /*IQ test
    time limit per test2 seconds
    memory limit per test256 megabytes
    Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given n numbers differs from the others. Bob observed that one number usually differs from the others in evenness. Help Bob — to check his answers, he needs a program that among the given n numbers finds one that is different in evenness.
    
    Input
    The first line contains integer n (3 ≤ n ≤ 100) — amount of numbers in the task. The second line contains n space-separated natural numbers, not exceeding 100. It is guaranteed, that exactly one of these numbers differs from the others in evenness.
    
    Output
    Output index of number that differs from the others in evenness. Numbers are numbered from 1 in the input order.
    
    Examples
    InputCopy
    5
    2 4 7 8 10
    OutputCopy
    3
    InputCopy
    4
    1 2 1 1
    OutputCopy
    2
    */

//Solution

import java.util.Scanner;
public class codeforces {
 
    public static void main(String[] args){
 
        Scanner scn=new Scanner(System.in);
        
        int n = scn.nextInt();
 
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
 
        int even = 0;
        int odd = 0;
        for(int i=0;i<3;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
 
        if(even > odd){
            for(int i =0;i<n;i++){
                if(arr[i]% 2 == 1){
                    System.out.println(i+1);
                    break;
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(arr[i]%2 ==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
