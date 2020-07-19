package HomeWork;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

public class sum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");

		int entered = scanner.nextInt();
		System.out.println("Вы ввели чиcло: " + entered);

		int summation = SumFor(entered);
		System.out.println("Сумма цифр введённого пользователем числа: " + summation);

	}

	public static int SumFor(int value) {
		int result = 0;
		for (int summ = value; summ != 0; summ /= 10) {
			result += summ % 10;
		}
		return result;
	}

}

