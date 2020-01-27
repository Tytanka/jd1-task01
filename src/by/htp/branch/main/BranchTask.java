package by.htp.branch.main;

public class BranchTask {

	public static void task1() {

		/*
		 * 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		 * на экран цифру 7, в противном случае – цифру 8.
		 */

		int x;
		int y;

		x = 1;
		y = 2;

		if (x < y) {

			System.out.println("1) 7");

		} else {

			System.out.println("1) 8");
		}
	}

	public static void task2() {

		/*
		 * 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		 * на экран слово «yes», в противном случае – слово «no»
		 */

		int x;
		int y;

		x = 5;
		y = 7;

		if (x < y) {

			System.out.println("2) Yes");

		} else {

			System.out.println("2) no");

		}
	}

	public static void task3() {

		/*
		 * 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на
		 * экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
		 */

		int a;

		a = 4;

		if (a < 3) {

			System.out.println("3) Yes");

		} else {

			System.out.println("3) no");
		}
	}

	public static void task4() {

		// 4. Составить программу: равны ли два числа а и b?

		int b;
		int a;

		a = 1;
		b = 7;

		if (a == b) {

			System.out.println("4) Число " + a + " равно " + b);

		} else {

			System.out.println("4) Число " + a + " не равно " + b);

		}
	}

	public static void task5() {

		// 5. Составить программу: определения наименьшего из двух чисел а и b.

		int a;
		int b;

		a = 5;
		b = 8;

		if (a < b) {

			System.out.println("5) Число " + a + " наименьшее ");

		} else {

			System.out.println("5) Число " + b + " наименьшее ");

		}
	}

	public static void task6() {

		// 6. Составить программу: определения наибольшего из двух чисел а и b

		int a;
		int b;

		a = 5;
		b = 9;

		if (a > b) {

			System.out.println("6) Число " + a + " наибольшее ");

		} else {

			System.out.println("6) Число " + b + " наибольшее ");

		}
	}

	public static void task7() {

		/*
		 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при
		 * заданных значениях a, b, c и х
		 */

		int a;
		int b;
		int x;
		int c;
		int d;

		a = 5;
		b = 2;
		x = -1;
		c = 3;

		d = Math.abs((a * (x * x) + b * x + c));

		System.out.println("7) Модуль выражения равен " + d);
	}

	public static void task8() {

		/*
		 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		 */

		int a;
		int b;

		a = 2;
		b = 3;

		if ((a * a) < (b * b)) {

			System.out.println("8) Квадрат числа " + a + " наименьший ");

		} else {

			System.out.println("8)  Квадрат числа " + b + " наименьший ");

		}
	}

	public static void task9() {

		/*
		 * 9. Составить программу, которая определит по трем введенным сторонам,
		 * является ли данный треугольник равносторонним.
		 */

		int a;
		int b;
		int c;

		a = 3;
		b = 3;
		c = 3;

		if ((a == b) && (b == c) && (c == a)) {

			System.out.println("9) Треугольник со сторонами " + a + "," + b + "," + c + " является равноcторонним ");

		} else {

			System.out.println("9)Треугольник со сторонами " + a + "," + b + "," + c + " не является равноcторонним ");

		}
	}

	public static void task10() {

		/* 10. Составить программу, которая определит площадь какого круга меньше. */

		double s1;
		double s2;

		s1 = 2.061;
		s2 = 3.142;

		if (s1 < s2) {

			System.out.println("10) Площадь первого круга меньше ");

		} else {

			System.out.println("10) Площадь второго круга меньше");

		}
	}

	public static void task11() {

		/*
		 * 11. Составить программу, которая определит площадь какого треугольника больше
		 */

		double s3;
		double s4;

		s3 = 8.1;
		s4 = 5.6;

		if (s3 > s4) {

			System.out.println("11) Площадь первого треугольника больше");

		} else {

			System.out.println("11) Площадь второго треугольника больше");

		}
	}

