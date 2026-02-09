//Problem
    
    Word Capitalization
    time limit per test2 seconds
    memory limit per test256 megabytes
    Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.
    
    Note, that during capitalization all the letters except the first one remains unchanged.
    
    Input
    A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.
    
    Output
    Output the given word after capitalization.
    
    Examples
    InputCopy
    ApPLe
    OutputCopy
    ApPLe
    InputCopy
    konjac
    OutputCopy
    Konjac


//Solution

import java.util.Scanner;
public class codeforces {

    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        String str = scn.next();

        String ans = "";
        char ch = str.charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }

        System.out.println(ch + str.substring(1));
    }
}
