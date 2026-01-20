package edu.jc1.less03.start;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты (x1, y1) = ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		System.out.println("Введите координаты (x2, y2) = ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		System.out.println("Введите координаты (x3, y3) = ");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();

		double a = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double b = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double c = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

		double P = 0;
		double S = 0;

		P = a + b + c;
		S = Math.sqrt(P / 2 * (P / 2 - a) * (P / 2 - b) * (P / 2 - c));

		System.out.println("Периметр треугольника = " + P);
		System.out.println("Площадь треугольника = " + S);

	}

}
