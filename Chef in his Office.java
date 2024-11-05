/*Recently Chef joined a new company. In this company, the employees have to work for XX hours each day from Monday to Thursday. Also, in this company, Friday is called Chill Day — employees only have to work for YY hours (Y<X)(Y<X) on Friday. Saturdays and Sundays are holidays.
Determine the total number of working hours in one week.
Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers XX and YY — the number of working hours on each day from Monday to Thursday and the number of working hours on Friday respectively.
Output Format
For each test case, output the total number of working hours in one week.
Constraints
1≤T≤1001≤T≤100
2≤X≤122≤X≤12
1≤Y<X1≤Y<X*/

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
		    int x= sc.nextInt();
		    int y = sc.nextInt();
		    int hrs = 4*x+y;
		    System.out.println(hrs);
		}
	}
}

