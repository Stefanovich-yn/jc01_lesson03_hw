package edu.jc1.less03.start;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите длину окружности L = ");
		double L = scanner.nextDouble();

		double r = L / (2 * Math.PI);
		double S = Math.PI * Math.pow(r, 2);

		System.out.printf("\nРадиус окружности: %.4f\n", r);
		System.out.printf("Площадь круга: %.4f\n", S);

	}

}
