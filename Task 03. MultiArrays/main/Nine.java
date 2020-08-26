package by.htp.less04.main;

public class Nine {
	public static void main(String[] args) {
 //  xn = x1 + ( n - 1 ) d; 
		int n = 4 ;
		
		Array(n);
	}
		public static void Array(int n){
		int[][] arr = new int [n][n];
		int x = 2 ; 
		int d = 2 ; 
		int pow = 1;
		int smth = x;
		
		for (int i = 0 ; i < arr.length ; i ++ ) {
			for ( int j = 0 ; j < arr[i].length ; j ++ ) {
				
			arr[i][j] = (int) Math.pow(smth, pow);
			smth+=d;
			
			}
			smth = x ; pow ++ ; 
		}
		
		for (int i = 0 ; i < arr.length ; i ++ ) {
			for ( int j = 0 ; j < arr[i].length ; j ++ ) { 
				System.out.printf("[%5d]" , arr[i][j]);
			}
			System.out.println();
		}		
	}
		
		
		
		}

