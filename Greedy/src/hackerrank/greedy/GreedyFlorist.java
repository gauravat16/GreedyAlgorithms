package hackerrank.greedy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GreedyFlorist {

	static int getMinimumCost(int n, int k, int[] c) {

		Arrays.sort(c);
		int cost = 0;
		int bought = 0;
		int len = c.length - 1;

		while (len >= 0) {

			for (int i = 0; i < k && len >= 0; i++) {
				cost += (bought + 1) * c[len];
				len--;
			}
			bought++;

		}

		return cost;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line1 = in.nextLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int k = Integer.parseInt(line1[1]);
		int[] c = new int[n];
		String[] data = in.nextLine().split(" ");
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = Integer.parseInt(data[c_i]);
		}
		int minimumCost = getMinimumCost(n, k, c);
		System.out.println(minimumCost);
	}
}
