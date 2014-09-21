// This will take input from the user and determine how many 'holes' are present in 
// each test case. Each test case will be on its own line, contain all upper case letters
// contain no spaces, and will be less than 100 chars in length. There will be less than 
// 41 test cases total.
import java.util.Scanner;

public class HolesInTheText {

	public static void main(String [] args) {
		
		Scanner usrInput = new Scanner(System.in);
		int numTestCases = usrInput.nextInt();
		usrInput.nextLine();
		int totalNumHoles;
		int numOneHole;
		int numTwoHole;
		
		for(int curr_case = 1; curr_case <= numTestCases ; curr_case++) {
			//reset counts for each case
			numOneHole = 0;
			numTwoHole = 0;
			totalNumHoles = 0;
			String testCase = usrInput.nextLine();
			char [] testChars = testCase.toCharArray();
			for(char c: testChars) {
				if((c == 'A') || (c == 'D') || (c == 'O') || 
					(c == 'P') || (c == 'Q') || (c =='R')) {
					numOneHole++;
				}
				else if(c == 'B') {
					numTwoHole++;
				}
			}
			totalNumHoles = (2 * numTwoHole) + (1 * numOneHole);
			System.out.println(totalNumHoles);
		}
	}
}