package hackerrank.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class CuttingBoards {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long queries = Integer.parseInt(in.nextLine().trim());
		for (long i = 1; i <= queries; i++) {
			String[] mn = in.nextLine().split(" ");
			int m = Integer.parseInt(mn[0]);
			int n = Integer.parseInt(mn[1]);
			long[] x = new long[m - 1];
			long[] y = new long[n - 1];

			String[] line1 = in.nextLine().split(" ");
			String[] line2 = in.nextLine().split(" ");

			for (int l = 0; l < line1.length; l++) {
				x[l] = Integer.parseInt(line1[l]);
			}

			for (int l = 0; l < line2.length; l++) {
				y[l] = Integer.parseInt(line2[l]);
			}

			Arrays.sort(x);
			Arrays.sort(y);

			int j = m - 2;
			int k = n - 2;
			long cost = 0;
			long xcuts = 1;
			long ycuts = 1;

			while (j >= 0 && k >= 0) {

				if (x[j] > y[k]) {

					cost += (ycuts * x[j]) % 1000000007;
					xcuts++;
					j--;

				} else {

					cost += (xcuts * y[k]) % 1000000007;
					ycuts++;
					k--;

				}

			}

			while (j >= 0) {
				cost += (ycuts * x[j]) % 1000000007;
				j--;
			}

			while (k >= 0) {
				cost += (xcuts * y[k]) % 1000000007;
				k--;
			}

			System.out.println(cost%1000000007);

		}

	}

}
