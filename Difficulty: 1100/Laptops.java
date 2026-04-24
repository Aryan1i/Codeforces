//Problem
    
    /*A. Laptops
    time limit per test1 second
    memory limit per test256 megabytes
    One day Dima and Alex had an argument about the price and quality of laptops. Dima thinks that the more expensive a laptop is, the better it is. Alex disagrees. Alex thinks that there are two laptops, such that the price of the first laptop is less (strictly smaller) than the price of the second laptop but the quality of the first laptop is higher (strictly greater) than the quality of the second laptop.
    
    Please, check the guess of Alex. You are given descriptions of n laptops. Determine whether two described above laptops exist.
    
    Input
    The first line contains an integer n (1 ≤ n ≤ 105) — the number of laptops.
    
    Next n lines contain two integers each, ai and bi (1 ≤ ai, bi ≤ n), where ai is the price of the i-th laptop, and bi is the number that represents the quality of the i-th laptop (the larger the number is, the higher is the quality).
    
    All ai are distinct. All bi are distinct.
    
    Output
    If Alex is correct, print "Happy Alex", otherwise print "Poor Alex" (without the quotes).
    
    Examples
    InputCopy
    2
    1 2
    2 1
    OutputCopy
    Happy Alex
    */

//Solution

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[][] laptops = new int[n][2];
 
        for (int i = 0; i < n; i++) {
            laptops[i][0] = sc.nextInt(); // price
            laptops[i][1] = sc.nextInt(); // quality
        }
 
        // Sort by price
        Arrays.sort(laptops, (a, b) -> a[0] - b[0]);
 
        for (int i = 1; i < n; i++) {
            if (laptops[i][1] < laptops[i - 1][1]) {
                System.out.println("Happy Alex");
                return;
            }
        }
 
        System.out.println("Poor Alex");
    }
}
