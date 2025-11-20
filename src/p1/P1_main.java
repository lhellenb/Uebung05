package p1;

public class P1_main {
	public static void main(String[] args) {
		
		int x=0;
		while (x<=10) {
			x=x+1;
			System.out.println(x);
		}
		
		

		for (int y=1;y<=11;y++) {      //hier wird erst System.out.println ausgeführt und danach um 1 erhöht
			System.out.println(y);
		}
		
		
		int z=0;
		do {
			z=z+1;
			System.out.println(z);
		}while (z<= 10);
		
	}
		

}
