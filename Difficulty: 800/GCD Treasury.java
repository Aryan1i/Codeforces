//Problem
    
    /*The greedy pirate Dimash found a treasury. It consists of 𝑛
     piles of coins, numbered from 1
     to 𝑛
    . The 𝑖
    -th pile contains exactly 𝑎𝑖
     coins. Pirate Dimash has a number 𝑥
     that he can use to steal coins from the treasury. The stealing process works as follows:
    
    First, he chooses an index 1≤𝑖≤𝑛
     such that 𝑎𝑖>0
     and gcd
    ∗
    (𝑎𝑖,𝑥)≠1
    . If there is no such index, the pirate stops.
    Now let gcd(𝑎𝑖,𝑥)
     be 𝑔
    . The pirate steals exactly 𝑔
     coins from pile 𝑖
    , after which 𝑎𝑖
     decreases by 𝑔
    .
    Finally, he sets 𝑥
     to 𝑔
     and continues stealing coins.
    Your task is to help the pirate steal the maximum possible number of coins. Find the maximum number of coins that can be stolen from the treasury.
    
    ∗
    gcd(𝑎𝑖,𝑥)
     denotes the greatest common divisor (GCD) of integers 𝑎𝑖
     and 𝑥
    .
    
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤104
    ). The description of the test cases follows.
    
    The first line of each test case contains two integers 𝑛
     and 𝑥
     (1≤𝑛,𝑥≤3⋅105
    ) — the number of piles of coins in the treasury and the pirate's number.
    
    The second line of each test case contains 𝑛
     integers 𝑎1,𝑎2,…𝑎𝑛
     (1≤𝑎𝑖≤3⋅105
    ).
    
    It is guaranteed that the sum of 𝑛
     over all test cases does not exceed 3⋅105
    .
    
    Output
    For each test case, output one number — the maximum number of coins that can be stolen.
    
    Example
    InputCopy
    5
    3 1
    2 3 5
    3 4
    2 3 4
    4 2
    2 2 2 2
    6 6
    2 3 2 3 2 3
    7 6
    9 9 4 4 4 4 4
    OutputCopy
    0
    6
    8
    9
    20
    Note
    In the first test case, no coin can be stolen.
    
    In the second test case, the pirate steals as follows.
    
    The pirate chooses pile number 3
    . He takes 4
     coins, after which the treasury becomes [2,3,0]
     and 𝑥
     becomes 4
    .
    The pirate chooses pile number 1
    . He takes 2
     coins, after which the treasury becomes [0,3,0]
    , and 𝑥
     becomes 2
    .
    No suitable indices remain, so the pirate stops. The pirate managed to take 4+2=6
     coins.
    
    */

//Solution

import java.util.*;
 
public class Main {
 
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            long[] sum = new long[x + 1];
            for (int num : a) {
                int g = gcd(num, x);
                for (int d = 1; d * d <= g; d++) {
 
                    if (g % d == 0) {
 
                        sum[d] += num;
 
                        if (d!=g / d) {
                            sum[g / d] += num;
                        }
                    }
                }
            }
            long ans = 0;
            for (int d = 2; d <=x; d++) {
                if (x % d == 0) {
                    ans = Math.max(ans, sum[d]);
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}
