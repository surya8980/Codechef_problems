/*Chef wants to buy a stock whose price was SS rupees when the market opened. He will buy the stock if and only if its price is in the range [A,B][A,B]. The price of the stock has changed by C%C% by the time he was trying to buy the stock. Will he be able to buy the stock?
Input Format
•	First line of the input contains TT, the number of testcases. Then the test cases follow.
•	Each test case contains 44 space-separated integers S,A,B,CS,A,B,C in a single line.
Output Format
For each test case, if Chef buys the stock print YES, otherwise print NO.
You may print each character of the string in uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
Constraints
•	1≤T≤10001≤T≤1000
•	0≤S≤1060≤S≤106
•	0≤A≤B≤1060≤A≤B≤106
•	−100≤C≤100−100≤C≤100

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
		    int s = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int newp = s*(100+c);
		    if(newp>=a*100&&newp<=b*100) System.out.println("yes");
		    else System.out.println("no");
		}
	}
}
