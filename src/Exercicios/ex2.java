package Exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		if (pertenceFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence é da sequência Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence a sequência Fibonacci.");
		}

		scanner.close();
	}

	public static boolean pertenceFibonacci(int numero) {
		int a = 0, b = 1;
		while (b < numero) {
			int temp = b;
			b = a + b;
			a = temp;
		}
		return b == numero;
	}

}
