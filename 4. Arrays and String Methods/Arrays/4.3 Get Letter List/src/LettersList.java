public class LettersList {

	public static String[] getLettersList(String word) {

		String[] lettersList = new String[word.length()];

		for (int index = 0; index < word.length(); index++) {
			lettersList[index] = word.substring(index, index + 1);
		}
		return lettersList;
	}
}