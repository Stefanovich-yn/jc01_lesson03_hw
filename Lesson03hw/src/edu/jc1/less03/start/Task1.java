package edu.jc1.less03.start;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину а первого катета = ");
		double a = sc.nextDouble();

		System.out.println("Введите длину b второго катета = ");
		double b = sc.nextDouble();

		double P = 0;
		double S = 0;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		P = a + b + c;
		S = a * b / 2;

		System.out.println("Периметр прямоугольного треугольника = " + P);
		System.out.println("Площадь прямоугольного треугольника = " + S);

	}

}
