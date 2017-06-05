package hackerrank.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = Integer.parseInt(in.nextLine().trim());
		String[] data = in.nextLine().trim().split(" ");
		int[] intArr = new int[len];
		
		for(int i=0;i<data.length;i++){
			intArr[i] = Integer.parseInt(data[i]);
		}
		
		Arrays.sort(intArr);
		
		int min=Integer.MAX_VALUE;

		for(int i=0;i<intArr.length-1;i++){
			
			if(Math.abs(intArr[i]-intArr[i+1])<min){
				min = Math.abs(intArr[i]-intArr[i+1]);
				
			}
		}
		
		System.out.println(min);
	
	}

}
