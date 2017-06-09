package hackerrank.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by 1287930 on 6/9/2017.
 */
public class MaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        int k = Integer.parseInt(in.nextLine().trim());
        ArrayList<Integer> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            data.add(Integer.parseInt(in.nextLine().trim()));
        }

        Collections.sort(data);


        int faireness = Integer.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            int j = i + k - 1;
            int tempval;
            if (j > data.size() - 1) {
                j = j -data.size() ;
                tempval = data.get(i) - data.get(j);

            } else {
                tempval = data.get(j) - data.get(i);

            }
            System.out.println("from " + data.get(i) + " " + data.get(j)+" "+tempval);
            if (tempval < faireness) {
                faireness = tempval;

            }

        }

        System.out.println(faireness);


    }


}
