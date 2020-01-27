package by.htp.branch.main;

public class BranchTask {

	public static void task1() {

		/*
		 * 1. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � �������
		 * �� ����� ����� 7, � ��������� ������ � ����� 8.
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
		 * 2. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � �������
		 * �� ����� ����� �yes�, � ��������� ������ � ����� �no�
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
		 * 3. ��������� ��������� ��������� ���������� ����� � � ����� 3. ������� ��
		 * ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.
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

		// 4. ��������� ���������: ����� �� ��� ����� � � b?

		int b;
		int a;

		a = 1;
		b = 7;

		if (a == b) {

			System.out.println("4) ����� " + a + " ����� " + b);

		} else {

			System.out.println("4) ����� " + a + " �� ����� " + b);

		}
	}

	public static void task5() {

		// 5. ��������� ���������: ����������� ����������� �� ���� ����� � � b.

		int a;
		int b;

		a = 5;
		b = 8;

		if (a < b) {

			System.out.println("5) ����� " + a + " ���������� ");

		} else {

			System.out.println("5) ����� " + b + " ���������� ");

		}
	}

	public static void task6() {

		// 6. ��������� ���������: ����������� ����������� �� ���� ����� � � b

		int a;
		int b;

		a = 5;
		b = 9;

		if (a > b) {

			System.out.println("6) ����� " + a + " ���������� ");

		} else {

			System.out.println("6) ����� " + b + " ���������� ");

		}
	}

	public static void task7() {

		/*
		 * 7. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ���
		 * �������� ��������� a, b, c � �
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

		System.out.println("7) ������ ��������� ����� " + d);
	}

	public static void task8() {

		/*
		 * 8. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.
		 */

		int a;
		int b;

		a = 2;
		b = 3;

		if ((a * a) < (b * b)) {

			System.out.println("8) ������� ����� " + a + " ���������� ");

		} else {

			System.out.println("8)  ������� ����� " + b + " ���������� ");

		}
	}

	public static void task9() {

		/*
		 * 9. ��������� ���������, ������� ��������� �� ���� ��������� ��������,
		 * �������� �� ������ ����������� ��������������.
		 */

		int a;
		int b;
		int c;

		a = 3;
		b = 3;
		c = 3;

		if ((a == b) && (b == c) && (c == a)) {

			System.out.println("9) ����������� �� ��������� " + a + "," + b + "," + c + " �������� �����c�������� ");

		} else {

			System.out.println("9)����������� �� ��������� " + a + "," + b + "," + c + " �� �������� �����c�������� ");

		}
	}

	public static void task10() {

		/* 10. ��������� ���������, ������� ��������� ������� ������ ����� ������. */

		double s1;
		double s2;

		s1 = 2.061;
		s2 = 3.142;

		if (s1 < s2) {

			System.out.println("10) ������� ������� ����� ������ ");

		} else {

			System.out.println("10) ������� ������� ����� ������");

		}
	}

	public static void task11() {

		/*
		 * 11. ��������� ���������, ������� ��������� ������� ������ ������������ ������
		 */

		double s3;
		double s4;

		s3 = 8.1;
		s4 = 5.6;

		if (s3 > s4) {

			System.out.println("11) ������� ������� ������������ ������");

		} else {

			System.out.println("11) ������� ������� ������������ ������");

		}
	}

	public static void task12() {

		/*
		 * 12. ���� ��� �������������� �����. �������� � ������� �� �� ���, ��������
		 * ������� ��������������, � � ��������� ������� � �������������.
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
		 * 13. ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������,
		 * ������� �� ����� ��������� ����� � ������ ���������.
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

			System.out.println("13) ����� � �����");

		}

		else {

			System.out.println("13) ����� � �����");

		}
	}

	public static void task14() {

		/*
		 * 14) ���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����
		 * �����������, � ���� ��, �� ����� �� �� �������������.
		 */

		int ygol1;
		int ygol2;

		ygol1 = 30;
		ygol2 = 30;

		if ((ygol1 + ygol2) < 180) {
			System.out.print("14) ����������� ���������� ");
		} else {

			System.out.print("14) ����������� �� ����������");
		}

		if (ygol1 == 90 || ygol2 == 90 || (ygol1 + ygol1) == 90) {

			System.out.println(" ����������� �������������");
		}

		else {

			System.out.println(" ����������� �� �������������");
		}
	}

