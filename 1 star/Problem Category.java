/*Chef prepared a problem. The admin has rated this problem for xx points.
A problem is called :
1.	Easy if 1≤x<1001≤x<100
2.	Medium if 100≤x<200100≤x<200
3.	Hard if 200≤x≤300200≤x≤300
Find the category to which Chef’s problem belongs.
Input Format
•	The first line contains TT denoting the number of test cases. Then the test cases follow.
•	The first and only line of each test case contains a single integer xx.
Output Format
For each test case, output in a single line the category of Chef's problem, i.e whether it is an Easy, Medium or Hard problem. The output is case sensitive.
Constraints
•	1≤T≤501≤T≤50
•	1≤x≤3001≤x≤300

*/
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
		    int x=sc.nextInt();
		    if(x>=1&&x<100)System.out.println("Easy");
		    if(x>=100&&x<200)System.out.println("Medium");
		    if(x>=200&&x<=300)System.out.println("Hard");
		}
	}
}
