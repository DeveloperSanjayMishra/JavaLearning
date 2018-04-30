package learning.core.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Printing the length of an array

For this problem, you need to print the length of the arrays provided to you in the test cases.
The details of the input provided are as below:

The first line is number "n" which denotes the number of arrays.
Next "n" lines represent the input for that array
Each of this line consists of space-separated integers
Example:

Input:
3
1 1 1 1
12 21 33 44 55 66
8

Output:
  4
  6
  1

Explanation: The first line of the input i.e. 3 represents the number of arrays. That means there will be 3 more lines after the first line. The second line of input i.e. "1 1 1 1" represents the first array As you can see it's an array of 4  elements. Hence, the output for the first test case is 4. Similarly, for second array size is 6. Hence, the second line of output is 6. Likewise, for the third array, the output would be 1.
 */

public class ArrayExample2 {
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    String[] input = new String[n];
	    for(int i =0; i < n ; i++){
	        input[i] = br.readLine();

	    }
	    for(int i =0; i < n ; i++){
	        String[] strArray = input[i].split(" ");
	        
	        System.out.println(strArray.length);
	    }
    
    }
}
