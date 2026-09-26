//Problem
    
    /*Kia and Kio spent the summer at the port of Mehragan, where 𝑛
     lighthouses stand on the cliffs facing the dark sea.
    
    The lighthouses of Mehragan do not give light. Every night a number is written in fire on each of them, and the sailors read their way from those numbers.
    
    The law of the lighthouses is this: if a lighthouse shows 𝑥
     tonight, then tomorrow night it shows the sum of the squares of the decimal digits of 𝑥
    .
    
    For example, a lighthouse showing 23
     will show 22+32=13
     tomorrow, then 12+32=10
    , and then 1
    .
    
    On night 0
     of the season, lighthouse 𝑖
     shows the number 𝑎𝑖
    . From that night on, the law is applied once every night, forever.
    
    Kio calls two lighthouses 𝑖
     and 𝑗
     in tune if there exists a night after which, forever, both of them show exactly the same number on every single night.
    
    Kia asks: how many pairs (𝑖,𝑗)
     with 𝑖<𝑗
     are in tune?
    
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤1000
    ). The description of the test cases follows.
    
    Each test case consists of two lines.
    
    The first line of each test case contains a single integer 𝑛
     (1≤𝑛≤1000
    ) — the number of lighthouses.
    
    The second line contains 𝑛
     integers 𝑎1,𝑎2,…,𝑎𝑛
     (1≤𝑎𝑖≤109
    ) — the number shown by each lighthouse on night 0
    .
    
    It is guaranteed that the sum of 𝑛
     over all test cases does not exceed 1000
    .
    
    Output
    For each test case, print a single integer — the number of pairs (𝑖,𝑗)
     with 𝑖<𝑗
     such that lighthouses 𝑖
     and 𝑗
     are in tune.
    
    Example
    InputCopy
    4
    5
    7 4 16 4 2
    4
    1 7 10 100
    3
    4 16 37
    3
    2 20 4
    OutputCopy
    1
    6
    0
    1
    Note
    In the first test case:
    
    Lighthouse 1
     starts at 7
    : 7→49→97→130→10→1
    , and it stays at 1
     forever.
    Lighthouses 2
     and 4
     both start at 4
    , so they show the same number on every night.
    Lighthouse 3
     starts at 16
     and lighthouse 5
     starts at 2
    ; each of them is at a different point of the cycle Kio found, and never matches anybody.
    So the only pair in tune is (2,4)
    , and the answer is 1
    .
    
    In the second test case, every lighthouse sooner or later reaches 1
     and stays there, so all of them are pairwise in tune, which gives 6
     pairs.
    
    In the fourth test case, on night 1
    , lighthouse 2
     shows 22+02=4
    , and lighthouse 1
     shows 22=4
    . From night 1
     on, they are identical forever. Lighthouse 3
     starts at 4
    , so it is one night ahead of both of them and is in tune with neither.
    
    
    */

//Soution

import java.util.Scanner;
import java.util.HashMap;
 
public class Codeforce {
 
    static int ns(long x) {
        int s = 0;
        while (x > 0) {
            int d = (int)(x % 10);
            s += d * d;
            x /= 10;
        }
        return s;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
 
        while (t-- > 0) {
            int n = scan.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
 
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
 
                for (int step = 0; step < 1000; step++) { 
                    num = ns(num);
                }
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            long ans = 0;
            for (long x : map.values()) {
                ans += x * (x - 1) / 2;
            }
 
            System.out.println(ans);
        }
 
        scan.close();
    }
}
