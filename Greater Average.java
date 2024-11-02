/*You are given 33 numbers A,B,A,B, and CC.
Determine whether the average of AA and BB is strictly greater than CC or not?
NOTE: Average of AA and BB is defined as (A+B)22(A+B). For example, average of 55 and 99 is 77, average of 55 and 88 is 6.56.5.
Input Format
•	The first line of input will contain a single integer TT, denoting the number of test cases.
•	Each test case consists of 33 integers A,B,A,B, and CC.
Output Format
For each test case, output YES if average of AA and BB is strictly greater than CC, NO otherwise.
You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).
Constraints
•	1≤T≤10001≤T≤1000
•	1≤A,B,C≤101≤A,B,C≤10*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    float avg = ((float)a+(float)b)/2;
		    if( avg>(float)c) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
