package edu.jc1.less03.start;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите сторону равностороннего треугольника a = ");
		double a = scanner.nextDouble();
		double sqrt3 = Math.sqrt(3);

		double H = (a * sqrt3) / 2;
		double S = (Math.pow(a, 2) * sqrt3) / 4;
		double r = (a * sqrt3) / 6;
		double R = (a * sqrt3) / 3;

		System.out.printf("\nВысота = %.4f\n", H);
		System.out.printf("Площадь = %.4f\n", S);
		System.out.printf("Радиус вписанной окружности r = %.4f\n", r);
		System.out.printf("Радиус описанной окружности R = %.4f\n", R);

	}

}
