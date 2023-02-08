package Coding.LoveBabbar.Array;

public class Array23MaximumProductSubarray {
    public static void main(String[] args) {
        int [] arr = new int[]{-10,-3,-11,0,29,-2};
        int maxV = arr[0], minV = arr[0], ans = arr[0];
        int swap;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<0) {
                swap = maxV;
                maxV = minV;
                minV = swap;
            }

            maxV = Math.max(arr[i],arr[i]*maxV);
            minV = Math.min(arr[i],arr[i]*minV);

            ans = Math.max(ans,maxV);

            System.out.println(maxV+" "+minV+" "+ans);
        }

        System.out.print(ans);
    }
}
