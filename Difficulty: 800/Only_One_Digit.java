//Problem

    /*Only One Digit
    time limit per test1 second
    memory limit per test256 megabytes
    You are given an integer 𝑥
    . You need to find the smallest non-negative integer 𝑦
     such that the numbers 𝑥
     and 𝑦
     share at least one common digit. In other words, there must exist a decimal digit 𝑑
     that appears in both the representation of the number 𝑥
     and the number 𝑦
    .
    
    Input
    The first line contains an integer 𝑡
     (1≤𝑡≤1000
    ) — the number of test cases.
    
    The first line of each test case contains one integer 𝑥
     (1≤𝑥≤1000
    ).
    
    Output
    For each test case, output one integer 𝑦
     — the minimum non-negative number that satisfies the condition.
    
    Example
    Input
    5
    6
    96
    78
    122
    696
    Output
    6
    6
    7
    1
    6*/

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int x = sc.nextInt();
 
            boolean[] present = new boolean[10];
 
            int temp = x;
            while (temp > 0) {
                int digit = temp % 10;
                present[digit] = true;
                temp /= 10;
            }
 
            for (int d = 0; d <= 9; d++) {
                if (present[d]) {
                    System.out.println(d);
                    break;
                }
            }
        }
        sc.close();
    }
}
