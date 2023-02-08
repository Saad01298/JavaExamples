package Coding.Other;

import java.util.*;

public class ArrangeGivenNumbersToFormTheBiggestNumber {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 34, 3, 98, 9, 76, 45, 4};
        int x,temp;

        // Done in the worst time complexity

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                String s1=String.valueOf(arr[j]), s2=String.valueOf(arr[j+1]);
                String n="",m="";

                n=s1+s2;
                m=s2+s1;
                x=0;

                for (int k = 0; k < n.length(); k++) {
                    if (n.charAt(k)<m.charAt(k)) {
                        x = 1;
                        break;
                    } else if (n.charAt(k)>m.charAt(k)) {
                        x = 0;
                        break;
                    }
                }

                if (x==1) {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.print("\n");



        // Below is the best complexity solution

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 34, 3, 98, 9, 76, 45, 4));

        Collections.sort(arrayList, new Comparator<Integer>(){

            @Override
            public int compare(Integer x, Integer y)
            {
                int xy = x;
                int yx = y;

                // Count length of x and y
                int countx = 0;
                int county = 0;

                // Count length of X
                while (x > 0) {
                countx++;
                x /= 10;
                }

                // Count length of Y
                while (y > 0) {
                  county++;
                  y /= 10;
                }

                x = xy;
                y = yx;

                while (countx > 0)
                {
                  countx--;
                  yx *= 10;
                }

                while (county > 0)
                {
                 county--;
                  xy *= 10;
                }

                // Append x to y
                yx += x;

                // Append y to x
                xy += y;

                return -xy + yx;
            }
        });

        arrayList.stream().forEach(System.out::print);

    }
}


