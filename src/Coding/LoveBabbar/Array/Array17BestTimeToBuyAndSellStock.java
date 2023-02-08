package Coding.LoveBabbar.Array;

public class Array17BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] arr =  new int[]{9,8,7,4,20,3,12,16,30}; //7,6,5,4,3,2,1,10

        int buy = arr[0], ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buy > arr[i])
                buy = arr[i];

            if (arr[i]-buy > ans)
                ans = arr[i]-buy;
        }

        System.out.println(ans);
    }
}
