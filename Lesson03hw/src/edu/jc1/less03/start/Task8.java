package edu.jc1.less03.start;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите длину ребра куба a = ");
		double a = scanner.nextDouble();

		double S1 = Math.pow(a, 2);
		double S = 6 * S1;
		double V = Math.pow(a, 3);

		System.out.println("\nПлощадь грани = " + S1);
		System.out.println("Площадь полной поверхности = " + S);
		System.out.println("Объем куба = " + V);

	}

}
