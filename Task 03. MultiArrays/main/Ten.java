package by.htp.less04.main;

public class Ten {
	public static void main(String[] args) {
		int [][] arr = new int [6][6];
		Solution(arr);
		
		
		
	}
	public static void Solution(int [][] arr ){	
		
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			for ( int j = 0 ; j < arr.length ; j ++ ) {
				arr[i][j] = (int) (Math.random() * 10000);	
				System.out.printf("[%5d]", arr[i][j]);
			}
			if (arr[i][i] % 2 == 0) {
				System.out.print(" - " + arr[i][i] + ": " + i + "|" + i);
			}
			System.out.println();
		}
	}
}

