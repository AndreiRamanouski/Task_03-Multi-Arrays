package by.htp.less04.main;
import java.util.Arrays;
public class one {
	public static void main(String[] args) {
		int x = 5;
		Matrix(x);
		
	}
		
	public static int Matrix( int n) {
		
		
		int array [][] = new int [n][n];
		
		
		for (int x = 0 ; x < array.length ; x++) {
			for(int w = 0 ; w < array[x].length ; w++) {
				array [x][w] = (int)(Math.random() * 10);	
			}
		}
		for (int x = 0 ; x < array.length ; x ++ ) {
		System.out.print(Arrays.toString(array[x]) + "\n"); 
		}
		System.out.println();
		for (int x = 0 ; x < array.length ; x++) {
			for(int w = 0 ;  w < array[x].length ; w++) {
				if (x == w) {
					System.out.printf("[%1d]" ,array[x][w]);
				}
				}
			}
		return n;
	}
}