	public static void task12() {

		/*
		 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения
		 * которых неотрицательны, и в четвертую степень — отрицательные.
		 */

		double e;
		double f;
		double g;
		double i;
		double j;
		double k;

		e = -2;
		f = 3;
		g = 5;

		if (e > 0) {
			i = e * e;
			System.out.println("12) " + i + ", ");
		}

		else {
			i = Math.pow(e, 4);
			;
			System.out.print("12) " + i + ", ");
		}
		if (f > 0) {
			j = f * f;
			System.out.print(+j + ", ");
		} else {

			j = Math.pow(f, 4);
			System.out.print(+j + ", ");
		}

		if (g > 0) {
			k = g * g;
			System.out.println(+k);
		} else {
			k = Math.pow(g, 4);
			System.out.println(+k);
		}
	}

	public static void task13() {

		/*
		 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		 * которая из точек находится ближе к началу координат.
		 */

		double x1;
		double y1;
		double x2;
		double y2;
		double d1;
		double d2;

		x1 = 3;
		y1 = 3;
		x2 = 5;
		y2 = 6;

		d1 = Math.sqrt((x1 * x1) + (y1 * y1));
		d2 = Math.sqrt((x2 * x2) + (y2 * y2));

		if (d1 < d2) {

			System.out.println("13) Точка А ближе");

		}

		else {

			System.out.println("13) Точка Б ближе");

		}
	}

	public static void task14() {

		/*
		 * 14) Даны два угла треугольника (в градусах). Определить, существует ли такой
		 * треугольник, и если да, то будет ли он прямоугольным.
		 */

		int ygol1;
		int ygol2;

		ygol1 = 30;
		ygol2 = 30;

		if ((ygol1 + ygol2) < 180) {
			System.out.print("14) треугольник существует ");
		} else {

			System.out.print("14) треугольник не существует");
		}

		if (ygol1 == 90 || ygol2 == 90 || (ygol1 + ygol1) == 90) {

			System.out.println(" треугольник прямоугольный");
		}

		else {

			System.out.println(" треугольник не прямоугольный");
		}
	}

	public static void task15() {

		/*
		 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
		 * двух чисел заменить половиной их суммы, а большее — их удвоенным
		 * произведением.
		 */

		int x;
		int y;
		int x1;
		int x2;

		x = 2;
		y = 4;

		x1 = (2 + 4) / 2;

		System.out.print("14) " + x1);

		x2 = (x * y) * 2;

		System.out.println(", " + x2);
	}

	public static void task16() {

		/*
		 * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
		 * расположена (на какой оси или в каком координатном угле).
		 */

		int x;
		int y;

		x = 1;
		y = 2;

		if ((x == 0) && (y == 0)) {
			System.out.println("16) Точка А в начале координат");
		} else if (x == 0) {
			System.out.println("16) Точка А на оси Y");
		} else if (y == 0) {
			System.out.println("16) Точка А на оси X");
		} else if (x > 0 && y > 0) {
			System.out.println("16) Точка А в I четверти ");
		} else if (x < 0 && y > 0) {
			System.out.println("16) Точка А в II четверти ");
		} else if (x < 0 && y < 0) {
			System.out.println("16) Точка А в III четверти ");

		} else {
			System.out.println("16) Точка А в IV четверти ");
		}
	}

	public static void task17() {

		/*
		 * 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них
		 * одним и тем же числом, равным большему из исходных, а если равны, то заменить
		 * числа нулями.
		 */

		int m;
		int n;

		m = 0;
		n = 0;

		if (m > n) {
			n = m;
			System.out.println("17) m = " + m + ", n=" + n);
		} else if (n > m) {
			m = n;
			System.out.println("17) m = " + m + ", n=" + n);

		} else {
			m = n = 0;
			System.out.println("17) m = " + m + ", n=" + n);
		}
	}

	public static void task18() {

		/* 18. Подсчитать количество отрицательных среди чисел а, b, с. */

		int a;
		int b;
		int c;
		int count;

		a = 8;
		b = -2;
		c = -5;
		count = 0;

		if (a < 0) {
			count++;
		}
		if (b < 0) {
			count++;
		}
		if (c < 0) {
			count++;
		} else {
			count = 0;
		}

		System.out.println("18) отрицательных чисел " + count);
	}

