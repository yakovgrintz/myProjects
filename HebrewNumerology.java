/**
 * this class is calculate numerology of Hebrew letter and strings.
 * 
 * @author yakovgrintz
 *@version 19/11/2021
 */
public class HebrewNumerology {
	/**
	 * The class includes one char-type attribute, and different methods for
	 * calculating the numerology of letters and words.
	 */
	private char _letter;
/**
 * Initialize a HebrewNumerology object 
 * @param letter - the char of object
 */
	public HebrewNumerology(char letter) {
		_letter = letter;

	}

	/**
	 * This method calculates the value of the letter. To calculate the value, we
	 * have created an int variable called "numerology". We initialize it to the
	 * gematric value of the letter.
	 * 
	 * @return numerology - The gematric value of the letter.
	 */
	public int getNumerology() {
		int numerology = 0;
		switch (_letter) {
		case '�':
			numerology = 1;
			break;
		case '�':
			numerology = 2;
			break;
		case '�':
			numerology = 3;
			break;
		case '�':
			numerology = 4;
			break;
		case '�':
			numerology = 5;
			break;
		case '�':
			numerology = 6;
			break;
		case '�':
			numerology = 7;
			break;
		case '�':
			numerology = 8;
			break;
		case '�':
			numerology = 9;
			break;
		case '�':
			numerology = 10;
			break;
		case '�':
			numerology = 20;
			break;
		case '�':
			numerology = 20;
			break;
		case '�':
			numerology = 30;
			break;
		case '�':
			numerology = 40;
			break;
		case '�':
			numerology = 40;
			break;
		case '�':
			numerology = 50;
			break;
		case '�':
			numerology = 50;
			break;
		case '�':
			numerology = 60;
			break;
		case '�':
			numerology = 70;
			break;
		case '�':
			numerology = 80;
			break;
		case '�':
			numerology = 80;
			break;
		case '�':
			numerology = 90;
			break;
		case '�':
			numerology = 90;
			break;
		case '�':
			numerology = 100;
			break;
		case '�':
			numerology = 200;
			break;
		case '�':
			numerology = 300;
			break;
		case '�':
			numerology = 400;
			break;
		}// end of switch
		return numerology;
	}// end of get numerology method
/**
 * This method calculates the numerology value of a string.
 * @param str - The same string we want to calculate
 * @return sumOfNumerology - The numerology value of the string
 * 
 * This method is a static method, so it can be used by calling through the class name.
 */
	public static int calculateString(String str) {
		int sumOfNumerology = 0;
		for (int i = 0; i < str.length(); i++) {
			HebrewNumerology s = new HebrewNumerology(str.charAt(i));
sumOfNumerology+=s.getNumerology();
		}
		return sumOfNumerology;
	}
}// end of class
