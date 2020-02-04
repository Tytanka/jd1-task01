package by.htp.cikl3.main;

public class CycleTask3 {

	public static void task30() {

		// 30. Написать программу, переводящую римские цифры в арабские.

		String rim;
		rim = "M";

		int arab = 0;
		
		System.out.println("31) ");
		
		for (int i = 0; i < rim.length(); i++) {
			switch (rim.toUpperCase().charAt(i)) {
			case 'I':
				arab = 1;
				break;
			case 'V':
				arab = 5;
				break;
			case 'X':
				arab = 10;
				break;
			case 'L':
				arab = 50;
				break;
			case 'C':
				arab = 100;
				break;
			case 'D':
				arab = 500;
				break;
			case 'M':
				arab = 1000;
				break;
			}
			System.out.print(" " + arab);
		}
		System.out.println();
	}

	public static void task32() {

		/*
		 * 32. Проверить введенную пользователем строку на наличие недопустимых
		 * символов. В качестве первого символа допустимы только буквы и знак
		 * подчеркивания. Остальные символы могут быть буквами, цифрами и знаком
		 * подчеркивания.
		 */

		String str;
		str = "_т58тр*ипм";

		System.out.println("32) ");

		for (int i = 0; i < 1; i++) {
			char ch = str.charAt(i);
			if (ch == '_' || Character.isLetter(ch)) {
				continue;
			} else {
				System.out.println(" В качестве первого символа введен  недопустимый " + str.charAt(i));
			}
		}
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '_' || Character.isLetter(ch) || Character.isDigit(ch)) {
				continue;
			} else {
				System.out.println("Введен  недопустимый символ " + str.charAt(i));

			}
		}
	}
}
