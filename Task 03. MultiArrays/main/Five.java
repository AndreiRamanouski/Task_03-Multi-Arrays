package by.htp.less04.main;
import java.util.Arrays;

public class Five {
	public static void main(String[] args) {
		int n = 8;
		A(n);
	}
	
	public static void A(int n){
		int [][] arr = new int [n][n];
		Solve(arr);	
	}
	
	
	public static void Solve(int[][] arr){
		int smth2 = arr.length - 1;
		int smth =  1;
		for (int i = 0 ; i < arr.length ; i ++ ) {
			for ( int j = 0 ; j < arr[i].length ; j ++ ) {
				if (j == smth2) {
					arr[i][j] = smth;
					smth2 -- ; smth ++ ;	
				}
			}
	
		}
		Print(arr);	
	}
	
	
	public static void Print(int[][] arr) {
		for (int i = 0 ; i < arr.length ; i ++ ) {
			System.out.println(Arrays.toString(arr[i]));
			}
	}
	
	
}
