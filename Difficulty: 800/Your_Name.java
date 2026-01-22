//problem

    /*Your Name
    time limit per test1 second
    memory limit per test256 megabytes
    khba is writing his girlfriend's name. He has 𝑛
     cubes, each with one lowercase Latin letter written on it. They are arranged in a row, forming a string 𝑠
    . His girlfriend's name is also a string 𝑡
    , consisting of 𝑛
     lowercase Latin letters.
    
    To prove his love, he must check whether it is possible to rearrange the letters of string 𝑠
     so that it becomes her name 𝑡
    .
    
    Input
    The first line contains an integer 𝑞
     (1≤𝑞≤1000
    ) — the number of test cases.
    
    The first line of each test case contains an integer 𝑛
     (1≤𝑛≤20
    ).
    
    The second line of each test case contains two distinct strings 𝑠
     and 𝑡
    , each consisting of 𝑛
     lowercase Latin letters.
    
    Output
    For each test case, output "YES" if the letters of 𝑠
     can be arranged to form 𝑡
    ; otherwise, output "NO".
    
    You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as positive responses.
    
    Example
    InputCopy
    5
    7
    humitsa mitsuha
    4
    orhi hori
    6
    aakima makima
    6
    nezuqo nezuko
    6
    misaka mikasa
    OutputCopy
    YES
    YES
    NO
    NO
    YES
    Note
    In the first example, the initial string is "humitsa", and the following operations can be performed:
    
    swap the first and third characters, resulting in "muhitsa"
    swap the second and fourth characters, resulting in "mihutsa"
    swap the third and fifth characters, resulting in "mithusa"
    swap the fourth and sixth characters, resulting in "mitsuha"
    In the second example, the initial string is "orhi", and the following operations can be performed:
    
    swap the second and third characters, resulting in "ohri"
    swap the first and second characters, resulting in "hori"
    
    */

//Solution

import java.util.Scanner;
public class CarnivalWheel{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        while(n-->0){
            int x=scn.nextInt();
            String s=scn.next();
            StringBuilder sb = new StringBuilder(s);
            String t=scn.next();
            int flag=0;
            for(int i=0;i<t.length();i++){
                int y=t.charAt(i);
                int found=0;
                for(int j=0;j<sb.length();j++){
                    int z=sb.charAt(j);
                    found=0;
                    if(y==z){
                        found=1;
                        sb.deleteCharAt(j);
                        break;
                    }
                }
                if(found==0){
                    flag=1;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag==0){
                System.out.println("YES");
            }
        }
    }
}
