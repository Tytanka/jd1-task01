package by.htp.cikl2.main;


public class CycleTask2 {

	public static void task29() {

		/*
		 * 29. Даны два числа. Определить цифры, входящие в запись как первого так и
		 * второго числа
		 */

		int a;
		int b;
		int c;
		int d;

		a = 15;
		b = 71;

		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (c % 10 == d) {
					System.out.println("29) " + d);
					break;
				}
				c = c / 10;
			}
		}
	}
	



	public static void task31() {

		/*
		 * 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
		 * Человек пытается их угадать. Программа должна выводить угаданные и
		 * неугаданные числа из тех, что сгенерировала программа, а также ошибочные
		 * числа пользователя.
		 */

		int n;
		int d;

		n = (int) (Math.random() * 10 + 6);
		System.out.println("31) ");

		d = 15;
		if (d < n) {
			System.out.println("Неверно. Загадано число " + n);
		}
		if (d > n) {
			System.out.println("Неверно. Загадано число " + n);
		}
		if (d == n) {
			System.out.println("Верно!!! " + n);

		}

	}

	public static void task33() {

		// 33. Найдите наибольшую цифру данного натурального числа.

		int num;
		int a;
		int b;
		int c;

		num = 581;

		a = num % 10;
		b = (num / 10) % 10;
		c = (num / 100) % 10;

		System.out.println("33)");

		if (a >= b & a > c || a > c & b >= a) {
			System.out.println("В числе " + num + " наибольшая цифра " + a);
		} else {
			if (b > a & b >= c) {
				System.out.println("В числе " + num + " наибольшая цифра " + b);
			} else {
				System.out.println("В числе " + num + " наибольшая цифра " + c);
			}
		}
	}

	public static void task34() {

		// 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

		int a;
		int b;
		int c;
		int d;
		int k;
		int i;

		System.out.println("34)");

		for (k = 1000; k < 10000; k++) {
			a = k % 10;
			b = (k / 10) % 10;
			c = (k / 100) % 10;
			d = k / 1000;
			i = a + b + c + d;
			if (i == 15) {
				System.out.print(k + " ");

			}

		}

	}

	public static void task35() {

		// 35. Найдите количество четных цифр данного натурального числа.

		int num;
		int rest;

		num = 258;
		int count = 0;

		System.out.println();
		System.out.println("35) ");

		while (num != 0) {
			rest = num % 10;
			num = num / 10;
			if (rest % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void task36() {

//36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа. 

		int a;
		int b;
		int c;

		System.out.print("36) ");

		for (a = 10; a < 100; a++) {
			for (b = 10; b < 100; b++) {
				c = a * 100 + b;
				if (c % (a * b) == 0) {
					c /= (a * b);
					System.out.println();
					System.out.print(+a + " " + b);
					c = 0;
				}
			}
		}
	}

	public static void task37() {

		/*
		 * 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных
		 * числа: первое число получили путем написания сначала числа А, затем В. Для
		 * получения второго числа сначала записали число В, затем А. Найти числа А и В
		 * если известно , что первое четырехзначное число нацело делится на 99, а
		 * второе на 49.
		 */

		int a;
		int b;
		int c;

		System.out.println();
		System.out.print("37) ");

		for (a = 10; a < 100; a++) {
			for (b = 10; b < 100; b++) {
				c = (a * 100) + b;
				if ((c % 99 == 0) && (c % 49 == 0)) {
					System.out.print(+a + " " + b);
				}

			}
		}
	}

	public static void task38() {

		/*
		 * 38. Для заданного натурального числа определить, образуют ли его цифры
		 * арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр.
		 * Например: 1357, 963.
		 */

		int a;
		int b;
		int c;
		int d;

		a = 2468;

		System.out.println();
		System.out.print("38)");

		b = a % 10;
		a = a / 10;
		c = a % 10;
		a = a / 10;
		d = a % 10;
		a = a / 10;

		if (b - c == c - d) {
			System.out.println(" цифры образуют арифметическую прогрессию");
		} else {
			System.out.println(" цифры не образуют арифметическую прогрессию");
		}

	}

	public static void task39() {

		/*
		 * 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число
		 * умножили на 7, то получили исходное число. Найти это число.
		 */

		int a;
		int i;

		for (i = 100; i < 1000; i++) {
			a = i % 100;
			if (7 * a == i) {
				System.out.println("39)" + i);

			}
		}

	}

	public static void task40() {

		/*
		 * 40. Получить все числа, не превышающие заданного числа N, которые делятся без
		 * остатка на все свои цифры.
		 */

		int n;
		boolean f;
		int m;

		n = 23;

		System.out.println("40)");

		for (int i = 1; i < n; i++) {
			m = i;
			f = true;
			while (m > 0 && f) {
				if (m % 10 == 0 || (i % (m % 10) != 0)) {
					f = false;
				} else {
					m = m / 10;
				}
			}
			if (f) {
				System.out.print(i + ", ");
			}
		}
	}
}
