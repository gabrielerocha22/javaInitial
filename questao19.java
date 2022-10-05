package br.com.java.nelio;

import java.io.IOException;
import java.util.Scanner;


public class questao19 {
	public static void main(String[] args) throws IOException {
		try (Scanner br = new Scanner(System.in)) {
			int num = br.nextInt();

			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
				br.close();
			}
		}
	}
}
