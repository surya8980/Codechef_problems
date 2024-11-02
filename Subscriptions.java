/*A new TV streaming service was recently started in Chefland called the Chef-TV.
A group of NN friends in Chefland want to buy Chef-TV subscriptions. We know that 66 people can share one Chef-TV subscription. Also, the cost of one Chef-TV subscription is XX rupees. Determine the minimum total cost that the group of NN friends will incur so that everyone in the group is able to use Chef-TV.
Input Format
•	The first line contains a single integer TT — the number of test cases. Then the test cases follow.
•	The first and only line of each test case contains two integers NN and XX — the size of the group of friends and the cost of one subscription.
Output Format
For each test case, output the minimum total cost that the group will incur so that everyone in the group is able to use Chef-TV.
Constraints
•	1≤T≤10001≤T≤1000
•	1≤N≤1001≤N≤100
•	1≤X≤10001≤X≤1000*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int subscriptions = (N + 5) / 6;
            int totalCost = subscriptions * X;
            System.out.println(totalCost);
		}
		
	}
}
