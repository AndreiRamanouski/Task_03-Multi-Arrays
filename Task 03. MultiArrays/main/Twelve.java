package by.htp.less04.main;

public class Twelve {
	public static void main(String[] args) {
		
		int m = 15 ;
		int n = 15 ;
		int [][] arr = Array(m,n);
		arr = Solution(arr);
		PrintArr(arr);
		
	}
		public static int [][] Array(int m, int n) {
			int [][] arr = new int [m][n] ;
			return arr;
		}
		
		public static int [][] Solution(int [][] arr) {
		
			for ( int i = 0 ; i < arr.length ; i ++ ) {
				for (int j = arr[i].length - 1 ; j > i ; j -- ) {
					arr [i][j] = 1 ;
				}
			}
			return arr;
		}
		
		
		public static void PrintArr(int [][] arr) {
			for ( int i = 0 ; i < arr.length ; i ++ ) {
				for (int j = 0; j < arr.length ; j ++ ) {
					System.out.printf("[%2d]", arr[i][j]);
				}
			System.out.println();
			
		}
		
	}
}
