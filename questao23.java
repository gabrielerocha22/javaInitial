package br.com.java.nelio;

import java.io.IOException;
import java.util.Scanner;

public class questao23 {
	public static void main(String[] args) throws IOException {
		try (Scanner br = new Scanner(System.in)) {
			int n = br.nextInt();
			int fatorial = 1;

			for (int i = 1; i <= n; i++) {
				fatorial = fatorial * i;
			}
			System.out.println(fatorial);
			br.close();
		}
	}
}
