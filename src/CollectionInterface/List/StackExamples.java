package CollectionInterface.List;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        List<String> list = new Stack<>();
        list.add("as");
        list.add("io");
        list.add("an");
        list.add("le");
        list.add("as");
        list.add(1, "12");

        System.out.print(list);

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(33);
        stack.push(74);
        stack.add(1, 20);
        System.out.println(stack.search(3));
        System.out.println(stack.search(7));
        System.out.println(stack.search(89));
        System.out.println(stack.search(33));
        System.out.println(stack.search(74));
        System.out.println("");

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.println(stack.pop());
    }
}
