// Done by: Gangadevi D/O Balakrishnan

import java.util.ArrayList;

public class Outputter {

	public void showOutputToUser(ArrayList<String> shiftedWords) {
		ArrayList<String> wordsToPrint = new ArrayList<String>();

		for (int i = 0; i < shiftedWords.size(); i++) {
			String title = shiftedWords.get(i);
			String capitalizedTitle = capitalizeFirstWord(title);
			wordsToPrint.add(capitalizedTitle);
		}

		for (String s : wordsToPrint) {
			System.out.println(s.replace(",", "").replace("[", "")
					.replace("]", "").trim());
		}
	}

	private String capitalizeFirstWord(String title) {
		ArrayList<String> wordsInTitle = new ArrayList<String>();
		String[] words = title.split("[\\s']");
		wordsInTitle.add(words[0].toUpperCase());
		for (int i = 1; i < words.length; i++) {
			wordsInTitle.add(words[i]);
		}
		return wordsInTitle.toString();
	}
}
