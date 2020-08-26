package by.htp.less04.main;

public class Eleven {
	public static void main(String[] args) {
	
		int [][] array = new int [10][20];
		
		Array(array);
	}
	
	
	public static void Array(int[][] arr){
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			int counter = 0 ;
			for ( int j = 0 ; j < arr[i].length ; j ++ ) {
				arr[i][j] = (int) (Math.random() * 15);
				System.out.printf("[%2d]", arr[i][j]);
				if (arr[i][j] == 0 ) {
					continue;
				}
				else if ( arr[i][j] % 5 == 0) {
					counter ++;
				}
				
			}
			if ( counter >= 3 ) {
				System.out.print("  - This one. String number: " + i);
			}
			
			System.out.println();
			
		}
		
		
	}
}
