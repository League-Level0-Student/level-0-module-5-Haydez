
public class Gauntlet2 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int a = 0; a < 4; a++) {
				System.out.println(i + " " + a);
			}
		}

		for (int p = 1; p < 8; p += 3) {
			for (int u = 0; u < 3; u++) {

				System.out.print(p + u + " ");

			}
			System.out.print("\n");
		}

		for (int k = 0; k < 101; k += 10) {
			for (int g = 1; g < 11; g++) {

				System.out.print(k + g + " ");
			}
			System.out.print("\n");
		}

		for (int l = 1; l < 7; l++) {
			for (int m = 0; m < l; m++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		
			for (int s = 100; s > 0 ;s--) {
				System.out.println(s+"   ");
			}
		
	}
}