	public static void task19() {

		/* 19. Подсчитать количество положительных среди чисел а, b, с. */

		int a;
		int b;
		int c;
		int coun;

		a = 38;
		b = 2;
		c = 5;
		coun = 0;

		if (a > 0) {
			coun++;
		}
		if (b > 0) {
			coun++;
		}
		if (c > 0) {
			coun++;
		} else {
			coun = 0;
		}

		System.out.println("19) положительных чисел " + coun);
	}
	
		public static void task20() {
		
		/*
		 * 20. Определить, делителем каких чисел а, b, с является число k.
		 */
		
		int a;
		int b;
		int c;
		int k1;

		a = 6;
		b = 9;
		c = 8;
		k1 = 2;

		if (a % k1 == 0) {

			System.out.println("20) Число " + k1 + " является делителем числа " + a);

		} else {

			System.out.println("20) Число " + k1 + " не является делителем числа " + a);
		}

		if (b % k1 == 0) {

			System.out.println(" Число " + k1 + " является делителем числа " + b);

		} else {

			System.out.println(" Число " + k1 + " не является делителем числа " + b);

		}

		if (c % k1 == 0) {

			System.out.println(" Число " + k1 + " является делителем числа " + c);

		} else {

			System.out.println("Число " + k1 + " не является делителем числа" + c);

		}

	}

		public static void task21() {
			
			/*
			 * 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
			 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
			 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
			 */

			char ch;

			ch = 'D';

			switch (ch) {
			case 'D':
				System.out.println("21) Мне нравятся девочки!");
				break;
			case 'M':
				System.out.println("21) Мне нравятся мальчики!");
				break;

			default:
				System.out.println("21) Попробуй ещё раз");
			}

		}

		public static void task22() {

			/*
			 * 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
			 * большее из этих значений, а в y - меньшее.
			 */

			int x;
			int y;
			int temp;

			x = 8;
			y = 14;

			if (y > x) {
				temp = y;
				y = x;
				x = temp;
				System.out.println("22) x= " + x + " y=" + y);
			} else {
				System.out.println("22) x= " + x + " y=" + y);
			}
		}

		public static void task23() {

			/*
			 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
			 * месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
			 */

			int date;
			int month;

			date = 28;
			month = 14;

			if ((date < 1) || (date > 31) || (month < 1) || (month > 12)) {
				System.out.println("23) Bведены некорректные данные");
			} else {
				System.out.println("23) число " + date + " месяц " + month);
			}
		}

		public static void task24() {

			/*
			 * 24. Составить программу, определяющую результат гадания на ромашке —
			 * «любит—не любит», взяв за исходное данное количество лепестков n.
			 */

			int n;

			n = 6;

			if (n % 2 == 0) {
				System.out.println("24) любит ");
			} else {
				System.out.println("24) не любит ");
			}

		}

		public static void task25() {

			/*
			 * 25. Написать программу — модель анализа пожарного датчика в помещении,
			 * которая выводит сообщение «Пожароопасная ситуация », если температура в
			 * комнате превысила 60° С.
			 */

			int t;

			t = 75;

			if (t > 60) {
				System.out.println("25) Пожароопасная ситуация ");
			} else {
				System.out.println("25) Не пожароопасная ситуация ");
			}

		}

