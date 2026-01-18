//Problem

    /*Minimum Operations
    time limit per test1 s.
    memory limit per test256 MB
    You are a lover of bacteria. You want to raise some bacteria in a box.
    
    Initially, the box is empty. Each morning, you can put any number of bacteria into the box. And each night, every bacterium in the box will split into two bacteria. You hope to see exactly 𝑥
     bacteria in the box at some moment.
    
    What is the minimum number of bacteria you need to put into the box across those days?
    
    Input
    The only line containing one integer 𝑥
     (1≤𝑥≤109
    ).
    
    Output
    The only line containing one integer: the answer.
    
    Examples
    InputCopy
    5
    OutputCopy
    2
    InputCopy
    8
    OutputCopy
    1
    Note
    For the first sample, we can add one bacterium in the box in the first day morning and at the third morning there will be 4
     bacteria in the box. Now we put one more resulting 5
     in the box. We added 2
     bacteria in the process so the answer is 2
    .
    
    For the second sample, we can put one in the first morning and in the 4-th morning there will be 8
     in the box. So the answer is 1
    .*/

//Solution

import java.util.Scanner;
public class CarnivalWheel
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n=scn.nextInt();
	    
	    int count=0;
        while(n>0){
            int x=n&1;
            if(x==1){
                count++;
            }
            n>>=1;
        }
        System.out.println(count);
	}
}
