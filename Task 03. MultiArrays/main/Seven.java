package by.htp.less04.main;
import java.util.Arrays;

public class Seven {
	public static void main(String[] args) {
		int n = 8 ;
		int [][] array = new int [n][n];
		Array( array , n );
	}
	
	
	public static void Array(int[][] arr, int smth2) {
		int smth = 1 ;
		
		for ( int i = 0 ; i < arr.length ; i ++ ) { 
			for ( int j = 0 ; j < smth2 ; j ++ )
				arr [i][j] = smth;
				smth ++ ; smth2 --;
			
		}
				
		
		for( int j = 0 ; j < arr.length ; j ++ ) {
			System.out.println(Arrays.toString(arr[j]));
			}
	}
}
