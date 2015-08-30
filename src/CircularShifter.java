// Done by: Gangadevi D/O Balakrishnan

import java.util.ArrayList;

public class CircularShifter {

	private static ArrayList<String> titles = new ArrayList<String>();
	private static ArrayList<String> wordsToIgnore = new ArrayList<String>();
	private static ArrayList<String> shiftedWords = new ArrayList<String>();

	// setup for shifting
	public void setTitles(ArrayList<String> titleList) {
		titles = titleList;
	}

	public void setwordsToIgnore(ArrayList<String> wordsToIgnoreList) {
		wordsToIgnore = wordsToIgnoreList;
	}

	public ArrayList<String> executeShifting() {
		for (int i = 0; i < titles.size(); i++) {
			String title = titles.get(i);
			splitTitle(title);
		}

		return shiftedWords;
	}

	private void splitTitle(String title) {
		ArrayList<String> wordsInTitle = new ArrayList<String>();
		String[] words = title.split("[\\s']");
		for (String s : words) {
			wordsInTitle.add(s);
		}
		shiftWords(wordsInTitle);
	}


	private void shiftWords(ArrayList<String> splitTitle) {
		for (int i = 0; i < splitTitle.size(); i++) {
			String word = splitTitle.get(0);
			if (compareWords(word)) {
				splitTitle.remove(0);
				splitTitle.add(word);
			} else {
				shiftedWords.add(splitTitle.toString());
				splitTitle.remove(0);
				splitTitle.add(word);
			}
		}
	}

	private boolean compareWords(String word) {
		boolean isKeyword = false;

		for (int i = 0; i < wordsToIgnore.size(); i++) {
			if (word.toLowerCase().equals(wordsToIgnore.get(i).toLowerCase())) {
				isKeyword = true;
			}
		}
		return isKeyword;
	}
	
}
