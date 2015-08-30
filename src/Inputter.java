// Done by: Gangadevi D/O Balakrishnan

import java.util.ArrayList;
import java.util.Scanner;

public class Inputter {
	private ArrayList<String> titles = new ArrayList<String>();
	private ArrayList<String> wordsToIgnore = new ArrayList<String>();
	private Scanner sc = new Scanner(System.in);

	public void readInput() {

		System.out.printf("Enter the titles:" + "\n"
				+ "(press enter twice to exit) " + "\n");
		sc = new Scanner(System.in);
		getInputs(titles);

		System.out.printf("Enter the words to be ignored: " + "\n"
				+ "(press enter twice to exit)" + "\n");
		getInputs(wordsToIgnore);

	}

	private void getInputs(ArrayList<String> list) {
		while (true) {
			String lines = sc.nextLine();

			if (lines.equals("")) {
				break;
			}

			list.add(lines);
		}
	}

	public ArrayList<String> getTitles() {
		return titles;
	}

	public ArrayList<String> getwordsToIgnore() {
		return wordsToIgnore;
	}
}
