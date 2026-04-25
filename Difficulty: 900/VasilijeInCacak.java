    //Problem
    
    /*Vasilije in Cacak
    time limit per test1 second
    memory limit per test256 megabytes
    Aca and Milovan, two fellow competitive programmers, decided to give Vasilije a problem to test his skills.
    
    Vasilije is given three positive integers: 𝑛
    , 𝑘
    , and 𝑥
    , and he has to determine if he can choose 𝑘
     distinct integers between 1
     and 𝑛
    , such that their sum is equal to 𝑥
    .
    
    Since Vasilije is now in the weirdest city in Serbia where Aca and Milovan live, Cacak, the problem seems weird to him. So he needs your help with this problem.
    
    Input
    The first line contains a single integer 𝑡
     (1≤𝑡≤104
    ) — the number of test cases.
    
    The only line of each test case contains three integers 𝑛
    , 𝑘
     and 𝑥
     (1≤𝑛≤2⋅105
    , 1≤𝑘≤𝑛
    , 1≤𝑥≤4⋅1010
    ) — the maximum element he can choose, the number of elements he can choose and the sum he has to reach.
    
    Note that the sum of 𝑛
     over all test cases may exceed 2⋅105
    .
    
    Output
    For each test case output one line: "YES", if it is possible to choose 𝑘
     distinct integers between 1
     and 𝑛
    , such that their sum is equal to 𝑥
    , and "NO", if it isn't.
    
    You can output the answer in any case (for example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as a positive answer).
    
    Example
    InputCopy
    12
    5 3 10
    5 3 3
    10 10 55
    6 5 20
    2 1 26
    187856 87856 2609202300
    200000 190000 19000000000
    28 5 2004
    2 2 2006
    9 6 40
    47202 32455 613407217
    185977 145541 15770805980
    OutputCopy
    YES
    NO
    YES
    YES
    NO
    NO
    YES
    NO
    NO
    NO
    YES
    YES
    Note
    In the first test case 𝑛=5, 𝑘=3, 𝑥=10
    , so we can choose the numbers: 2
    , 3
    , 5
    , whose sum is 10
    , so the answer is "YES".
    
    In the second test case 𝑛=5, 𝑘=3, 𝑥=3
    , there is no three numbers which satisfies the condition, so the answer is "NO". It can be shown that there are no three numbers whose sum is 3
    .
    
    
    */

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
 
            long minSum = k * (k + 1) / 2;
            long maxSum = k * (2 * n - k + 1) / 2;
 
            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
