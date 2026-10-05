//Problem
    
    /*A. Rumb Needs a Hand
    time limit per test1 second
    memory limit per test256 megabytes
    
    Mr. Rumb visits a prosthetist because his arms have gone numb. The prosthetist can assemble replacements, but their numbered components are out of order. Apparently, even getting a helping hand requires some assembly.
    
    Formally, the labels on the components form a permutation∗
     𝑝
     of length 𝑛
    . Mr. Rumb can program a machine to perform the following operation exactly once:
    
    choose an integer 𝑚
     (1≤𝑚≤𝑛
    ) and indices 𝑖1<𝑖2<…<𝑖𝑚
    ;
    reverse the elements of 𝑝
     at the chosen indices. More precisely, for every 𝑗
     from 1
     to 𝑚
    , the element at index 𝑖𝑗
     moves to index 𝑖𝑚−𝑗+1
    . All other elements remain unchanged.
    The chosen indices do not have to be consecutive. For example, suppose 𝑝=[1,6,3,4,5,2]
    . If you choose indices 2
    , 4
    , and 6
    , the elements shown in red are reversed, and 𝑝
     becomes [1,2,3,4,5,6]
    .
    
    Determine whether Mr. Rumb can sort 𝑝
     in increasing order.
    
    ∗
    A permutation of length 𝑛
     is an array consisting of 𝑛
     distinct integers from 1
     to 𝑛
     in arbitrary order. For example, [2,3,1,5,4]
     is a permutation, but [1,2,2]
     is not a permutation (2
     appears twice in the array), and [1,3,4]
     is also not a permutation (𝑛=3
     but there is 4
     in the array).
    
    Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡
     (1≤𝑡≤500
    ). The description of the test cases follows.
    
    The first line of each test case contains a single integer 𝑛
     (1≤𝑛≤100
    ).
    
    The second line contains a permutation 𝑝1,𝑝2,…,𝑝𝑛
     of the integers from 1
     to 𝑛
    .
    
    Output
    For each test case, output YES if it is possible to sort 𝑝
     in increasing order after performing exactly one operation. Otherwise, output NO.
    
    You can output the answer in any case (upper or lower). For example, the strings yEs, yes, Yes, and YES will be recognized as positive responses.
    
    Example
    InputCopy
    5
    1
    1
    4
    4 2 3 1
    4
    3 4 1 2
    5
    2 1 3 5 4
    6
    1 6 3 4 5 2
    OutputCopy
    YES
    YES
    NO
    NO
    YES
    Note
    In the first test case, choose the only index. Reversing a single element does not change the permutation, so the requirement to perform exactly one operation is satisfied.
    
    In the second test case, choose indices 1
     and 4
    . The resulting permutation is [1,2,3,4]
    .
    
    In the fifth test case, choose indices 2
    , 4
    , and 6
    . Notice that the chosen indices are not consecutive.
    
    
    */

//Solution

 
import java.util.ArrayList;
import java.util.Scanner;
 
public class codeforces {
 
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		while(t-- > 0) {
			int n = scn.nextInt();
			
			int[] ori = new int[n];
			
			for(int i = 0; i < n; i++) {
				ori[i] = scn.nextInt();
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i = n - 1; i >= 0 ;i--) {
				if(ori[i] == i + 1) continue;
				else {
					list.add(ori[i]);
				}
			}
			
			int s = list.size();
			
			int i = 0; 
			int j = s - 1;
			
			while(i <= j) {
				if(ori[i] > ori[j]) {
					int temp = ori[i];
					ori[i] = ori[j];
					ori[j] = temp;
				}
				i++;
				j--;
			}
			
			boolean f = true;
			for(int k = 1; k < s; k++) {
				if(list.get(k) < list.get(k - 1)) { 
					f = false;
					System.out.println("No");
					break;
				}
			}
			
			if(f)System.out.println("Yes");
			
		}
	}
 
}
}
