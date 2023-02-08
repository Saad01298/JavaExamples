package Coding.Other;

public class ElementInASortedAndRotatedArray {
    public static void main(String[] args) {
        int [] arr = new int [] {8,9,10,1,2,3,4,5,6,7};
        int l = 0, r = arr.length-1, m = (l+r)/2, p = r;
        int num = 3, ans = -1;

        // Finding pivot
        while(l<r) {
            //System.out.print(m+" ");
            if (arr[m]>arr[m+1]) {
                p=m;
                break;
            }

            if (arr[m]>arr[r]) {
                l=m;
                m=(l+r)/2;
            } else {
                r=m;
                m=(l+r)/2;
            }
        }

        System.out.println("Pivot Index: "+p); // This will also give Rotation Count in Rotated Sorted array

        // Pivot breaks main array into 2 sorted arrays. So applying BS on both sub arrays
        if (num>=arr[0] && num<=arr[p]) {
            l=0;
            r=p;
            m=(l+r)/2;

            while(l<=r) {
                if (num == arr[m]) {
                    ans = m;
                    break;
                } else if (num > arr[m]) {
                    l=m+1;
                    m=(l+r)/2;
                } else {
                    r=m-1;
                    m=(l+r)/2;
                }
            }
        }

        else {
            l=p+1;
            r=arr.length-1;
            m=(l+r)/2;

            while(l<=r) {
                if (num == arr[m]) {
                    ans = m;
                    break;
                } else if (num > arr[m]) {
                    l=m+1;
                    m=(l+r)/2;
                } else {
                    r=m-1;
                    m=(l+r)/2;
                }
            }
        }

        System.out.print("Index of "+ num + " is: "+ans);

    }
}
