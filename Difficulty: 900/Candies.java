  //Problem
    
    /*Candies
    time limit per test1 second
    memory limit per test256 megabytes
    Recently Vova found 𝑛
     candy wrappers. He remembers that he bought 𝑥
     candies during the first day, 2𝑥
     candies during the second day, 4𝑥
     candies during the third day, …
    , 2𝑘−1𝑥
     candies during the 𝑘
    -th day. But there is an issue: Vova remembers neither 𝑥
     nor 𝑘
     but he is sure that 𝑥
     and 𝑘
     are positive integers and 𝑘>1
    .
    
    Vova will be satisfied if you tell him any positive integer 𝑥
     so there is an integer 𝑘>1
     that 𝑥+2𝑥+4𝑥+⋯+2𝑘−1𝑥=𝑛
    . It is guaranteed that at least one solution exists. Note that 𝑘>1
    .
    
    You have to answer 𝑡
     independent test cases.
    
    Input
    The first line of the input contains one integer 𝑡
     (1≤𝑡≤104
    ) — the number of test cases. Then 𝑡
     test cases follow.
    
    The only line of the test case contains one integer 𝑛
     (3≤𝑛≤109
    ) — the number of candy wrappers Vova found. It is guaranteed that there is some positive integer 𝑥
     and integer 𝑘>1
     that 𝑥+2𝑥+4𝑥+⋯+2𝑘−1𝑥=𝑛
    .
    
    Output
    Print one integer — any positive integer value of 𝑥
     so there is an integer 𝑘>1
     that 𝑥+2𝑥+4𝑥+⋯+2𝑘−1𝑥=𝑛
    .
    
    Example
    InputCopy
    7
    3
    6
    7
    21
    28
    999999999
    999999984
    OutputCopy
    1
    2
    1
    7
    4
    333333333
    333333328
    Note
    In the first test case of the example, one of the possible answers is 𝑥=1,𝑘=2
    . Then 1⋅1+2⋅1
     equals 𝑛=3
    .
    
    In the second test case of the example, one of the possible answers is 𝑥=2,𝑘=2
    . Then 1⋅2+2⋅2
     equals 𝑛=6
    .
    
    In the third test case of the example, one of the possible answers is 𝑥=1,𝑘=3
    . Then 1⋅1+2⋅1+4⋅1
     equals 𝑛=7
    .
    
    In the fourth test case of the example, one of the possible answers is 𝑥=7,𝑘=2
    . Then 1⋅7+2⋅7
     equals 𝑛=21
    .
    
    In the fifth test case of the example, one of the possible answers is 𝑥=4,𝑘=3
    . Then 1⋅4+2⋅4+4⋅4
     equals 𝑛=28
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
            
            for (int k = 2; k < 32; k++) {
                long sum = (1L << k) - 1;
                if (n % sum == 0) {
                    System.out.println(n / sum);
                    break;
                }
            }
        }
    }
}
