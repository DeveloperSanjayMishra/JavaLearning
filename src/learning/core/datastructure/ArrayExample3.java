package learning.core.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Printing the length of an array in reverse order
For this problem, you need to print the length of the arrays provided to you in the test cases in reverse order, 
i.e. the length of the last array provided as input will be printed first.
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
1
6
4

Explanation: The first line of the input i.e. 3 represents the number of arrays. That means there will be 3 more lines after the first line. The second line of input i.e. "1 1 1 1" represents the first array. As you can see it's an array of 4 elements. Hence array length for the first array is 4. Similarly, for the second array, it is 6.  Likewise, for the third array, array length would be 1. As we are printing these in reverse order the output would be 1 6 4.
 */

public class ArrayExample3 {
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    String[] input = new String[n];
	    for(int i =0; i < n ; i++){
	        input[i] = br.readLine();

	    }
	    for(int i =n-1; i >=0 ; i--){
	        String[] strArray = input[i].split(" ");
	        
	        System.out.println(strArray.length);
	    }
    
    }
}
