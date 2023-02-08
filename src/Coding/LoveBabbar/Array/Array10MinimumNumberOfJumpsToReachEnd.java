package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array10MinimumNumberOfJumpsToReachEnd {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =
                new ArrayList<>(List.of(3, 1, 5, 8, 9, 2, 6, 7, 6, 8, 9));

        if (arrayList.size()<=1)
            System.out.println(0);

        if (arrayList.get(0)==0)
            System.out.println(-1);

        int maxReach = arrayList.get(0), step = arrayList.get(0), jump = 1, flag=1;

        for (int i = 1; i < arrayList.size(); i++) {
            if (i==arrayList.size()-1) {
                System.out.println(jump);
                flag=0;
                break;
            }

            maxReach = Math.max(maxReach, i + arrayList.get(i));
            step--;


            if (step==0) {
                jump++;

                if (i>=maxReach)
                    break;

                step=maxReach-i;
            }
        }

        if (flag==1)
            System.out.println(-1);
    }
}
