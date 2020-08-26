package by.htp.less04.main;

import java.util.Arrays;

public class Fourmain {
	public static void main(String[] args) {
		
	int n = 5 ;
	Printres(Array(n));	
	}
	
	
	public static int[][] Array(int x) {
		int arr [][] = new int [x][x];
		return arr;
		}

	
	
	public static void Printres(int arr [][]){
		for (int i = 0; i < arr.length ; i ++ ) {
			int red = arr.length;
			if (i == 0 || i % 2 == 0) {
				for (int j = 0; j < arr[i].length ; j ++ ) {
					arr[i][j] = j+1;
				}
			}
			else {
				for (int j = 0; j < arr.length ; j ++ ) {
						arr[i][j] = red;
						red--;
						}
			}
		}
		for (int i = 0; i < arr.length ; i ++ ) {
		System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	
}