	public static void task15() {

		/*
		 * 15. ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ����
		 * ���� ����� �������� ��������� �� �����, � ������� � �� ���������
		 * �������������.
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
		 * 16. �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ���
		 * ����������� (�� ����� ��� ��� � ����� ������������ ����).
		 */

		int x;
		int y;

		x = 1;
		y = 2;

		if ((x == 0) && (y == 0)) {
			System.out.println("16) ����� � � ������ ���������");
		} else if (x == 0) {
			System.out.println("16) ����� � �� ��� Y");
		} else if (y == 0) {
			System.out.println("16) ����� � �� ��� X");
		} else if (x > 0 && y > 0) {
			System.out.println("16) ����� � � I �������� ");
		} else if (x < 0 && y > 0) {
			System.out.println("16) ����� � � II �������� ");
		} else if (x < 0 && y < 0) {
			System.out.println("16) ����� � � III �������� ");

		} else {
			System.out.println("16) ����� � � IV �������� ");
		}
	}

	public static void task17() {

		/*
		 * 17. ���� ����� ����� m, n. ���� ����� �� �����, �� �������� ������ �� ���
		 * ����� � ��� �� ������, ������ �������� �� ��������, � ���� �����, �� ��������
		 * ����� ������.
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

		/* 18. ���������� ���������� ������������� ����� ����� �, b, �. */

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

		System.out.println("18) ������������� ����� " + count);
	}

	public static void task19() {

		/* 19. ���������� ���������� ������������� ����� ����� �, b, �. */

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

		System.out.println("19) ������������� ����� " + coun);
	}
	
		public static void task20() {
		
		/*
		 * 20. ����������, ��������� ����� ����� �, b, � �������� ����� k.
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

			System.out.println("20) ����� " + k1 + " �������� ��������� ����� " + a);

		} else {

			System.out.println("20) ����� " + k1 + " �� �������� ��������� ����� " + a);
		}

		if (b % k1 == 0) {

			System.out.println(" ����� " + k1 + " �������� ��������� ����� " + b);

		} else {

			System.out.println(" ����� " + k1 + " �� �������� ��������� ����� " + b);

		}

		if (c % k1 == 0) {

			System.out.println(" ����� " + k1 + " �������� ��������� ����� " + c);

		} else {

			System.out.println("����� " + k1 + " �� �������� ��������� �����" + c);

		}

	}

		public static void task21() {
			
			/*
			 * 21. ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ���
			 * �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ���������
			 * ����� ���� �������� �������!� ��� ���� �������� ��������!�.
			 */

			char ch;

			ch = 'D';

			switch (ch) {
			case 'D':
				System.out.println("21) ��� �������� �������!");
				break;
			case 'M':
				System.out.println("21) ��� �������� ��������!");
				break;

			default:
				System.out.println("21) �������� ��� ���");
			}

		}

		public static void task22() {

			/*
			 * 22. ���������������� �������� ���������� � � � ���, ����� � � ���������
			 * ������� �� ���� ��������, � � y - �������.
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
			 * 23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31,
			 * ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
			 */

			int date;
			int month;

			date = 28;
			month = 14;

			if ((date < 1) || (date > 31) || (month < 1) || (month > 12)) {
				System.out.println("23) B������ ������������ ������");
			} else {
				System.out.println("23) ����� " + date + " ����� " + month);
			}
		}

		public static void task24() {

			/*
			 * 24. ��������� ���������, ������������ ��������� ������� �� ������� �
			 * �������� �����, ���� �� �������� ������ ���������� ��������� n.
			 */

			int n;

			n = 6;

			if (n % 2 == 0) {
				System.out.println("24) ����� ");
			} else {
				System.out.println("24) �� ����� ");
			}

		}

		public static void task25() {

			/*
			 * 25. �������� ��������� � ������ ������� ��������� ������� � ���������,
			 * ������� ������� ��������� �������������� �������� �, ���� ����������� �
			 * ������� ��������� 60� �.
			 */

			int t;

			t = 75;

			if (t > 60) {
				System.out.println("25) ������������� �������� ");
			} else {
				System.out.println("25) �� ������������� �������� ");
			}

		}

		public static void task26() {

			// 26. �������� ��������� ���������� ����� �������� � �������� �� ���� �����.

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

			System.out.println("26) C���a �������� � �������� �� ���� �����: " + a + "," + b + "," + c + ", ����� " + s);

		}

