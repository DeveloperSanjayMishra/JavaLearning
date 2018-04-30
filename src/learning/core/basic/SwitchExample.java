package learning.core.basic;

import java.io.IOException;
import java.util.Scanner;

/*
Weekday
 
For this problem statement, you will be given the day of the week and you need to print the Name of the day. 
Assume that the week starts on Monday, i.e. 1=Monday, 2=Tuesday and so on.
 

Input:
2
6
2
Output:
Saturday
Tuesday

 
Explanation:
The first line is "2" which means there are 2 test cases in total. 
The first test case is "6" which means print the 6th day which is "Saturday". 
The second test case is "2" meaning we need to print the 2nd day which is "Tuesday".
 */

public class SwitchExample {
	public static void main(String[] args) throws  IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i =0; i <n; i++) {
			num[i] = scanner.nextInt();
		}
		for(int i =0; i <n; i++) {
			checkDay(num[i]);
		}
		
	}
	public static void checkDay(int day) {
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			break;
		}
	}
}
