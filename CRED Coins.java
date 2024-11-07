/*For each bill you pay using CRED, you earn XX CRED coins.
At CodeChef store, each bag is worth 100100 CRED coins.
Chef pays YY number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.
Input Format
•	First line will contain TT, number of test cases. Then the test cases follow.
•	Each test case contains of a single line of input, two integers XX and YY.
Output Format
For each test case, output in a single line - the maximum number of bags Chef can get from the CodeChef store.
Constraints
•	1≤T≤1001≤T≤100
•	1≤X,Y≤10001≤X,Y≤1000

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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int res = x*y;
		    if(res<100)System.out.println(0);
		    else System.out.println(res/100);
		}

	}
}