		public static void task27() {

			// 27. ����� max{min(a, b), min(c, d)}.

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
			 * 28. ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� ��
			 * ����� d, �� ����� max(d � a, d � b, d � c).
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

				System.out.println("28) max(d � a, d � b, d � c)=" + max);
			}
		}

		public static void task29() {

			// 29. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ���
			// ����������� �� ����� ������.

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
				System.out.println("29) ����� ����� �� ����� ������");
			} else {
				System.out.println("29) ����� �� ����� �� ����� ������");
			}
		}

		public static void task30() {

			/*
			 * 30. ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, �
			 * �������� �� ����������� ����������, ���� ��� �� ���.
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
			 * 31. ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
			 * ����������, ������� �� ������ ����� ���������.
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
				System.out.println("31) ������ ������� � ���������");
			} else if (((x <= a) && (z <= b)) || ((z <= a) && (x <= b))) {
				System.out.println("31) ������ ������� � ���������");
			} else if (((y <= a) && (z <= b)) || ((z <= a) && (y <= b))) {
				System.out.println("31) ������ ������� � ���������");
			} else {
				System.out.println("31) ������ �� ������� � ���������");
			}
		}

		public static void task32() {

			/*
			 * 32. �������� ���������, ������� �� �������� ���� ������ ����������, ��������
			 * �� ����� �����-���� ���� �� ��� �������������.
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
				System.out.println("32) �� �������� ��������� ������������� ����� ���");
			}
		}

		public static void task33() {

			/*
			 * 33. �������� ���������, ������� �� ������ ����� ���������� ������� �������
			 * ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������
			 * ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ���������
			 * ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � ��������
			 * ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.
			 */

			int passw;

			passw = 1747;

			if (passw == 9583 || passw == 1747) {
				System.out.println("33) �������� ������ ��� �, �, �");
			} else if (passw == 3331 || passw == 7922) {
				System.out.println("33) �������� ������ ��� �, �");
			} else if (passw == 9455 || passw == 8997) {
				System.out.println("33) �������� ������ ��� �");
			} else {
				System.out.println("33) �������� ������");
			}
		}

		public static void task34() {

			/*
			 * /* 34. ��������� ���������, ����������� ������ ���������� ���������� �
			 * ������� ��������. ��������� ����������� ��������� ����, ����� �����,
			 * ��������� �����������; ���� ����� �� ���������, �������� �� ������ ��������;
			 * ���� ����� ������� ������, ��� ����������, �� �������� ��������� ����� �
			 * ��������� ����� �����; ���� ����� ������������, �� �������� ��������� �� ����
			 * � ��������� ������ ����������� �����.
			 */

			int stoim;
			int sum;
			int nsum;

			stoim = 500;
			sum = 450;

			if (sum == stoim) {
				System.out.println("34) �������");
			} else if (sum > stoim) {
				System.out.println("34) �������� �����");
			} else {
				nsum = stoim - sum;
				System.out.println("34) ����� ������������. ��� ���������� �������� " + nsum + "���.");
			}
		}

		public static void task35() {

			// 35. ��������� ����� � ����� � ������������ ���� �� ������ ���.

			int daymohth;
			int numday;

			daymohth = 0;
			numday = 291;

			if (numday > 0 && numday <= 31) {
				daymohth = numday;
				System.out.println("35) ������ " + daymohth + " �����");
			} else if (numday > 31 && numday <= 59) {
				daymohth = numday - 31;
				System.out.println("35) ������� " + daymohth + " �����");
			} else if (numday > 59 && numday <= 90) {
				daymohth = numday - 59;
				System.out.println("35) ���� " + daymohth + " �����");
			} else if (numday > 90 && numday <= 120) {
				daymohth = numday - 90;
				System.out.println("35) ������ " + daymohth + " �����");
			} else if (numday > 120 && numday <= 151) {
				daymohth = numday - 120;
				System.out.println("35) ��� " + daymohth + " �����");
			} else if (numday > 151 && numday <= 181) {
				daymohth = numday - 151;
				System.out.println("35) ���� " + daymohth + " �����");
			} else if (numday > 181 && numday <= 212) {
				daymohth = numday - 181;
				System.out.println("35) ���� " + daymohth + " �����");
			} else if (numday > 212 && numday <= 243) {
				daymohth = numday - 212;
				System.out.println("35) ������ " + daymohth + " �����");
			} else if (numday > 243 && numday <= 273) {
				daymohth = numday - 243;
				System.out.println("35) �������� " + daymohth + " �����");
			} else if (numday > 273 && numday <= 304) {
				daymohth = numday - 273;
				System.out.println("35) ������� " + daymohth + " �����");
			} else if (numday > 304 && numday <= 334) {
				daymohth = numday - 304;
				System.out.println("35) ������ " + daymohth + " �����");
			} else if (numday > 334 && numday <= 365) {
				daymohth = numday - 334;
				System.out.println("35) ������� " + daymohth + " �����");
			} else {
				System.out.println("35) ����� ���� ���");
			}
		}

		public static void task36() {

			// 36. ��������� �������� �������:

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

			// 37. ��������� �������� �������:

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

			// 38. ��������� �������� �������:

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

			// 39. ��������� �������� �������:

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

			// ��������� �������� �������:

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


