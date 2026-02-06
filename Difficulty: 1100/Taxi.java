//Problem

    /*Taxi
    time limit per test3 seconds
    memory limit per test256 megabytes
    After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?
    
    Input
    The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.
    
    Output
    Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.
    
    Examples
    InputCopy
    5
    1 2 4 3 3
    OutputCopy
    4
    InputCopy
    8
    2 3 4 4 2 1 3 1
    OutputCopy
    5
    Note
    In the first test we can sort the children into four cars like this:
    
    the third group (consisting of four children),
    the fourth group (consisting of three children),
    the fifth group (consisting of three children),
    the first and the second group (consisting of one and two children, correspondingly).
    There are other ways to sort the groups into four cars.
    
    */

//Solution

import java.util.Scanner;
public class codeforces {
 
    public static void main(String[] args){
 
        Scanner scn=new Scanner(System.in);
 
        int n = scn.nextInt();
 
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
 
        for(int i = 0;i< n;i++){
            int temp = scn.nextInt();
            if(temp == 1 ) one++;
            else if(temp == 2) two++;
            else if(temp == 3 ) three++;
            else four++;
        }
 
        int taxi = four;
        if(one == three){
            taxi+=three;
            taxi += (two+1)/2;
        }else if(one >= three){
            taxi += three;
            one -= three;
            if(two % 2 ==0){
                taxi += two/2;
                taxi += (one+3)/4;
            }else{
                taxi += two/2;
                taxi += one/4;
                if(one%4 <=2){
                    taxi++;
                }else{
                    taxi+=2;
                }
            }
        }else if(one <= three){
            taxi += one;
            three-=one;
            taxi += (two+1)/2;
            taxi+=three;
        }
 
        System.out.println(taxi);
    }
}
