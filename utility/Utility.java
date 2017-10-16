package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.*;

public class Utility {
	Scanner sc = new Scanner(System.in);

	/**
	 * User name
	 * 
	 * @param a
	 */
	public void User_name(String a)// User Name
	{
		int n = a.length();
		if (n >= 3) {
			System.out.println("Hello  " + a + "  How are you ?");
		} else {
			System.out.println("Name too small ..!!");
		}
	}

	/**
	 * Flip coins
	 * 
	 * @param num
	 * @return
	 */
	public int Flip_Coin(int num)// flip coin
	{
		int h;
		int t;
		Random r = new Random();
		float random;
		h = 0;
		t = 0;
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				random = r.nextFloat();
				if (random < 0.5) {
					h++;
				} else {
					t++;
				}
			}
			float hpercent = (float) h * 100 / num;
			float tpercent = (float) t * 100 / num;
			System.out.println("Percentage of Heads is " + hpercent + " % .");
			System.out.println("Percentage of Tails is " + tpercent + "% .");
		} else {
			System.out.println("enter +ve number ");
		}
		return 0;
	}

	/**
	 * leap year
	 * 
	 * @param year
	 * @return
	 */
	public int leap_year(int year)// leap year
	{
		if (year % 4 != 0) {
			System.out.println(year + "is not a leap year");
		} else {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + "is a leap year");
				} else {
					System.out.println(year + "is not leap year");
				}
			} else {
				System.out.println(year + "is a leap year");
			}
		}
		return 0;
	}

	/**
	 * power of two
	 * 
	 * @param n
	 */
	public int pow_of_two(int n) {
		int i = 0;
		int powerOfTwo = 1;
		while (i <= n) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;
		}
		return 0;
		// TODO Auto-generated method stub

	}

	/**
	 * Harmonic numbers
	 * 
	 * @param num
	 */
	public void harmonic(int num) {
		float value = 0.00f;
		if (num <= 0) {
			System.out.println("Number is invalid. ");
		} else {
			for (int i = 1; i <= num; i++) {
				value = value + (float) 1 / i;
			}
			System.out.println("The " + num + " harmonic value is " + value + " .");
		}
		// TODO Auto-generated method stub

	}

	/**
	 * Factors
	 * 
	 * @param num
	 */
	public void factors(int num) {
		while (num % 2 == 0) {
			System.out.print(2 + " ");
			num = num / 2;
		}
		int i;
		for (i = 3; i <= Math.sqrt(num); i += 2) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
		}
		if (num > 2) {
			System.out.print(num);
		}
		// TODO Auto-generated method stub

	}

	/**
	 * gambler programs
	 * 
	 * @param stake
	 * @param goal
	 * @param num
	 */
	public void gambler(int stake, int goal, int num) {
		Random r = new Random();
		float random;
		int win = 0, loss = 0;
		int temp;
		float percentofwin = 0.00f, percentofloss = 0.00f;
		int i;
		for (i = 0; i < num; i++) {
			temp = stake;
			while (temp != goal) {
				random = r.nextFloat();
				if (random <= 0.5) {
					temp -= 1;
				} else {
					temp += 1;
				}
				if (temp == 0) {
					break;
				}
			}
			System.out.println(temp);
			if (temp == 0) {
				loss++;
			} else {
				win++;
			}
		}
		percentofwin = (float) win * 100 / num;
		percentofloss = (float) loss * 100 / num;
		System.out.println("number of wins = " + win + " percentage of win = " + percentofwin + " % ");
		System.out.println("number of loss=" + loss + " percentage of loss=" + percentofloss + "%");

		// TODO Auto-generated method stub

	}

	/**
	 * Quadratic equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void quadratic(int a, int b, int c) {
		double temp = Math.sqrt(b * b - 4 * a * c);
		double r1 = (-b + temp) / (2 * a);
		double r2 = (-b - temp) / (2 * a);
		System.out.println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are " + r1 + " and " + r2);
		// TODO Auto-generated method stub

	}

	/**
	 * Sum of three number is equal to Zero
	 * 
	 * @param n
	 */
	public void SumOfThreeNumberIsZero(int n) {
		int a[] = new int[n];
		System.out.println("enter the array elements");
		int i, j, k, sum, count = 0;
		;
		for (i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i <= a.length - 3; i++) {
			for (j = i + 1; j <= a.length - 2; j++) {
				for (k = j + 1; k <= a.length - 1; k++) {
					sum = a[i] + a[j] + a[k];
					if (sum == 0) {
						count++;
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

	/////// TicTacToe
	static int a, b, j, i;
	static int k, l;
	static String arr[][] = new String[3][3];
	static {
		for (k = 0; k < 3; k++) {
			for (l = 0; l < 3; l++) {
				arr[k][l] = "-";
			}
		}
	}
	Random r = new Random();

	/**
	 * TicTacToe Game
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int TicTacToe(int m, int n) {
		j = 0;
		if (arr[m][n] != "0" && arr[m][n] != "x") {
			arr[m][n] = "x";
			while (j != 1) {
				a = r.nextInt(3);
				b = r.nextInt(3);
				if (arr[a][b] != "0" && arr[a][b] != "x") {
					arr[a][b] = "0";
					j = 1;
				}
			}
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			for (i = 0; i < 3; i++) {
				// checks the rows
				if (arr[i][0] == "x" && arr[i][1] == "x" && arr[i][2] == "x"
						|| arr[i][0] == "0" && arr[i][1] == "0" && arr[i][2] == "0") {
					if (arr[i][i] == "x") {
						System.out.println("you win");
						System.exit(0);
					} else if (arr[i][i] == "0") {
						System.out.println("computer win");
						System.exit(0);
					}
				}
				if (arr[0][i] == "x" && arr[1][i] == "x" && arr[2][i] == "x"
						|| arr[0][i] == "0" && arr[1][i] == "0" && arr[2][i] == "0") {
					if (arr[i][i] == "x") {
						System.out.println("you win");
						System.exit(0);
					} else if (arr[i][i] == "0") {
						System.out.println("computer win");
						System.exit(0);
					}
				}
			}
			if (arr[0][0] == "x" && arr[1][1] == "x" && arr[2][2] == "x"
					|| arr[0][2] == "x" && arr[1][1] == "x" && arr[2][0] == "x") {
				System.out.println("you win");
				System.exit(0);
			} else if (arr[0][0] == "x" && arr[1][1] == "x" && arr[2][2] == "x"
					|| arr[0][2] == "x" && arr[1][1] == "x" && arr[2][0] == "x") {
				System.out.println("computer win");
				System.exit(0);
			}
			return 1;
		} else {
			return 0;
		}
		// TODO Auto-generated method stub

	}

	/**
	 * PERMUTATION
	 * @param str
	 * @param l
	 * @param r
	 */
	public void permute(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char charArray[] = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Static method for coupon number
	 * @author bridgeit
	 *
	 */
	class Static {
		private int value;
		Random r = new Random();

		public int get() {
			value = r.nextInt(99);
			return value;
		}
	}

	/**
	 * Coupon numbers
	 * @param size
	 */
	public void couponNumber(int size) {
		int array[] = new int[size];
		int count = 0, value, position = 0, j;
		Static sf = new Static(); // object creation.

		while (position != size) {
			value = sf.get();
			count++;
			j = 0;
			if (position == 0) {
				array[position] = sf.get();
				position++;
			} else {
				for (int z : array) {
					if (z == value) {
						j = 1;
						break;
					}
				}
				if (j == 0) {
					array[position] = value;
					position++;
				}

			}
		}
		System.out.println("The " + size + " values are ");
		for (j = 0; j < size; j++) {
			System.out.print(" " + array[j] + " ");
		}
	
		// TODO Auto-generated method stub

	}

	
	/** Two D array for Integer
	 * @param rows
	 * @param cols
	 */
	public void TwoDArrayInteger(int rows, int cols) {
		PrintWriter print = new PrintWriter(System.out, true);
		String array[][] = new String[rows][cols];
		print.println("enter the values ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				array[i][j] = sc.next();
			}
		}
		print.println("array elements are. ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				print.print(array[i][j] + "  ");
			}
			print.println(" ");
		}
		// TODO Auto-generated method stub
		
	}

	/**
	 * Two d Array for Double
	 * @param rows
	 * @param cols
	 */
	public void TwoDArrayDouble(int rows, int cols) {
		PrintWriter print = new PrintWriter(System.out, true);
		double array[][] = new double[rows][cols];
		print.println("enter the values ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				array[i][j] = sc.nextDouble();
			}
		}
		print.println("array elements are. ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				print.print(array[i][j] + "  ");
			}
			print.println(" ");
		}
		// TODO Auto-generated method stub
		
	}

	/**
	 * Two d array for boolean
	 * @param rows
	 * @param cols
	 */
	public void TwoDArrayBollean(int rows, int cols) {
		PrintWriter print = new PrintWriter(System.out, true);
		boolean array[][] = new boolean[rows][cols];
		print.println("enter the values ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				array[i][j] = sc.nextBoolean();
			}
		}
		print.println("array elements are. ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				print.print(array[i][j] + "  ");
			}
			print.println(" ");
		}
		// TODO Auto-generated method stub
		
	}

}
