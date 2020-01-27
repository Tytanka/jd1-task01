package by.htp.lin.main;

public class LinTask {

	public static void task01() {

		/*
		 * 1. Даны два действительных числа х и у. Вычислить их сумму, разность,
		 * произведение и частное.
		 */

		double x;
		double y;

		double s;
		double r;
		double pr;
		double ch;

		x = 4.8;
		y = 2.0;

		System.out.println("1) ");

		s = x + y;
		System.out.println(x + " + " + y + " = " + s);

		r = x - y;
		System.out.println(x + " - " + y + " = " + r);

		pr = x * y;
		System.out.println(x + " * " + y + " = " + pr);

		ch = x / y;
		System.out.println(x + " / " + y + " = " + ch);

	}

	public static void task02() {

		// 2. Найдите значение функции: с = 3 + а.

		double a;
		double c;

		a = 2.1;

		c = 3 + a;

		System.out.println("2) Значениие функции c = " + c);

	}

	public static void task03() {

		// 3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.

		double x;
		double y;

		double z;

		x = 4.1;
		y = 3.0;

		z = 2 * x + (y - 2) * 5;

		System.out.println("3) Значение функции z = " + z);

	}

	public static void task04() {

		// 4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

		double a;
		double b;
		double c;

		double z;

		a = 6.2;
		b = 4.0;
		c = 0.6;

		z = ((a - 3) * b / 2) + c;

		System.out.println("4) Значение функции z = " + z);

	}

	public static void task05() {

		// 5. Составить алгоритм нахождения среднего арифметического двух чисел

		double a;
		double b;

		double aver;

		a = 6.2;
		b = 3.8;

		aver = (a + b) / 2;

		System.out.println("5) Среднее арифметическое равно " + aver);

	}

	public static void task06() {

		/*
		 * 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
		 * литров молока в m больших бидонах,
		 */

		int n;
		int m;
		int l;

		n = 4;
		m = 5;

		l = (80 / n + 12) * m;

		System.out.println("6) " + l + " литров молока в " + m + " больших бидонах");

	}

	public static void task07() {

		/*
		 * 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
		 * прямоугольника
		 */

		int a;
		int b;

		int s;

		a = 8;
		b = a / 2;

		s = a * b;

		System.out.println("7) Площадь прямоугольника равна " + s);
	}

	public static void task08() {

		/*
		 * 8. Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения):
		 */

		double a;
		double b;
		double c;

		double rez;

		a = 6.0;
		b = 10.0;
		c = 4.0;

		rez = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("8) Значение выражения равно: " + rez);

	}

	public static void task09() {

		double a;
		double b;
		double c;
		double d;

		double rez;

		a = 4.0;
		b = 3.0;
		c = 2.0;
		d = 1.0;

		rez = a / c * b / d - (a * b - c) / c * d;

		System.out.println("9) Значение выражения равно: " + rez);
	}

	public static void task10() {

		/*
		 * 10. Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения): ((𝑠𝑖𝑛 𝑥 +𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦))∗
		 * 𝑡𝑔 𝑥�
		 */

		double x;
		double y;

		double rez;

		x = 0.785;
		y = 6.28;

		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("10) Значение выражения равно: " + rez);
	}

	public static void task11() {

		/*
		 * 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		 * двух катетов.
		 */

		double a;
		double b;

		double p;
		double s;

		a = 3.0;
		b = 4.0;

		p = (a + b + Math.sqrt(a * a + b * b));

		System.out.println("11) ");

		System.out.println("Периметр прямоугольного треугольника равен: " + p);

		s = (a * b) / 2;

		System.out.println("Площадь прямоугольного треугольника равна: " + s);
	}

	public static void task12() {

		/*
		 * 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
		 * (x2, у2)
		 */

		double x1;
		double y1;
		double x2;
		double y2;

		double d;

		x1 = 2.3;
		y1 = 5.0;

		x2 = 8.6;
		y2 = 9.7;

		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("12) Расстояние между двумя точками с заданными координатами равно: " + d);

	}

	public static void task13() {

		// 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).

		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		double a;
		double b;
		double c;
		double p;
		double pp;
		double s;

		x1 = 1.0;
		y1 = 1.0;

		x2 = 4.0;
		y2 = 4.0;

		x3 = 5.0;
		y3 = 1.0;

		a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

		p = a + b + c;

		System.out.println("13) ");

		System.out.println(" Периметр треугольника равен " + p);

		pp = p / 2;

		s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

		System.out.println(" Площадь треугольника равна " + s);

	}

