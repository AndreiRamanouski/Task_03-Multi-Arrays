package by.htp.less04.main;

import java.util.Arrays;

public class Two {
	public static void main(String[] args) {
		
		int i = 4 ;
		int j = 3 ;
		Mass ( i , j ) ;
		
		
	}
	public static void Mass( int k , int p ) {
		int array [] [] = new int [5] [5] ; 
		
		
		for (int x = 0 ; x < array.length ; x++) {
			for(int w = 0 ; w < array[x].length ; w++) {
				array [x][w] = (int)(Math.random() * 10);	
			}
		}
		for (int x = 0 ; x < array.length ; x ++ ) {
			System.out.println(Arrays.toString(array[x])); 
			}
		System.out.printf("[%2d]" ,array[k][p]);
		
		
		
		
	}
	
}
