package br.com.java.nelio;

import java.io.IOException;
import java.util.Scanner;

public class questao22 {
	public static void main(String[] args) throws IOException {
		try (Scanner br = new Scanner(System.in)) {
			int n = br.nextInt();

			for (int i = 0; i < n; i++) {
				int num1 = br.nextInt();
				int num2 = br.nextInt();
				if (num2 == 0) {
					System.out.println("divisao impossivel");
				} else {
					int media = num1 / num2;
					System.out.println(media);
				}
			}
		}
	}

}