	public static void task14() {

		/*
		 * 14. Вычислить длину окружности и площадь круга одного и того же заданного
		 * радиуса R
		 */

		double r;
		double l;
		double s;

		r = 3;

		System.out.println("14) ");

		l = 2 * Math.PI * r;
		System.out.println("Длины окружности равна: " + l);

		s = Math.PI * (r * r);
		System.out.println("Площадь круга равна: " + s);

	}

	public static void task15() {
		/*
		 * 15. Написать программу, которая выводит на экран первые четыре степени числа
		 * π.
		 */

		double pi;
		int i;

		System.out.println("15) ");

		for (i = 1; i < 5; i++) {
			pi = Math.pow(Math.PI, i);
			System.out.println(" Значение Pi в " + i + " степени  равно " + pi);
		}
	}

	public static void task16() {

		// 16. Найти произведение цифр заданного четырехзначного числа

		int num;
		int multip;

		num = 2112;
		multip = 1;
		for (int i = 0; i < 4; i++) {
			multip *= num % 10;

			num = num / 10;
		}

		System.out.println("16) Произведение: " + multip);

	}

	public static void task17() {

		// 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		// геометрическое

		double a;
		double b;

		a = 2.0;
		b = 3.0;

		double srarifm;
		double srgeom;

		System.out.println("17) ");

		srarifm = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		System.out.println("Среднее арифметическое кубов двух чисел равно " + srarifm);

		srgeom = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("Среднее геометрическое модулей двух чисел равно " + srgeom);
	}

	public static void task18() {

		// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		// объем этого куба.

		double a;

		double Sgr;
		double Scub;
		double Vcub;

		a = 5.0;

		System.out.println("18) ");

		Sgr = a * a;
		System.out.println("Площадь грани куба равна: " + Sgr);

		Scub = 6 * Sgr;
		System.out.println("Площадь полной поверхности куба равна: " + Scub);

		Vcub = Math.pow(a, 3);
		System.out.println("Объем куба равен: " + Vcub);

	}

	public static void task19() {
		/*
		 * 19. Дана сторона равностороннего треугольника. Найти площадь этого
		 * треугольника, его высоту, радиусы вписанной и описанной окружностей.
		 */

		double a;

		double s;
		double d;
		double r;
		double R;

		a = 4;

		System.out.println("19) ");

		s = Math.sqrt(3) / 4 * a * a;
		System.out.println("Площадь равностороннего треугольника  равна: " + s);

		d = Math.sqrt(3) / 2 * a;
		System.out.println("Высота равностороннего треугольника  равна: " + d);

		r = Math.sqrt(3) / 6 * a;
		System.out.println("Радиус вписанной окружности равностороннего треугольника  равна: " + r);

		R = Math.sqrt(3) / 3 * a;
		System.out.println("Радиус описанной окружности равностороннего треугольника  равна: " + R);

	}

	public static void task20() {

		/*
		 * 20. Известна длина окружности. Найти площадь круга, ограниченного этой
		 * окружностью.
		 */

		double l;
		double r;
		double s;

		l = 10.0;

		System.out.println("20) ");

		r = l / (2 * Math.PI);
		s = Math.PI * r * r;

		System.out.println("Площадь круга равна: " + s);

	}

	public static void task21() {

		/*
		 * 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
		 * и целой частях). Поменять местами дробную и целую части числа и вывести
		 * полученное значение числа.
		 */

		double x;
		double y;

		x = 221.347;

		y = (x * 1000) % 1000 + (int) x / 1000.0;

		System.out.println("21) " + y);

	}

	public static void task22() {

		/*
		 * 22. Дано натуральное число Т, которое представляет длительность прошедшего
		 * времени в секундах. Вывести данное значение длительности в часах, минутах и
		 * секундах в следующей форме: ННч ММмин SSc.
		 */

		int t;
		int h;
		int totalm;
		int m;
		int sec;

		t = 43995;

		totalm = t / 60;
		sec = t - (totalm * 60);
		h = totalm / 60;
		m = totalm - (h * 60);

		System.out.println("22) " + h + "ч " + m + "мин " + sec + "с");

	}

