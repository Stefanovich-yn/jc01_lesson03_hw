package edu.jc1.less03.start;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число a = ");
		double a = scanner.nextDouble();

		System.out.print("Введите число b = ");
		double b = scanner.nextDouble();

		double A = Math.pow(a, 3);
		double B = Math.pow(b, 3);
		double avgA = (A + B) / 2;

		double absA = Math.abs(a);
		double absB = Math.abs(b);
		double avgG = Math.sqrt(absA * absB);

		System.out.println("Среднее арифметическое кубов: " + avgA);
		System.out.println("Среднее геометрическое модулей: " + avgG);
	}

}
