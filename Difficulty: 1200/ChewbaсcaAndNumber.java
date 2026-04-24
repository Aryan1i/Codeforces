//Problem
    
    /*A. Chewbaсca and Number
    time limit per test1 second
    memory limit per test256 megabytes
    Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.
    
    Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
    
    Input
    The first line contains a single integer x (1 ≤ x ≤ 1018) — the number that Luke Skywalker gave to Chewbacca.
    
    Output
    Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.
    
    Examples
    InputCopy
    27
    OutputCopy
    22
    InputCopy
    4545
    OutputCopy
    4444
    */

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < x.length(); i++) {
            int d = x.charAt(i) - '0';
            int inv = 9 - d;
 
            if (i == 0 && inv == 0) {
                result.append(d);
            } else {
                result.append(Math.min(d, inv));
            }
        }
 
        System.out.println(result);
    }
}
