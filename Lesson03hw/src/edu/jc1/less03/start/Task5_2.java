package edu.jc1.less03.start;

import java.util.Scanner;

public class Task5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите x: ");
		double x = scanner.nextDouble();

		System.out.print("Введите y: ");
		double y = scanner.nextDouble();

		double result = 0;
		double temp;

		temp = Math.cos(x) - Math.sin(y);

		if (temp != 0) {
			result = ((Math.sin(x) + Math.cos(y)) / temp) * Math.tan(x * y);
		} else {
			System.out.println("Знаменатель равен нулю.");
			result = Double.NaN;
		}
		System.out.println("Результат: " + result);
	}

}
