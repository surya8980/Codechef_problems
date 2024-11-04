/*In Chefland, there are XX schools, and each school has YY students.
The year end results are in and a total of ZZ students passed the exams.
Assuming that all students appeared for the exams, find whether the number of students who passed in Chefland was strictly greater than 50%50%.
Input Format
•	The first line of input will contain a single integer TT, denoting the number of test cases.
•	Each test case consists of three space-separated integers X,Y,X,Y, and ZZ, as mentioned in the statement.
Output Format
For each test case, output on a new line, YES, if the total number of students who passed in Chefland was strictly greater than 50%50%, otherwise print NO.
You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).
Constraints
•	1≤T≤2⋅1041≤T≤2⋅104
•	1≤X≤51≤X≤5
•	1≤Y≤501≤Y≤50
•	0≤Z≤X⋅Y0≤Z≤X⋅Y  */
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
		    int y= sc.nextInt();
		    int z= sc.nextInt();
		    int pass = x*y/2;
		    if(z>pass)System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
