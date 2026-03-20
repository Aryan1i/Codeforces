//Problem
    
    /*Polycarp remembered the 2020
    -th year, and he is happy with the arrival of the new 2021
    -th year. To remember such a wonderful moment, Polycarp wants to represent the number 𝑛
     as the sum of a certain number of 2020
     and a certain number of 2021
    .
    
    For example, if:
    
    𝑛=4041
    , then the number 𝑛
     can be represented as the sum 2020+2021
    ;
    𝑛=4042
    , then the number 𝑛
     can be represented as the sum 2021+2021
    ;
    𝑛=8081
    , then the number 𝑛
     can be represented as the sum 2020+2020+2020+2021
    ;
    𝑛=8079
    , then the number 𝑛
     cannot be represented as the sum of the numbers 2020
     and 2021
    .
    Help Polycarp to find out whether the number 𝑛
     can be represented as the sum of a certain number of numbers 2020
     and a certain number of numbers 2021
    .
    
    Input
    The first line contains one integer 𝑡
     (1≤𝑡≤104
    ) — the number of test cases. Then 𝑡
     test cases follow.
    
    Each test case contains one integer 𝑛
     (1≤𝑛≤106
    ) — the number that Polycarp wants to represent as the sum of the numbers 2020
     and 2021
    .
    
    Output
    For each test case, output on a separate line:
    
    "YES" if the number 𝑛
     is representable as the sum of a certain number of 2020
     and a certain number of 2021
    ;
    "NO" otherwise.
    You can output "YES" and "NO" in any case (for example, the strings yEs, yes, Yes and YES will be recognized as positive).
    
    Example
    InputCopy
    5
    1
    4041
    4042
    8081
    8079
    OutputCopy
    NO
    YES
    YES
    YES
    NO
    
    */

//Solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            
            int k = n / 2020;
            int rem = n % 2020;
            
            if(rem <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