	public static void task23() {

		/*
		 * 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R
		 * (R> r).
		 */

		double R;
		double r;

		double s;

		r = 2.0;
		R = 4.1;

		s = Math.PI * (R * R - r * r);

		System.out.println("23) Площадь кольца равна: " + s);

	}

	public static void task24() {

		/*
		 * 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
		 * большем основании а.
		 */

		double a;
		double b;
		double ygol;

		double s;

		a = 6;
		b = 3;
		ygol = Math.PI / 4;

		s = (a + b) * (a - b) * Math.tan(ygol) / 4;
		System.out.println("24) Площадь равнобедренной трапеции равна " + (float) s);

	}

	public static void task25() {

		/*
		 * 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
		 * коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения
		 * неотрицателен).
		 */

		double a;
		double b;
		double c;
		double D;
		double x1;
		double x2;

		a = 1.0;
		b = 5.0;
		c = 2.0;

		D = b * b - 4 * a * c;

		System.out.println("25) ");

		if (D > 0) {

			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);

			System.out.println("х1= " + x1);
			System.out.println("х2= " + x2);

		} else if (D == 0) {

			x1 = -(b / 2 * a);

			System.out.println("х1= " + x1);
		}
	}

	public static void task26() {

		/*
		 * 26. Найти площадь треугольника, две стороны которого равны а и b, а угол
		 * между этими сторонами у.
		 */

		double a;
		double b;
		double y;

		double s;

		a = 5.8;
		b = 6.4;
		y = Math.PI / 2;

		s = a * b * Math.sin(y) / 2.0;

		System.out.println("26) Площадь равна " + s);

	}

	public static void task27() {

		/*
		 * 27. Дано значение a. Не используя никаких функций и никаких операций, кроме
		 * умножения, получить значение а^ 8 за три операции и а^ 10 за четыре операции.
		 */

		int a;
		int b;
		int c;
		int d;
		int e;

		a = 2;

		b = a * a;
		c = b * b;
		d = c * c;

		System.out.println("27) ");

		System.out.println("a^8 = " + d);

		e = d * b;

		System.out.println("a^10 = " + e);

	}

	public static void task28() {

		/*
		 * 28. Составить программу перевода радианной меры угла в градусы, минуты и
		 * секунды.
		 */

		double rad;
		double grad;
		double min;
		double sec;

		rad = 1;

		grad = (180 / Math.PI) * rad;

		System.out.println("28) ");

		System.out.println("Радианная  мера угла (" + rad + ")  в градусах равна " + grad);

		min = (Math.PI / (180 * 60)) * rad;

		System.out.println("Радианная  мера угла (" + rad + ")  в минутах равна " + min);

		sec = (Math.PI / (180 * 60 * 60)) * rad;

		System.out.println("Радианная  мера угла (" + rad + ")  в секундах равна " + sec);

	}

	public static void task29() {

		// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

		double a;
		double b;
		double c;

		double cosA;
		double Arad;
		double Agrad;

		double cosB;
		double Brad;
		double Bgrad;

		double Crad;
		double Cgrad;

		a = 5;
		b = 6;
		c = 3;

		System.out.println("29) ");

		cosA = (b * b + c * c - a * a) / (2 * b * c);
		Arad = Math.acos(cosA);
		Agrad = Math.acos(cosA) * 180 / Math.PI;

		System.out.println(" Значение угла А в радианах равно " + Arad + ", в градусах -  " + Agrad);

		cosB = (b * b + a * a - c * c) / (2 * a * b);
		Brad = Math.acos(cosB);
		Bgrad = Math.acos(cosB) * 180 / Math.PI;

		System.out.println(" Значение угла B в радианах равно " + Brad + ", в градусах -  " + Bgrad);

		Cgrad = 180 - Agrad - Bgrad;
		Crad = (Cgrad * Math.PI) / 180;

		System.out.println(" Значение угла C в радианах равно " + Crad + ", в градусах -  " + Cgrad);

	}

	public static void task30() {

		/*
		 * 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите
		 * сопротивление соединения.
		 */

		double R1;
		double R2;
		double R3;

		double R;

		R1 = 14;
		R2 = 18;
		R3 = 8;

		R = (R1 * R2 * R3) / (R1 * R2 + R2 * R3 + R3 * R1);

		System.out.println("30) Cопротивление соединения равно " + R + "Ом");
	}

	public static void task31() {

		/*
		 * 31. Составить программу для вычисления пути, пройденного лодкой, если ее
		 * скорость в стояче воде v км/ч, скорость течения реки v1 км/ч, время движения
		 * по озеру t1 ч, а против течения реки — t2 ч.
		 */

		int v;
		int v1;
		int t1;
		int t2;

		int s;

		v = 42;
		v1 = 3;
		t1 = 2;
		t2 = 1;

		s = t1 * v + t2 * (v - v1);

		System.out.println("31) Путь, пройденный лодкой, равен " + s + " км");

	}

	public static void task32() {

		/*
		 * 32. Текущее показание электронных часов: t ч (0 ≤ т ≤23) n мин (0 ≤ п ≤59) к
		 * с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
		 */

		int t;
		int n;
		int k;
		int p;
		int q;
		int r;

		int totalm;
		int t1cek;
		int t2cek;
		int ch;
		int min;
		int sec;

		t = 5;
		n = 13;
		k = 20;

		p = 2;
		q = 7;
		r = 8;

		t1cek = t * 3600 + n * 60 + k;
		t2cek = t1cek + p * 3600 + q * 60 + r;

		totalm = t2cek / 60;
		ch = totalm / 60;
		min = totalm - (ch * 60);
		sec = t2cek - (totalm * 60);

		System.out.println("32) Часы будут показывать " + ch + "ч " + min + " мин " + sec + "с");

	}

	public static void task33() {

		/*
		 * 33. Ввести любой символ и определить его порядковый номер, а также указать
		 * предыдущий и последующий символы.
		 */

		char a;
		int a1;
		int b;
		char b1;
		int c;
		char c1;

		a = 'h';
		a1 = (int) a;
		b = a1 - 1;
		b1 = (char) b;
		c = a1 + 1;
		c1 = (char) c;

		System.out.println("33) ");

		System.out.println("символ " + a + " имеет порядковый номер: " + a1);
		System.out.println("предыдущий символ : " + b1);
		System.out.println("последующий символ : " + c1);

	}

	public static void task34() {

		/*
		 * 34. Дана величина А, выражающая объем информации в байтах. Перевести А в
		 * более крупные единицы измерения информации.
		 */

		double b;
		double k;
		double m;
		double g;
		double t;

		b = 1048576;

		System.out.println("34) ");

		k = b / 1024;
		System.out.println(b + " байт в Килобайтах равно " + k);

		m = k / 1024;
		System.out.println(b + " байт в Мегабайтах равно " + m);

		g = m / 1024;
		System.out.println(b + " байт в Гигабайтах равно " + g);

		t = g / 1024;
		System.out.println(b + " байт в Терабайтах равно " + t);

	}

	public static void task35() {

		/*
		 * 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		 * младшую цифру целой части числа M/N.
		 */

		double M;
		double N;
		double x;
		double sd;
		double mc;

		M = 117;
		N = 8;

		x = M / N;
		sd = (int) (10 * x) % 10;
		mc = (int) x % 10;

		System.out.println("35) ");

		System.out.println("Cтаршая цифра дробной части числа " + x + " равна " + sd);
		System.out.println("Mладшая цифра целой части числа  " + x + " равна " + mc);

	}

	public static void task36() {

		// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

		int a = 2411;
		int even = 1;
		int odd = 1;
		int digit;
		double priv;
		while (a > 0) {
			digit = a % 10;
			if (digit != 0) {
				if (digit % 2 != 0) {
					odd *= digit;
				} else {
					even *= digit;
				}
			}
			a /= 10;
		}

		priv = even * 1.0 / odd;

		System.out.println("36) ");
		System.out.println(priv);

	}

	public static void task37() {

		/*
		 * 37. Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: • Целое число N
		 * является четным двузначным числом. • Сумма двух первых цифр заданного
		 * четырехзначного числа равна сумме двух его последних цифр. • Сумма цифр
		 * данного трехзначного числа N является четным числом. • Точка с координатами
		 * (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n). •
		 * Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. •
		 * Треугольник со сторонами а,b,с является равнобедренным. • Сумма каких-либо
		 * двух цифр заданного трехзначного натурального числа N равна третьей цифре. •
		 * Заданное число N является степенью числа а (показатель степени может
		 * находиться в диапазоне от 0 до 4). • График функции у = ах2 + bх+ с проходит
		 * через заданную точку с координатами (m, n).
		 */

		boolean bool;
		int number;
		number = 22;

		System.out.println("37) ");

		if (number % 2 == 0) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Число " + number + " является четным двузначным числом " + bool);

		int z;
		z = 1024;
		if (z % 10 + z / 10 % 10 == z / 100 % 10 + z / 1000 % 10) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Сумма двух первых цифр числа " + z + " равна сумме двух его последних цифр " + bool);

		int numb;
		int n1;
		numb = 223;
		n1 = numb % 10 + numb / 10 % 10 + numb / 100 % 10;
		if (n1 % 2 == 0) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Сумма цифр данного трехзначного числа " + numb + " является четным числом " + bool);

		int x;
		int y;
		int m;
		int n;
		x = 6;
		y = 3;
		m = 2;
		n = 8;
		if (x < n && x > m) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит части плоскости,"
				+ " лежащей между прямыми х=" + m + ", х=" + n + " " + bool);

		int ch;
		int ch1;
		int ch2;
		double ch3;
		ch = 423;
		ch1 = ch * ch;
		ch2 = ch % 10 + ch / 10 % 10 + ch / 100 % 10;
		ch3 = Math.pow(ch2, 3);
		if (ch1 == ch3) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Квадрат числа " + ch + " равен кубу суммы цифр этого числа " + bool);

		int a;
		int b;
		int d;
		a = 6;
		b = 5;
		d = 5;
		if (a == b || a == d || b == d) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Треугольник со сторонами " + a + "," + b + "," + d + " является равнобедренным " + bool);

		int k;
		k = 123;
		if (k % 10 == k / 10 % 10 + k / 100 % 10) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Сумма двух цифр трехзначного числа " + k + " равна третьей цифре " + bool);

		int step;
		int chislo;
		step = 2;
		chislo = 18;
		if (step == 1 || chislo == Math.pow(step, 2) || chislo == Math.pow(step, 3) || chislo == Math.pow(step, 4)) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("Число " + chislo + " является степенью числа " + step + " " + bool);

		int c;
		a = 2;
		b = 4;
		c = 5;
		n = 1;
		m = 11;
		y = a * (n * n) + b * n + c;
		if (y == m) {
			bool = true;
		} else {
			bool = false;
		}
		System.out.println("График функции проходит через заданную точку с координатами (m, n) " + bool);

	}

	public static void task38() {

		/*
		 * 38. Для данных областей составить линейную программу, которая печатает true,
		 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
		 * противном случае:
		 */

		boolean b;
		int x;
		int y;

		x = 3;
		y = 2;

		System.out.println("38) ");

		if ((y >= 0) && (y <= x + 4) && (y <= 4 - x)) {
			b = true;
		} else {
			b = false;
		}
		System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит закрашенной области " + b);

		if (y >= 0 & y <= 4 & x <= 2 & x >= -2 || (y >= -3) & (y <= 0) & x <= 4 & x >= -4) {
			b = true;
		} else {
			b = false;
		}
		System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит закрашенной области " + b);

		if (((x * x + y * y) <= 16) && x >= 0) {
			b = true;
		} else {
			b = false;
		}
		System.out.println("Точка с координатами (" + x + "," + y + ") принадлежит закрашенной области " + b);

	}

	public static void task39() {

		/*
		 * 39. Дано действительное число х. Не пользуясь никакими другими
		 * арифметическими операциями, кроме умножения, сложения и вычитания, вычислите
		 * за минимальное число операций:2x^4- 3x^3 + 4х^2- 5х + 6.
		 */

		int x;
		int y;

		x = 2;

		y = (((2 * x - 3) * x + 4) * x - 5) * x + 6;

		System.out.println("39)" + y);

	}

	public static void task40() {

		/*
		 * 40. Дано значение х. Получить значения -2х + 3х^2- 4х^3 и 1 + 2х + 3х^2 +
		 * 4х^3. Позаботьтесь об экономии операций
		 */

		int x;
		int y1;
		int y2;

		x = 2;

		y1 = ((-4 * x + 3) * x - 2) * x;

		y2 = ((4 * x + 3) * x + 2) * x + 1;

		System.out.println("40)");

		System.out.println(y1);

		System.out.println(y2);

	}

}
