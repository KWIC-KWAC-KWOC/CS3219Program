import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author WeiLin
 *
 */
public class PipesAndFilter {

	private static Scanner sc;
	/**
	 * @param args
	 */
	
	public void runForInput() {
		ArrayList<String> listOfLines = new ArrayList<String>();
		ArrayList<String> listOfIgnoredWord = new ArrayList<String>();
		
		System.out.printf("Enter the titles:" + "\n" + "(press enter twice to exit) " + "\n");
		sc = new Scanner(System.in);	
		takeInInputs(listOfLines);
		
		System.out.printf("Enter the words to be ignored: " + "\n" + "(press enter twice to exit)" + "\n");
		takeInInputs(listOfIgnoredWord);
		
		new InputData(listOfIgnoredWord, listOfLines);
	}

	private static void takeInInputs(ArrayList<String> listOfLines) {
		while (true) {
			String lines = sc.nextLine();
			
			if (lines.equals("")) {
				break;
			}
			
			listOfLines.add(lines);		
		}
	}

}
