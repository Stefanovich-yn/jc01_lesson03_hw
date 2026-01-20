package edu.jc1.less03.start;

public class Task5 {

	public static void main(String[] args) {

		System.out.println("Пи в степени 1: " + Math.pow(Math.PI, 1));
		System.out.println("Пи в степени 2: " + Math.pow(Math.PI, 2));
		System.out.println("Пи в степени 3: " + Math.pow(Math.PI, 3));
		System.out.println("Пи в степени 4: " + Math.pow(Math.PI, 4));

		System.out.println("\n-----------------------------------\n");

		for (int i = 1; i < 5; i++) {
			double result = Math.pow(Math.PI, i);
			System.out.println("Пи в степени " + i + ": " + result);
		}

	}

}
