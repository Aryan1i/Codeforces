//Problem

    /*Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:
    
    deletes all the vowels,
    inserts a character "." before each consonant,
    replaces all uppercase consonants with corresponding lowercase ones.
    Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.
    
    Help Petya cope with this easy task.
    
    Input
    The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.
    
    Output
    Print the resulting string. It is guaranteed that this string is not empty.
    
    Examples
    InputCopy
    tour
    OutputCopy
    .t.r
    InputCopy
    Codeforces
    OutputCopy
    .c.d.f.r.c.s
    InputCopy
    aBAcAba
    OutputCopy
    .b.c.b
    */

//Solution

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            
            if (ch != 'a' && ch != 'o' && ch != 'y' &&
                ch != 'e' && ch != 'u' && ch != 'i') {
                
                result.append(".");
                result.append(ch);
            }
        }
        
        System.out.println(result.toString());
    }
}
