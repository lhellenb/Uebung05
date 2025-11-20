package p2;

public class P2_main {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		int max=10, minIndex=5;
		
		max=numbers[0];
		minIndex=0;
		
		for (int x=0; x<numbers.length; x++) {
			if (numbers[x]>x) {
				x=x+1;
				max= numbers[x];
				minIndex=x;
			}
		}
		System.out.println(max);
		System.out.println(minIndex);
	}	

}
