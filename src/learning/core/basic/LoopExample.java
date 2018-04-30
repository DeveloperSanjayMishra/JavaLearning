package learning.core.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
For a given range of numbers (Say N1-N2), a sequence jumper will always start from the first number(N1) 
and will make a jump of "K" for "J" times. You need to print the sum of all the numbers jumper has jumped on 
including the number from where jump starts. You can see a sample test case for more details below.
 

Input:
2
25 75
10 3
10 100
25 2
 Output:
160
105

 Explanation:
The first line of the input is "2" which means there are two test cases in total. 
Each test case is of two lines. The first line denotes the range of the numbers and 
the second line has the jump size followed by the number of jumps.
 
For the first test case, the jumper will start at 25 and take 3 jumps with an interval of 10. 
So,the jumper's start position is 25. After the first jump, it will be at 35 and after the second jump it will be at 45. 
Finally, after the third jump, it will be at 55.
 
Hence, the output for this test case would be 25 + 35 + 45 + 55 = 160.
For the second test case, the jumper will start from 10 and take 2 jumps with an interval of 25. 
So, the jumper's start position is 10, after the first jump, it will be at 35. 
After the second jump, it will be at 60. Hence, the output for this test case would be 10 + 35 + 60 = 105.
 */

public class LoopExample {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n*2];
		for(int i = 0; i < n*2; i++) {
			str[i] = br.readLine();
		}
		for(int i = 0; i < n; i++) {
			String[] strArray1 = str[i*2].split(" ");
			String[] strArray2 = str[i*2+1].split(" ");
			int[] range = new int[2];
			int[] nxt = new int[2]; 
			for(int j=0; j < 2; j++) {
				range[j] = Integer.parseInt(strArray1[j]);
				nxt[j] = Integer.parseInt(strArray2[j]);
			}
			int sum = 0;
			int n1 = range[0];
			int value = nxt[0];
			for(int k = 0; k <= nxt[1]; k++) {
				sum = sum + n1;
				n1 = value+ n1 ;
			}
			System.out.println(sum);
		}
	}
	
	/*
	     public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            String rangeLine = br.readLine();
            String[] split = rangeLine.split(" ");
            int r1 = Integer.parseInt(split[0]);
            int r2 = Integer.parseInt(split[1]);

            String jumpAndNumberLine = br.readLine();
            String[] split1 = jumpAndNumberLine.split(" ");
            int k = Integer.parseInt(split1[0]);
            int n = Integer.parseInt(split1[1]);
            int sum = getSum(r1, r2, k, n);
            System.out.println(sum);
        }

        br.close();
    }

    private static int getSum(int r1, int r2, int k, int n) {
        int sum = 0;
        for (int i = r1, jumpCounter = 0; i <= r2 && jumpCounter <= n; i = i + k, jumpCounter++) {
            sum = sum + i;
        }
        return sum;  
    } 
	 
	  
	 */
}
