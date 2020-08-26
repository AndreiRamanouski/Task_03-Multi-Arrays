package by.htp.less04.main;
import java.util.Arrays;

public class Eight {
	public static void main(String[] args) {
		
		int n = 6 ;
		int [][] arr = new int [n][n];
		Array (arr);
		
	}
		
		public static void Array(int [][] arr) {
		int smth = arr.length - 1 ;
		int smth2 = arr.length;
		
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			for ( int j = smth ; j >= 0  ; j -- ) {
					arr[i][j] = smth2;
					 smth2 --;	
			}
			smth2 = arr.length; 
			smth -- ;
		}
			
		for (int i = 0 ; i < arr.length ; i ++ ) {
		System.out.println(Arrays.toString(arr[i]));
		}
	}
}
