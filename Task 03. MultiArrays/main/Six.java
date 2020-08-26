package by.htp.less04.main;
import java.util.Arrays;

public class Six {
	public static void main(String[] args) {
		int n = 7;
		Array( n, n);
		}


	public static void Array(int x, int y) {
		int[][] arr = new int [x][y];
		
		for ( int i = 0 ; i < arr.length ; i ++) {
			for( int j = 0 ; j < arr.length ; j ++ ) {
				if ( i == 0 || i == (arr.length - 1) ) {
					arr[i][j] = 1 ;
				}
				if ( j == 0 || j == (arr.length - 1) ) {
					arr[i][j] = 1 ;
				}
			}
		}
		
		for( int j = 0 ; j < arr.length ; j ++ ) {
		System.out.println(Arrays.toString(arr[j]));
		}
	}
}
