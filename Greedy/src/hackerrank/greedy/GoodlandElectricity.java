package hackerrank.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodlandElectricity {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String l1 = in.nextLine();
		int n = Integer.parseInt(l1.split(" ")[0]);
		int k = Integer.parseInt(l1.split(" ")[1]);

		String[] l2 = in.nextLine().split(" ");
		int[] cities = new int[l2.length];

		for (int i = 0; i < l2.length; i++) {
			cities[i] = Integer.parseInt(l2[i]);
		}
		
		int i=0;
		int TowerToReach =k-1;
		int res=0;
		
		while(true){
			int nextTower=-1;
			while(i<=TowerToReach && i<n){
				if(cities[i]==1){
					nextTower=i;
				}
				i++;
			}
			
			if(nextTower==-1){
				System.out.println("-1");
				return;
			}
			res++;
			i = nextTower+1;
			TowerToReach = nextTower + (2*k) -1;
			if(nextTower+k>=n){
				break;
				
			}
			
		}
		
		System.out.println(res);

	}

}
