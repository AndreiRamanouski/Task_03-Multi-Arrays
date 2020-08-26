package by.htp.less04.main;

public class Example {
	public static void main(String[] args) {
		int mas[][] = new int [5][5];
	int avSum;
    int avMas = 0;
    for (int i = 0; i < mas.length; i++) {
      avSum = 0;
      for (int j = 0; j < mas[i].length; j++) {
    	  mas [i][j] = (int) (Math.random() * 500);
        avSum = avSum + mas[i][j];
        System.out.printf("[%3d] ", mas[i][j]);
      }
      avMas = avMas + avSum;
      System.out.println(" - " + ((double)avSum / mas[i].length));
    }
    
    System.out.println((double)avMas / (mas.length * mas[0].length));
}
}