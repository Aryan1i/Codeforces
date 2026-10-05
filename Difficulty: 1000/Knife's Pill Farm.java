//Problem
    
    /*Mr. Knife has drafted 𝑛
     absurd posts for a channel on a chat platform. His goal is to farm pill emoji reactions. Unfortunately, the channel's pill-farming bot uses an unnecessarily elaborate scoring rule.
    
    The drafts have absurdity ratings 𝑎1,𝑎2,…,𝑎𝑛
    , which may be negative. Mr. Knife must publish exactly 𝑚
     drafts in their original order. Their ratings form a subsequence∗
     𝑏
     of 𝑎
     with length 𝑚
    .
    
    His pill score starts at 0
    . When he publishes the 𝑖
    -th chosen draft, the bot changes his score by 𝑖⋅(𝑏𝑖−𝑏𝑖−1)
    , where 𝑏0=0
    . A negative change deducts points, and the score is allowed to become negative. Thus, his final pill score is
    ∑𝑖=1𝑚𝑖⋅(𝑏𝑖−𝑏𝑖−1).
    
    What is the maximum pill score Mr. Knife can obtain by choosing which drafts to publish?
    
    ∗
    A sequence 𝑎
     is a subsequence of a sequence 𝑏
     if 𝑎
     can be obtained from 𝑏
     by the deletion of several (possibly, zero or all) elements from arbitrary positions.
    
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤104
    ). The description of the test cases follows.
    
    The first line of each test case contains two integers 𝑛
     and 𝑚
     (1≤𝑚≤𝑛≤2⋅105
    ) — the number of drafts and the number of posts Mr. Knife must publish.
    
    The second line contains 𝑛
     integers 𝑎1,𝑎2,…,𝑎𝑛
     (−107≤𝑎𝑖≤107
    ) — the absurdity ratings of the drafts.
    
    It is guaranteed that the sum of 𝑛
     over all test cases does not exceed 2⋅105
    .
    
    Output
    For each test case, print one integer — the maximum pill score Mr. Knife can obtain by publishing exactly 𝑚
     drafts in their original order.
    
    Example
    InputCopy
    6
    5 3
    0 8 1 7 3
    4 3
    0 -4 10 -2
    4 2
    0 5 -2 4
    6 3
    0 9 8 7 6 5
    1 1
    7
    3 2
    5 -100 4
    OutputCopy
    20
    34
    10
    15
    7
    108
    Note
    In the first test case, Mr. Knife can publish the drafts with ratings [0,1,7]
    . His final pill score is
    1⋅(0−0)+2⋅(1−0)+3⋅(7−1)=20.
    
    In the second test case, he can publish the drafts with ratings [0,−4,10]
    . The second post deducts points, but the third post more than makes up for it. His final pill score is
    1⋅(0−0)+2⋅(−4−0)+3⋅(10−(−4))=34.*/

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            long ans = Long.MIN_VALUE;
 
            PriorityQueue<Long> pq =
                    new PriorityQueue<>(Collections.reverseOrder());
 
            long s = 0;
 
            for (int i = 0; i < n; i++) {
 
                long x = sc.nextLong();
 
                if (pq.size() == m - 1) {
 
                    long temp = (long) m * x - s;
 
                    ans = Math.max(ans, temp);
                }
 
                pq.add(x);
                s += x;
                if (pq.size() > m - 1) {
                    s -= pq.poll();
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}
