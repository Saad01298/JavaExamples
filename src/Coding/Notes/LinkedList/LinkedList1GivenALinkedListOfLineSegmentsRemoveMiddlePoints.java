package Coding.Notes.LinkedList;

import java.util.LinkedList;

class point {
    int a,b;

    public point(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class LinkedList1GivenALinkedListOfLineSegmentsRemoveMiddlePoints {
    public static void main(String[] args) {
        LinkedList<point> linkedList = new LinkedList<>();
        linkedList.add(new point(0,10));
        linkedList.add(new point(1,10));
        linkedList.add(new point(5,10));
        linkedList.add(new point(7,10));
        linkedList.add(new point(7,5));
        linkedList.add(new point(20,5));
        linkedList.add(new point(40,5));

        int x = 0, y = 0;

        for (int i = 0; i < linkedList.size()-2; i++) {
            if (linkedList.get(i).a==linkedList.get(i+1).a && linkedList.get(i).a==linkedList.get(i+2).a) {
                linkedList.remove(i+1);
                i--;
            } else if (linkedList.get(i).b==linkedList.get(i+1).b && linkedList.get(i).b==linkedList.get(i+2).b) {
                linkedList.remove(i+1);
                i--;
            }
        }

        linkedList.forEach(k->System.out.println(k.a + ", " + k.b));
    }
}
