/*No play and eating all day makes your belly fat. This happened to Chef during the lockdown. His weight before the lockdown was w1w1 kg (measured on the most accurate hospital machine) and after MM months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate),
he got the result that his weight was w2w2 kg (w2>w1w2>w1).
Scientific research in all growing kids shows that their weights increase by a value between x1x1 and x2x2 kg (inclusive) per month, but not necessarily the same value each month. Chef assumes that he is a growing kid. Tell him whether his home scale could be giving correct results.
Input
•	The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
•	The first and only line of each test case contains five space-separated integers w1w1, w2w2, x1x1, x2x2 and MM.
Output
For each test case, print a single line containing the integer 11 if the result shown by the scale can be correct or 00 if it cannot.
Constraints
•	1≤T≤1051≤T≤105
•	1≤w1<w2≤1001≤w1<w2≤100
•	0≤x1≤x2≤100≤x1≤x2≤10
•	1≤M≤101≤M≤10

*/
import java.io.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] inputs = br.readLine().split(" ");
            int w1 = Integer.parseInt(inputs[0]);
            int w2 = Integer.parseInt(inputs[1]);
            int x1 = Integer.parseInt(inputs[2]);
            int x2 = Integer.parseInt(inputs[3]);
            int m = Integer.parseInt(inputs[4]);
            
            int diff = w2 - w1;
            int minGain = x1 * m;
            int maxGain = x2 * m;
            
            if (diff >= minGain && diff <= maxGain) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        // Output all results at once
        System.out.print(sb);
    }
}
// If TLE comes take input as a string and return string 
