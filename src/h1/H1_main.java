package h1;

public class H1_main {
	public static void main(String[] args) {
		int[]myArray= {5,6,7,8,9};
		
		int[]backwardArray= new int[myArray.length];
		for (int i=0; i<myArray.length; i++) {
			backwardArray[i]=myArray[myArray.length-1-i];  //man muss ja darauf achten, dass die Initialisierung bei Null startet 
		}
		
		myArray=backwardArray;
				
		for (int j=0;j<myArray.length;j++) {
			System.out.print(myArray[j]+" ");
		}System.out.println();
		
	}

}
