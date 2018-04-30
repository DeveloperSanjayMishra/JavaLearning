package learning.core.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
You are given an integer n in the first line of the input. In the next line you have to scan n space separated integers 
and store them in an array. For all elements, perform the following function:
If the element is odd, add 1 to it, else leave it unchanged. 
Then print the modified array with the elements space separated in a single line.

Sample test case:
Input:

5
7 5 45 7 4

Output:

8 6 46 8 4

Explanation: 1 was added to all the integers except 4(even)

 */
class Operations{
    private int[] numArray;
    private int size;
    Operations(int[] intArray, int n){
        numArray = intArray;
        size = n;
    }
    public void execute(){
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]%2 !=0){
                numArray[i] = numArray[i] +1;
            }
        }
        for(int i = 0; i<numArray.length; i++)
            System.out.print(numArray[i]+" ");
    }
}
public class ArrayExample {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	/*Scan the array length and then the array elements (using buffered reader) and do the required operation on each element and print.*/
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] strArray = input.split(" ");
        int[] intArray = new int[strArray.length];
        for(int i=0; i< strArray.length ; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Operations op = new Operations(intArray, n);
        op.execute();
    }
}
