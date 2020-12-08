package ExercMatriz;

import java.util.Scanner;

public class MatrizPosicao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas linhas a matriz terá ");
		int m = sc.nextInt();
		System.out.println("Digite quantas colunas a matriz terá ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Emcima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Embaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}