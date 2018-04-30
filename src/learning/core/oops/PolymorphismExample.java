package learning.core.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 Description
This is in continuation to the previous student cards problem. 
Make the fields of the Student, Report and Bus class private and use the getter and setter functions (if not already implemented) 
to ensure encapsulation. Also, we make a new method named quality. 
In the student class it tells whether a given admission number (parameter) is of a 'New student' (>=10) 
or an 'Old student'. 
Override this method in the Bus class to tell whether 
the student with that admission number is an 'Out of city student' (>=20) or an 'In-city student'. 
Implement overloading in the report class where this method takes another parameter- average, 
and tells whether the student is 'Above average  student' or 'Below average student'. 
Refer to the main function given in the stub for calling these methods.

Sample test case:
Input:

A 1 9 99 yes 27 B+ Jaydeep
B 2 10 88 no 28 A+ Kunal
2

Output:

B 88 28 Kunal
You will graduate in 2 years
Old student
Above average student
Out of city student

Explanation: 2<10 so old student, 99>55 so above average, and 28>20 so out of city
 */
abstract class absdetail{
	public String father = null;;
	public abstract void setFather(String father);
	public abstract String getFather();
}

interface year{
    public int getYear(int std);
}

class Student extends absdetail{
	private String name = null;
	private int ANo;
	private int STD;

	public Student(String name, int ANo, int STD) {
		this.name = name;
		this.ANo = ANo;
		this.STD = STD;
	}
	
	@Override
	public void setFather(String father) {
		this.father = father;
	}
	public String getFather() {
		return father;
	}
	public String getName() {
		return name;
	}

	public int getANo() {
		return ANo;
	}

	public int getSTD() {
		return STD;
	}
	public void quality(int ANo){
		if(this.getANo() >= 10) {
			System.out.println("New student");
		}else {
			System.out.println("Old student");
		}
	}
}

class Report extends Student implements year{
	private int ptage;
	private String pass = null;
	public Report(String name, int ANo, int STD, int ptage, String pass) {
		super(name, ANo, STD);
		this.ptage = ptage;
		this.pass = pass;
	}
	public int getptage() {
		return ptage;
	}
	public String getpass() {
		return pass;
	}
	@Override
    public int getYear(int std) {
		return (12-std);   
    }

	public void quality(int ANo, int average){
		if (this.getANo() == ANo)
		{
			if(this.getptage() >= average) {
				System.out.println("Above average student");
			}else {
				System.out.println("Below average student");
			}
		}
	}
}

class Bus extends Student {
	private int route;
	private String BG = null;
	public Bus(String name, int ANo, int STD, int route, String BG) {
		super(name, ANo, STD);
		this.BG = BG;
		this.route = route;
	}
	public String getBG() {
		return BG;
	}
	public int getroute() {
		return route;
	}
	@Override
	public void quality(int ANo){
		if (this.getANo() == ANo)
		{
			if(this.getroute() >= 20) {
				System.out.println("Out of city student");
			}else {
				System.out.println("In-city student");
			}
		}
	}
}


public class PolymorphismExample {
	 public static void main(String[] args) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	String[] strNums1, strNums2;
	    	strNums1 = br.readLine().split("\\s");
	    	strNums2 = br.readLine().split("\\s");
	    	Report r1 = new Report(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[3]),strNums1[4]);
	    	Report r2 = new Report(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[3]),strNums2[4]);
	    	Bus b1 = new Bus(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[5]),strNums1[6]);
	    	Bus b2 = new Bus(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[5]),strNums2[6]);
	    	r1.setFather(strNums1[7]);
	    	r2.setFather(strNums2[7]);
	    	b1.setFather(strNums1[7]);
	    	b2.setFather(strNums2[7]);
	    	int n = Integer.parseInt(br.readLine());
	    	if(n==r1.getANo()) {
	    		System.out.println(r1.getName() +" "+ r1.getptage() + " "+b1.getroute()+ " "+b1.getFather());
	    		System.out.println("You will graduate in " + r1.getYear(r1.getSTD())+ " years");
	    		r1.quality(r1.getANo());
	    		r1.quality(r1.getANo(),55);
	    		b1.quality(r1.getANo());
	    	}
	    	else if(n==r2.getANo()){
	    		System.out.println(r2.getName() +" "+ r2.getptage() + " "+b2.getroute()+ " "+b2.getFather());
	    		System.out.println("You will graduate in " + r2.getYear(r2.getSTD())+ " years");
	    		r2.quality(r2.getANo());
	    		r2.quality(r2.getANo(),55);
	    		b2.quality(r2.getANo());
	    	}	
	    	else
	    		System.out.println("No entry found");
	    }
}

