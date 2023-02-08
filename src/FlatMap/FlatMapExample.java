package FlatMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class A {
    int id;
    String des;
    List<String> list;

    public A(int id, String des, List<String> list) {
        this.id = id;
        this.des = des;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

public class FlatMapExample {
    public static void main(String[] args) {

        List<A> list = new ArrayList<>();
        list.add(new A(1,"order 1", List.of("qw", "er", "ty", "e")));
        list.add(new A(2,"order 2", List.of("ur", "er", "s", "e")));
        list.add(new A(3,"order 3", List.of("oo", "ty")));
        list.add(new A(4, "order 4", List.of("as", "oo", "qw")));

        System.out.println("\nCheck it");
        list.stream().map(l->l.getList()).flatMap(Collection::stream).filter(l->l.length()>1).forEach(k->System.out.print(k+" "));


        List<String> listF = list.stream()
                .map(a -> a.getList())
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.print("\n");
        listF.stream().forEach(k->System.out.print(k+" "));
    }
}
