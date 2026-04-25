    //Problem
    
    /*Sort the Array
    time limit per test1 second
    memory limit per test256 megabytes
    Being a programmer, you like arrays a lot. For your birthday, your friends have given you an array a consisting of n distinct integers.
    
    Unfortunately, the size of a is too small. You want a bigger array! Your friends agree to give you a bigger array, but only if you are able to answer the following question correctly: is it possible to sort the array a (in increasing order) by reversing exactly one segment of a? See definitions of segment and reversing in the notes.
    
    Input
    The first line of the input contains an integer n (1 ≤ n ≤ 105) — the size of array a.
    
    The second line contains n distinct space-separated integers: a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 109).
    
    Output
    Print "yes" or "no" (without quotes), depending on the answer.
    
    If your answer is "yes", then also print two space-separated integers denoting start and end (start must not be greater than end) indices of the segment to be reversed. If there are multiple ways of selecting these indices, print any of them.
    
    Examples
    InputCopy
    3
    3 2 1
    OutputCopy
    yes
    1 3
    InputCopy
    4
    2 1 3 4
    OutputCopy
    yes
    1 2
    InputCopy
    4
    3 1 2 4
    OutputCopy
    no
    InputCopy
    2
    1 2
    OutputCopy
    yes
    1 1
    Note
    Sample 1. You can reverse the entire array to get [1, 2, 3], which is sorted.
    
    Sample 3. No segment can be reversed such that the array will be sorted.
    
    Definitions
    
    A segment [l, r] of array a is the sequence a[l], a[l + 1], ..., a[r].
    
    If you have an array a of size n and you reverse its segment [l, r], the array will become:
    
    a[1], a[2], ..., a[l - 2], a[l - 1], a[r], a[r - 1], ..., a[l + 1], a[l], a[r + 1], a[r + 2], ..., a[n - 1], a[n].*/

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        
        Arrays.sort(b);
        
        int l = 0, r = n - 1;
 
        while (l < n && a[l] == b[l]) {
            l++;
        }
        
        while (r >= 0 && a[r] == b[r]) {
            r--;
        }
        
        if (l >= r) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        
        reverse(a, l, r);
        
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                System.out.println("no");
                return;
            }
        }
        
        System.out.println("yes");
        System.out.println((l + 1) + " " + (r + 1));
    }
    
    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
