//Problem

/* Product of Three Numbers
time limit per test2 seconds
memory limit per test256 megabytes
You are given one integer number 𝑛
. Find three distinct integers 𝑎,𝑏,𝑐
 such that 2≤𝑎,𝑏,𝑐
 and 𝑎⋅𝑏⋅𝑐=𝑛
 or say that it is impossible to do it.

If there are several answers, you can print any.

You have to answer 𝑡
 independent test cases.

Input
The first line of the input contains one integer 𝑡
 (1≤𝑡≤100
) — the number of test cases.

The next 𝑛
 lines describe test cases. The 𝑖
-th test case is given on a new line as one integer 𝑛
 (2≤𝑛≤109
).

Output
For each test case, print the answer on it. Print "NO" if it is impossible to represent 𝑛
 as 𝑎⋅𝑏⋅𝑐
 for some distinct integers 𝑎,𝑏,𝑐
 such that 2≤𝑎,𝑏,𝑐
.

Otherwise, print "YES" and any possible such representation.

Example
InputCopy
5
64
32
97
2
12345
OutputCopy
YES
2 4 8 
NO
NO
NO
YES
3 5 823 

*/

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int a = -1, b = -1, c;
 
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    break;
                }
            }
 
            if (a == -1) {
                System.out.println("NO");
                continue;
            }
 
            int n1 = n / a;
 
            for (int i = a + 1; i * i <= n1; i++) {
                if (n1 % i == 0) {
                    b = i;
                    break;
                }
            }
 
            if (b == -1) {
                System.out.println("NO");
                continue;
            }
 
            c = n1 / b;
 
            if (c != a && c != b && c > 1) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}
