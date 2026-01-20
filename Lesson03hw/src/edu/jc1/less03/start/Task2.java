package edu.jc1.less03.start;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты (x1, y1) = ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		System.out.println("Введите координаты (x2, y2) = ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double L = 0;

		L = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		L = Math.sqrt(L);

		System.out.println("Расстояние между двумя точками = " + L);

	}

}
