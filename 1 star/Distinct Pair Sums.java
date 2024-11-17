/*You are given a range of integers {L,L+1,…,R}{L,L+1,…,R}.
An integer XX is said to be reachable if it can be represented as a sum of two not necessarily distinct integers in this range. 
Find the number of distinct reachable integers.
Input
•	The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
•	The first and only line of each test case contains two space-separated integers LL and RR.
Output
For each test case, print a single line containing one integer — the number of reachable integers.
Constraints
•	1≤T≤1051≤T≤105
•	1≤L≤R≤1061≤L≤R≤106

*/
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int a = sc.nextInt(); 
            int b = sc.nextInt();
            if(a==b)System.out.println(1);
            else{
                int range = 2*b-2*a;
                System.out.println(range+1);
            }
        }
        sc.close();
    }
}
