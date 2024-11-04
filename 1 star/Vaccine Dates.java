/*Chef has taken his first dose of vaccine DD days ago. He may take the second dose no less than LL days and no more than RR days since his first dose.
Determine if Chef is too early, too late, or in the correct range for taking his second dose.
Input Format
•	First line will contain TT, number of testcases. Then the testcases follow.
•	Each testcase contains of a single line of input, three integers D,L,RD,L,R.
Output Format
For each test case, print a single line containing one string - "Too Early" (without quotes) if it's too early to take the vaccine, "Too Late" (without quotes) if it's too late to take the vaccine, "Take second dose now" (without quotes) if it's the correct time to take the vaccine.
Constraints
•	1≤T≤1051≤T≤105
•	1≤D≤1091≤D≤109
•	1≤L≤R≤1091≤L≤R≤109
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
		    int d=sc.nextInt();
		    int l=sc.nextInt();
		    int r = sc.nextInt();
		    if(d>=l&&d<=r) System.out.println("Take second dose now");
		    else if (d<l)System.out.println("Too Early");
		    else if (d>r)System.out.println("Too Late");
		}
	}
}
