/*Chef aims to be the richest person in Chefland by his new restaurant franchise. Currently, his assets are worth AA billion dollars and have no liabilities. He aims to increase his assets by XX billion dollars per year.
Also, all the richest people in Chefland are not planning to grow and maintain their current worth.
To be the richest person in Chefland, he needs to be worth at least BB billion dollars. How many years will it take Chef to reach his goal if his value increases by XX billion dollars each year?
Input
•	The first line contains an integer TT, the number of test cases. Then the test cases follow.
•	Each test case contains a single line of input, three integers AA, BB, XX.
Output
For each test case, output in a single line the answer to the problem.
Constraints
•	1≤T≤21 0001≤T≤21 000
•	100≤A<B≤200100≤A<B≤200
•	1≤X≤501≤X≤50
•	XX divides B−AB−A*/

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
		    int x = sc.nextInt();
		    int diff = b-a;
		    int time = diff/x;
		    System.out.println(time);
		}

	}
}
