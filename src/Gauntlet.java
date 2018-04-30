
public class Gauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int a = 100; a > -1; a--) {
			System.out.println(a);
		}

		for (int e = 2; e < 101; e += 2) {
			System.out.println(e);
		}

		for (int o = 1; o < 101; o += 2) {
			System.out.println(o);
		}

		for (int u = 0; u < 501; u++) {
			if (u % 2 == 0)
				System.out.println(u + " is even ");
			else {
				System.out.println(u + " is odd ");
			}
		}

		for (int k = 7; k < 778; k += 7) {
			System.out.println(k);
		}

		for (int l = 2002; l < 2019; l++) {

			System.out.println(l + " i was " + (l - 2002));
		}

	}

}
