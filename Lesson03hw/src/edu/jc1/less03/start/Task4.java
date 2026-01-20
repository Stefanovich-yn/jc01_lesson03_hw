package edu.jc1.less03.start;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите радиус R = ");
		double R = sc.nextDouble();
		double L = 0;
		double S = 0;

		L = Math.PI * 2 * R;
		S = Math.PI * Math.pow(R, 2);

		System.out.println("\nДлина окружности = " + L);
		System.out.println("Площадь окружности  = " + S);

	}

}
