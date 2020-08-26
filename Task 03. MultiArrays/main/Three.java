package by.htp.less04.main;
public class Three {
	public static void main(String[] args) {
		int m = 3;
		int x = 3;
		int n = 3;
		int array [][][] = new int [m][x][n];
		
		for ( int q = 0 ; q < array.length ; q ++) {
			System.out.println();
			for ( int w = 0 ; w < array[q].length ; w ++) {
				System.out.print(" ");
				for ( int e = 0 ; e < array[q][w].length ; e ++) {
				array [q][w][e] = (int) (Math.random() * 10 );	
				System.out.printf("[%1d]", array[q][w][e]);	
				}
			}
		}
		System.out.println();
		
		for ( int q = array.length -1 ; q > -1 ; q --) {
		System.out.println();
			for ( int w = 0 ; w < array[q].length ; w ++) {
			System.out.print(" ");
				for ( int e = array.length -1 ; e > -1 ; e --) {
				System.out.printf("[%1d]", array[q][w][e]);	
				}
			}
		}
	}
}
