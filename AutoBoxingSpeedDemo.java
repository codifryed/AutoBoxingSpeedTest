public class AutoBoxingSpeedDemo {

	public static void main(String[] args) {
		long startT, endT;
		Long sumw = 0L;
		long sump = 0L;

		System.out.println("First the slow calculation using Wrapper Class: ");
		startT = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sumw += i;
		}
		endT = System.currentTimeMillis();
		System.out.println("result all int: " + sumw);
		System.out.println(endT - startT + " ms");
		//
		System.out.println();
		System.out.println();
		System.out.println("Now the fast calcution using Primative Data Type: ");
		startT = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sump += i;
		}
		endT = System.currentTimeMillis();
		System.out.println(sump);
		System.out.println(endT - startT + " ms");
	}

}
