package Coding.Other;

public class RearrangeAnArraySuchThatArrOfiIsEqualsToi {
    public static void main(String[] args) {
        int [] arr = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        // {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
        //      11, 10, 9, 5, 13, 16, 2, 14, 17, 4}

        int l = arr.length, num = 0;

        for (int i = 0; i < l; i++) {
            if (arr[i]==-1)
                continue;

            num = arr[i]%l;

            if (num==i) {
                arr[i]=arr[i]+l;
                continue;
            }

            if (arr[num]!=-1) {
                arr[num]=arr[num]+l;
            } else {
                arr[num]=arr[num]+1 + num+l;
            }
        }

        for (int i = 0; i < l; i++) {
            if (arr[i]<l)
                arr[i]=-1;
            else
                arr[i]=i;
        }

        for (int j = 0; j < l; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
