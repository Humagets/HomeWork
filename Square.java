package HomeWork;

/**
 * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
 * данные. Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
 * При решении создать и использовать следующие вынесенные  функции:
 *     - функция isPositive, определяющая, является ли число положительным
 *     - функция isZero, определяющая, является ли число нулём
 *     - функция discriminant, вычисляющая дискриминант
 */

public class Square {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = -4;
		double x, x1, x2;
		System.out.println("Программа вычисляет корни квадратного уравнения вида ax² + bx + c = 0");
		System.out.println("где " + "a=" + a + " b=" + b + " c=" + c);

//		int D = b * b - 4 * a * c;
//		if (D > 0) {
//			x1 = (-b - Math.sqrt(D)) / (2 * a);
//			x2 = (-b + Math.sqrt(D)) / (2 * a);
//			System.out.println("Корни уравнения: x1 = " + x1 + " и x2 = " + x2);
//		} else if (D == 0) {
//			x = -b / (2 * a);
//			System.out.println("Корни уравнения x1 = x2: " + x);
//		} else {
//			System.out.println("Корней нет");
//		}
//	}}
		if (isPositive(discriminant(a, b, c))) {
			x1 = ((-b + Math.sqrt(discriminant(a, b, c))) / (2 * a));
			x2 = ((-b - Math.sqrt(discriminant(a, b, c))) / (2 * a));
			System.out.println("Корни уравнения: x1 = " + x1 + " и x2 = " + x2);
		} else if (isZero(discriminant(a, b, c))) {
			x = (-b / (2 * a));
			System.out.println("Корни уравнения x1 = x2: " + x);
		} else {
			System.out.println("Корней нет");
		}
	}

	public static int discriminant(int a, int b, int c) {
		return (b * b - 4 * a * c);
	}

	public static boolean isZero(int z) {
		return (z == 0);
	}

	public static boolean isPositive(int p) {
		return (p > 0);
	}
}