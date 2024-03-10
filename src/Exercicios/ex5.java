package Exercicios;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma string: ");
		String stringOriginal = scanner.nextLine();

		String stringInvertida = inverterString(stringOriginal);
		System.out.println("String invertida: " + stringInvertida);

		scanner.close();
	}

	public static String inverterString(String string) {
		String novaString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			novaString += string.charAt(i);
		}
		return novaString;
	}

}
