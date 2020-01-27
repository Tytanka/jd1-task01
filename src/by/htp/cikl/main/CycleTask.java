package by.htp.cikl.main;

public class CycleTask {
	public static void task01() {

		// 1. Необходимо вывести на экран числа от 1 до 5.

		System.out.println("1)");

		for (int i = 1; i < 6; i++) {
			System.out.print(+i + ", ");
		}

		System.out.println();

	}

	public static void task02() {

		// 2. Необходимо вывести на экран числа от 5 до 1.

		System.out.println("2)");

		for (int i = 5; i > 0; i--) {
			System.out.print(+i + ", ");
		}

		System.out.println();

	}

	public static void task03() {

		// 3. Необходимо вывести на экран таблицу умножения на 3:

		int num;

		System.out.println("3)");

		for (int i = 1; i <= 10; i++) {
			num = 3 * i;
			System.out.println("3*" + i + "=" + num);
		}

	}

	public static void task04() {

		/*
		 * 4. С помощью оператора while напишите программу вывода всех четных чисел в
		 * диапазоне от 2 до 100 включительно.
		 */

		int i = 2;

		System.out.println("4)");

		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(+i + ", ");
			}
			i++;
		}

		System.out.println();
	}

	public static void task05() {

		/*
		 * 5. С помощью оператора while напишите программу определения суммы всех
		 * нечетных чисел в диапазоне от 1 до 99 включительно.
		 */

		int i = 1;

		System.out.println("5)");

		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.print(+i + ", ");
			}
			i++;
		}

		System.out.println();
	}

	public static void task06() {

		/*
		 * 6. Напишите программу, где пользователь вводит любое целое положительное
		 * число. А программа суммирует все числа от 1 до введенного пользователем
		 * числа.
		 */
		int num = 7;
		int i = 1;

		System.out.println("6)");

		while (i <= num) {
			System.out.print(+i + ", ");
			i++;
		}

		System.out.println();

	}

	public static void task07() {

		// 7. Вычислить значения функции на отрезке [а,b] c шагом h:

		int a;
		int b;
		double x;
		double y;
		double h;

		a = 3;
		b = 6;
		h = 1;

		System.out.println("7)");

		for (x = a; x <= b; x += h) {
			System.out.print("x= " + x + ",");
			if (x > 2) {
				y = x;
				System.out.println("y =" + y);
			} else if (x <= 2) {
				y = -x;
				System.out.println("y =" + y);
			}

		}
	}

	public static void task08() {

		// 8. Вычислить значения функции на отрезке [а,b] c шагом h:

		int a;
		int b;
		int c;
		double x;
		double y;
		double h;

		a = 3;
		b = 6;
		c = 1;
		h = 1;

		System.out.println("8)");

		for (x = a; x <= b; x += h) {
			System.out.print("x= " + x + ",");
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("y =" + y);
			} else if (x != 15) {
				y = (x - c) + 6;
				System.out.println("y =" + y);
			}
		}

	}

	public static void task09() {

		// 9. Найти сумму квадратов первых ста чисел.

		int sum;

		sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}

		System.out.println("9) " + sum);
	}

	public static void task10() {

		// 10. Составить программу нахождения произведения квадратов первых двухсот
		// чисел.

		int mult;

		mult = 1;

		for (int i = 1; i <= 200; i++) {
			mult *= Math.pow(i, 2);
		}

		System.out.println("10) " + mult);
	}

	public static void task11() {

		// 11. Составить программу нахождения разности кубов первых двухсот чисел

		int rez;

		rez = 0;

		for (int i = 1; i <= 200; i++) {
			rez -= Math.pow(i, 3);
		}

		System.out.println("11) " + rez);
	}

	public static void task12() {

		/*
		 * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n
		 * >1 Составьте программу нахождения произведения первых 10 членов этой
		 * последовательности.
		 */

		int a1;
		int a2;

		a1 = 1;

		System.out.print("12) " + a1);

		for (int i = 1; i < 10; i++) {
			a2 = 6 + a1;
			a1 = a2;
			System.out.print(", " + a2);
		}

		System.out.println();

	}

	public static void task13() {

		/*
		 * 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с
		 * шагом 0.5.
		 */

		int a;
		int b;
		double x;
		double y;
		double h;

		a = -5;
		b = 5;
		h = 0.5;

		System.out.println("13)");

		for (x = a; x <= b; x += h) {
			System.out.print("x= " + x + ",");
			y = 5 - ((x * x) / 2);
			System.out.println("y =" + y);
		}
	}

	public static void task14() {

		// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

		double n;

		n = 0;

		for (int i = 1; i < 10; i++) {
			n += 1 / i;
		}

		System.out.println("14) " + n);
	}

	public static void task15() {

		// 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.

		int sum;

		sum = 1;

		for (int i = 1; i <= 10; ++i) {
			sum += Math.pow(2.0, i);
		}

		System.out.println("15) " + sum);

	}

	public static void task16() {

		// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

		int sum;
		long mult;

		sum = 1;
		mult = 1;

		for (int i = 2; i <= 10; i++) {
			sum = sum + i;
			mult = mult * sum;
		}

		System.out.println("16) " + mult);

	}

	public static void task17() {

		// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

		double a;
		int n;

		a = 0.5;
		n = 6;

		for (int i = 1; i < n; i++) {
			a = a * (a + i);
		}

		System.out.println("17) " + a);

	}

	public static void task18() {

		/*
		 * 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 */

		double a;
		double e;
		int n;
		double sum;

		a = 0;
		e = 0.01;
		n = 4;
		sum = 0;

		for (int i = 1; i < n; i++) {
			a = Math.pow(-1, i - 1) / i;
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("18) " + sum);

	}

	public static void task19() {

		/*
		 * 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 */

		double a;
		double e;
		int n;
		double sum;

		a = 0;
		e = 0.01;
		n = 6;
		sum = 0;

		for (int i = 1; i < n; i++) {
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("19) " + sum);

	}

	public static void task20() {

		/*
		 * 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 */

		double a;
		double e;
		double n;
		double sum;

		a = 0;
		e = 0.01;
		n = 2;
		sum = 0;

		for (n = 1; n < 7; n++) {
			a = 1 / ((3 * n - 2) * (3 * n + 1));
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("20) " + sum);

	}

	public static void task21() {

		/*
		 * 21. Составить программу для вычисления значений функции F(x) на отрезке [а,
		 * b] с шагом h. Результат представить в виде таблицы, первый столбец которой –
		 * значения аргумента, второй - соответствующие значения функции:
		 */

		int a;
		int b;
		double x;
		double y;
		double h;

		a = 4;
		b = 5;
		h = 1;

		System.out.println("21)");
		System.out.println("_______________________________");
		System.out.println("   x    |    y       ");
		System.out.println("_______________________________");

		for (x = a; x <= b; x += h) {
			System.out.print("|x = " + x + " | ");
			y = x - Math.sin(x);
			System.out.println("y =" + y + " |");
		}
	}

	public static void task22() {

		/*
		 * 22. Составить программу для вычисления значений функции F(x) на отрезке [а,
		 * b] с шагом h. Результат представить в виде таблицы, первый столбец которой –
		 * значения аргумента, второй - соответствующие значения функции:
		 */

		int a;
		int b;
		double x;
		double y;
		double h;

		a = 5;
		b = 7;
		h = 1;

		System.out.println();
		System.out.println("22)");
		System.out.println("_______________________________");
		System.out.println("   x    |    y       ");
		System.out.println("_______________________________");

		for (x = a; x <= b; x += h) {
			System.out.print("|x = " + x + " | ");
			y = x - Math.sin(x);
			System.out.println("y =" + y + " |");
		}
	}

	public static void task23() {

		/*
		 * 23. Составить программу для вычисления значений функции F(x) на отрезке [а,
		 * b] с шагом h. Результат представить в виде таблицы, первый столбец которой –
		 * значения аргумента, второй - соответствующие значения функции:
		 */

		int a;
		int b;
		double x;
		double y;
		double h;

		a = 1;
		b = 3;
		h = 1;

		System.out.println();
		System.out.println("23)");
		System.out.println("_______________________________");
		System.out.println("   x    |    y       ");
		System.out.println("_______________________________");

		for (x = a; x <= b; x += h) {
			System.out.print("|x = " + x + " | ");
			y = (1 / Math.tan(x / 3)) + ((1 / 2) * Math.sin(x));
			System.out.println("y =" + y + " |");

		}
	}

	public static void task24() {

		/*
		 * 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его
		 * состав. Преобразовать его в другое число, цифры которого будут следовать в
		 * обратном порядке по сравнению с введенным числом.
		 */

		int num;
		int rest;
		double sum;

		num = 24;
		sum = 0;

		int n1;
		n1 = 0;

		while (num != 0) {
			rest = num % 10;
			if (rest % 2 == 0) {
				sum += rest;
				n1 = n1 * 10 + num % 10;
				num /= 10;
			}
		}
		System.out.println("24) " + sum + " ");
		System.out.println("    " + n1);

	}

	public static void task25() {

		// 25. Требуется определить факториал числа,

		int result;
		int n;

		result = 1;
		n = 5;

		if (n < 0) {
			System.out.println("25) отрицательный факториал");
		} else {

			for (int i = 2; i <= n; i++) {
				result *= i;

				if (n == 0 || n == 1) {
					System.out.println("25) Факториал числа равен " + result);
				}
			}
		}
		System.out.println("25) Факториал числа равен " + result);
	}

	public static void task26() {

		/*
		 * 26. Вывести на экран соответствий между символами и их численными
		 * обозначениями в памяти компьютера (Таблицу ASCII).
		 */
		char ch;

		System.out.println();
		System.out.println("26) ");
		System.out.println("DEC" + "|" + "ASCII");

		for (int i = 34; i < 38; i++) {
			ch = (char) i;
			System.out.println("|" + i + "| " + ch + "|");
		}
	}

	public static void task27() {

		/*
		 * 27. Для каждого натурального числа в промежутке от m до n вывести все
		 * делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
		 */

		int m;
		int n;

		m = 2;
		n = 100;

		System.out.println();
		System.out.println("27) ");

		for (int i = 1; i <= n; i++) {

			if (n % i == 0 && i != m && i != 1) {

				System.out.print(+i + ", ");
			}
		}
		System.out.println();

	}

	public static void task28() {

		/*
		 * /* 28. Написать программу, в которой вводятся два операнда Х и Y и знак
		 * операции (+, –, /, *). Вычислить результат Z в зависимости от знака.
		 * Предусмотреть реакции на возможный неверный знак операции, а также на ввод
		 * Y=0 при делении. Организовать возможность многократных вычислений без
		 * перезагрузки программа (т.е. построить цикл). В качестве символа прекращения
		 * вычислений принять ‘0’.
		 */

		double x;
		double y;
		double z;

		x = 0;
		y = 3.2;
		String operator = "+";

		System.out.println("28) ");

		do {
			switch (operator) {
			case "-":
				z = x - y;
				System.out.println(+x + "-" + y + "=" + z);
				break;
			case "+":
				z = x + y;
				System.out.println(+x + "+" + y + "=" + z);
				break;
			case "*":
				z = x * y;
				System.out.println(+x + "*" + y + "=" + z);
				break;
			case "/":
				if (y != 0) {
					z = x / y;
					System.out.println(+x + "/" + y + "=" + z);
				} else {
					System.out.println("на ноль делить нельзя");
				}
				break;
			default:
				System.out.println("неверный знак");
				break;
			}
		} while (x != 0);
	}

}
