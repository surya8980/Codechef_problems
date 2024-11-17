/*Chef has three spells. Their powers are AA, BB, and CC respectively. Initially, Chef has 00 hit points, and if he uses a spell with power PP, then his number of hit points increases by PP.
Before going to sleep, Chef wants to use exactly two spells out of these three. Find the maximum number of hit points Chef can have after using the spells.
Input Format
•	The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
•	The first and only line of each test case contains three space-separated integers AA, BB, and CC.
Output Format
For each test case, print a single line containing one integer — the maximum number of hit points.
Constraints
•	1≤T≤1041≤T≤104
•	1≤A,B,C≤1081≤A,B,C≤108
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int arr[]=new int [3];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.println(arr[1]+arr[2]);
		}
	}
}
