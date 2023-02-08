package Coding.Notes.Stack;

import java.util.Stack;

public class Stack5NextGreaterElementForEveryElementInGivenArray {
    public static void main(String[] args) {
        int [] arr = new int[] {3,2,1,15,12,10,7,25,26,13};
        Stack<Integer> stack = new Stack<>();
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                while (true) {
                    if (stack.isEmpty() || stack.peek() >= arr[i]) {
                        break;
                    } else {
                        System.out.println("Next greater for " + stack.pop() + " is " + arr[i]);
                    }

                    if (i==arr.length-1) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 1) {
                    break;
                }

                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println("Next greater for " + stack.pop() + " is " + -1);
        }
    }
}
