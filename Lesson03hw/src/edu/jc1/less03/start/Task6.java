package edu.jc1.less03.start;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		int a = sc.nextInt();
		
		
        int d1 = a/ 1000;         
        
        int d2 = (a / 100) % 10;
        
        int d3 = (a / 10) % 10; 
        
        int d4 = a % 10;           
        
        int p = d1 * d2 * d3 * d4;

        System.out.println("\nПроизведение цифр равно " + p);
        
		System.out.println("\n-----------------------------------\n");
		int product = 1;

		for (int i = 0; i < 4; i++) {
			int d = a % 10;
			product = product * d;
			a = a / 10;
		}

		System.out.println("Произведение цифр равно " + product);

	}

}
