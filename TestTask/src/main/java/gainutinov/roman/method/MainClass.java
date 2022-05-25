package gainutinov.roman.method;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * @author Roman Gainutdinov
 * @product TestTask
 * @package_name gainutinov.roman.method
 * @date_of_creation 25 мая 2022 г.
 * @time_of_creation 14:32:22
 */

// реализовал согласно тестовому заданию, для написания юнит теста хотел бы
// пообщаться на интервью

public class MainClass {

	public static void main(String... strings) {
		String[] w = {"qwe", "qwe", "qwe", "qwee", "a", "a", "a", "a"};
		testMethod(w);
	}

	public static void testMethod(String... words) {

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < words.length; i++) {
			char[] charArray = words[i].toCharArray();
			Arrays.sort(charArray);
			words[i] = new String(charArray);

		}

		for (int i = 1; i < words.length; i++) {
			if (words[i - 1].equals(words[i])) {
				set.add(words[i - 1]);
				set.add(words[i]);
			}
		}

		String[] strUnic = new String[set.size()];

		set.toArray(strUnic);

		String[] countArray = new String[set.size()];

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < strUnic.length; j++) {
				if (strUnic[j].equals(words[i])) {
					StringBuilder sb = new StringBuilder();
					sb.append(i);
					countArray[j] = countArray[j] + sb.toString();
					sb.setLength(0);
				}
			}
		}

		for (int i = 0; i < countArray.length; i++) {
			countArray[i] = countArray[i].replaceAll("null", "");
			countArray[i] = countArray[i].replaceAll("", ", ");
			countArray[i] = countArray[i].substring(2,
					countArray[i].length() - 2);
		}

		for (int i = 0; i < countArray.length; i++) {
			System.out.print(strUnic[i] + " = " + countArray[i] + " ");
		}

	}

}
