package p3;

public class P3_main {
	public static void main(String[] args) {
		int[][] matrix= { {1,2,3}, {4,5,6}, {7,8,9}};
		
		for (int i=0; i<matrix.length; i++) {    //Iteriert durch die Zeilen
			for (int j=0; j<matrix[i].length;j++) { //Iteriert durch die Spalten
				matrix[i][j]=matrix[i][j]+1;
				System.out.print(matrix[i][j]+ " ");
			} 
			System.out.println();
		}
		
		int Summe=10;
		Summe=0;
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				Summe=Summe+matrix[i][j];
			}
		}System.out.println("Die Summe ist "+Summe);
		
		
		int[][] B = new int[matrix.length][matrix[0].length];
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				B[j][2-i]=matrix[i][j];
			}
		} //System.out.println nochmal extra 
		
	}

}
