package h2;

public class H2_main {
	public static void main(String[] args) {
		int n=576565, digits=10;
		int[] a= new int[9];
		
		String s= String.valueOf(n);
		digits=s.length();
		
		System.out.println(digits);
		
		for (int x=0; x<9;x++) {
			a[x]=0;
		}
		
		for (int i=8; i>8-digits; i--) {
			a[i]=n%10;
			n=n/10;
		}
		
		for (int j=0; j<9; j++) {
			System.out.print(a[j]+" ");
		} System.out.println();
	}
}
