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
		case 'à':
			numerology = 1;
			break;
		case 'á':
			numerology = 2;
			break;
		case 'â':
			numerology = 3;
			break;
		case 'ã':
			numerology = 4;
			break;
		case 'ä':
			numerology = 5;
			break;
		case 'å':
			numerology = 6;
			break;
		case 'æ':
			numerology = 7;
			break;
		case 'ç':
			numerology = 8;
			break;
		case 'è':
			numerology = 9;
			break;
		case 'é':
			numerology = 10;
			break;
		case 'ë':
			numerology = 20;
			break;
		case 'ê':
			numerology = 20;
			break;
		case 'ì':
			numerology = 30;
			break;
		case 'î':
			numerology = 40;
			break;
		case 'í':
			numerology = 40;
			break;
		case 'ð':
			numerology = 50;
			break;
		case 'ï':
			numerology = 50;
			break;
		case 'ñ':
			numerology = 60;
			break;
		case 'ò':
			numerology = 70;
			break;
		case 'ô':
			numerology = 80;
			break;
		case 'ó':
			numerology = 80;
			break;
		case 'ö':
			numerology = 90;
			break;
		case 'õ':
			numerology = 90;
			break;
		case '÷':
			numerology = 100;
			break;
		case 'ø':
			numerology = 200;
			break;
		case 'ù':
			numerology = 300;
			break;
		case 'ú':
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