		public static void task26() {

			// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.

			int a;
			int b;
			int c;
			int max;
			int min;
			int s;

			a = 2;
			b = 3;
			c = 7;

			if (a > b) {
				max = a;
			} else {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			if (a < b) {
				min = a;
			} else {
				min = b;
			}
			if (c < min) {
				min = c;
			}

			s = max + min;

			System.out.println("26) Cуммa большего и меньшего из трех чисел: " + a + "," + b + "," + c + ", равна " + s);

		}

		public static void task27() {

			// 27. Найти max{min(a, b), min(c, d)}.

			int a;
			int b;
			int c;
			int d;
			int minab;
			int mincd;
			int max;

			a = 7;
			b = 1;
			c = 5;
			d = 3;

			if (a > b) {
				minab = b;
			} else {
				minab = a;
			}

			if (c > d) {
				mincd = d;
			} else {
				mincd = c;
			}

			if (mincd > minab) {
				max = mincd;
			} else {
				max = minab;
			}

			System.out.println("27) max{min(" + a + "," + b + "),min(" + c + "," + d + ")} = " + max);
		}

		public static void task28() {

			/*
			 * 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
			 * равно d, то найти max(d — a, d — b, d — c).
			 */

			int a;
			int b;
			int c;
			int d;
			int max;
			int i;
			int j;
			int k;

			a = 2;
			b = 8;
			c = 7;
			d = 8;

			if (a == d) {
				System.out.println("28) a=d=" + d);
			} else if (b == d) {
				System.out.println("28) b=d=" + d);
			} else if (c == d) {
				System.out.println("28) c=d=" + d);
			} else {
				i = d - a;
				j = d - b;
				k = d - c;
				max = i;
				if ((i > j) && (i > k)) {
					max = i;
				} else if ((j > i) && (j > k)) {
					max = j;
				} else {
					max = k;
				}

				System.out.println("28) max(d — a, d — b, d — c)=" + max);
			}
		}

		public static void task29() {

			// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
			// расположены на одной прямой.

			int x1;
			int x2;
			int x3;
			int y1;
			int y2;
			int y3;
			int m;
			int n;
			int z;

			x1 = 1;
			y1 = 1;
			x2 = 2;
			y2 = 5;
			x3 = 4;
			y3 = 3;

			z = (x3 - x1) / (y3 - y1);
			n = (x3 - x2) / (y2 - y1);
			m = (x2 - x1) / (y2 - y1);

			if ((z == n) || (z == m)) {
				System.out.println("29) Точки лежат на одной прямой");
			} else {
				System.out.println("29) Точки не лежат на одной прямой");
			}
		}

		public static void task30() {

			/*
			 * 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
			 * заменить их абсолютными значениями, если это не так.
			 */

			int a;
			int b;
			int c;

			a = 5;
			b = 4;
			c = 2;

			if ((a > b) && (b > c)) {
				a *= a;
				b *= b;
				c *= c;
			} else {
				a = Math.abs(a);
				b = Math.abs(b);
				c = Math.abs(c);
			}
			System.out.println("30)" + a + ", " + b + ", " + c);
		}

		public static void task31() {

			/*
			 * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
			 * Определить, пройдет ли кирпич через отверстие.
			 */

			int a;
			int b;
			int x;
			int y;
			int z;

			a = 275;
			b = 50;
			x = 250;
			y = 120;
			z = 65;

			if (((x <= a) && (y <= b)) || ((y <= a) && (x <= b))) {
				System.out.println("31) Кирпич пройдет в отверстие");
			} else if (((x <= a) && (z <= b)) || ((z <= a) && (x <= b))) {
				System.out.println("31) Кирпич пройдет в отверстие");
			} else if (((y <= a) && (z <= b)) || ((z <= a) && (y <= b))) {
				System.out.println("31) Кирпич пройдет в отверстие");
			} else {
				System.out.println("31) Кирпич не пройдет в отверстие");
			}
		}

		public static void task32() {

			/*
			 * 32. Написать программу, которая по заданным трем числам определяет, является
			 * ли сумма каких-либо двух из них положительной.
			 */

			int a;
			int b;
			int c;

			a = -5;
			b = 3;
			c = 4;

			if ((a + b) > 0) {
				System.out.println("32) a+b >0");
			} else if ((b + c) > 0) {
				System.out.println("32) b+c >0");
			} else if ((a + c) > 0) {
				System.out.println("32) a+c >0");
			} else if (((a + c) < 0) || ((b + c) < 0) || ((a + c) < 0)) {
				System.out.println("32) по заданным значениям положительной суммы нет");
			}
		}

		public static void task33() {

			/*
			 * 33. Написать программу, которая по паролю будет определять уровень доступа
			 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
			 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
			 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
			 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
			 */

			int passw;

			passw = 1747;

			if (passw == 9583 || passw == 1747) {
				System.out.println("33) доступны модули баз А, В, С");
			} else if (passw == 3331 || passw == 7922) {
				System.out.println("33) доступны модули баз В, С");
			} else if (passw == 9455 || passw == 8997) {
				System.out.println("33) доступен модуль баз С");
			} else {
				System.out.println("33) неверный пароль");
			}
		}

		public static void task34() {

			/*
			 * /* 34. Составить программу, реализующую эпизод применения компьютера в
			 * книжном магазине. Компьютер запрашивает стоимость книг, сумму денег,
			 * внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»;
			 * если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
			 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
			 * и указывает размер недостающей суммы.
			 */

			int stoim;
			int sum;
			int nsum;

			stoim = 500;
			sum = 450;

			if (sum == stoim) {
				System.out.println("34) Спасибо");
			} else if (sum > stoim) {
				System.out.println("34) Возьмите сдачу");
			} else {
				nsum = stoim - sum;
				System.out.println("34) Денег недостаточно. Ещё необходимо добавить " + nsum + "руб.");
			}
		}

		public static void task35() {

			// 35. Вычислить число и месяц в невисокосном году по номеру дня.

			int daymohth;
			int numday;

			daymohth = 0;
			numday = 291;

			if (numday > 0 && numday <= 31) {
				daymohth = numday;
				System.out.println("35) Январь " + daymohth + " число");
			} else if (numday > 31 && numday <= 59) {
				daymohth = numday - 31;
				System.out.println("35) Февраль " + daymohth + " число");
			} else if (numday > 59 && numday <= 90) {
				daymohth = numday - 59;
				System.out.println("35) Март " + daymohth + " число");
			} else if (numday > 90 && numday <= 120) {
				daymohth = numday - 90;
				System.out.println("35) Апрель " + daymohth + " число");
			} else if (numday > 120 && numday <= 151) {
				daymohth = numday - 120;
				System.out.println("35) Май " + daymohth + " число");
			} else if (numday > 151 && numday <= 181) {
				daymohth = numday - 151;
				System.out.println("35) Июнь " + daymohth + " число");
			} else if (numday > 181 && numday <= 212) {
				daymohth = numday - 181;
				System.out.println("35) Июль " + daymohth + " число");
			} else if (numday > 212 && numday <= 243) {
				daymohth = numday - 212;
				System.out.println("35) Август " + daymohth + " число");
			} else if (numday > 243 && numday <= 273) {
				daymohth = numday - 243;
				System.out.println("35) Сентябрь " + daymohth + " число");
			} else if (numday > 273 && numday <= 304) {
				daymohth = numday - 273;
				System.out.println("35) Октябрь " + daymohth + " число");
			} else if (numday > 304 && numday <= 334) {
				daymohth = numday - 304;
				System.out.println("35) Ноябрь " + daymohth + " число");
			} else if (numday > 334 && numday <= 365) {
				daymohth = numday - 334;
				System.out.println("35) Декабрь " + daymohth + " число");
			} else {
				System.out.println("35) Такой даты нет");
			}
		}

		public static void task36() {

			// 36. Вычислить значение функции:

			double x;
			double f;

			x = 4;

			if (x <= 3) {
				f = x * x - 3 * x - 9;
				System.out.println("36) " + f);
			} else {
				f = 1 / (Math.pow(x, 3) + 6);
				System.out.println("36) " + f);
			}
		}

		public static void task37() {

			// 37. Вычислить значение функции:

			double x;
			double f;

			x = 4.0;

			if (x >= 3) {
				f = -(x * x) + 3 * x + 9;
				System.out.println("37) " + f);
			} else {
				f = 1 / (Math.pow(x, 3) - 6);
				System.out.println("37) " + f);
			}
		}

		public static void task38() {

			// 38. Вычислить значение функции:

			double x;
			double f;

			x = 4.2;

			if ((x >= 0) && (x <= 3)) {
				f = x * x;
				System.out.println("38) " + f);
			} else {
				f = 4;
				System.out.println("38) " + f);
			}
		}

		public static void task39() {

			// 39. Вычислить значение функции:

			double x;
			double f;

			x = 1.0;

			if (x >= 8) {
				f = -(x * x) + x - 9;
				System.out.println("39) " + f);
			} else {
				f = 1 / (Math.pow(x, 4) - 6);
				System.out.println("39) " + f);
			}
		}

		public static void task40() {

			// Вычислить значение функции:

			double x;
			double f;

			x = 1.5;

			if (x <= 13) {
				f = -(Math.pow(x, 3)) + 9;
				System.out.println("40) " + f);
			} else {
				f = -3 / (x + 1);
				System.out.println("40) " + f);
			}
		}

	}


