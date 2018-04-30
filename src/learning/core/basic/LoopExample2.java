package learning.core.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Creating a Right Angled Triangle
 
Here for a given number "C", you need to print "N" rows of "-" to form a right-angled triangle.

Input:
2
3
4
Output:
-
--
---
-
--
---
----

 
Explanation:
The first line of input is "2", this means there are two test cases. The first test case is "3". 
Hence, three lines are needed to print the right triangle. The second test case is "4". 
Hence, four lines are needed to print the right triangle.
Note: Text after "//" denotes comments.
 */

public class LoopExample2 {
	public static void main(String[] args) throws  IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i =0; i <n; i++) {
			num[i] = scanner.nextInt();
		}
		
		for(int i =0; i <n; i++) {
			for(int j = 0; j < num[i]; j++) {
				for(int k=0; k <=j; k++) {
					System.out.print("-");
				}
				System.out.println("");
			}
		}
	}
}
