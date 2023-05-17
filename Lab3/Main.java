package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tree<String>> childNodes = new ArrayList<>();
        childNodes.add(new Tree<>("sub1"));
        childNodes.add(new Tree<>("sub2"));

        Tree<String> t = new Tree<>("top", childNodes);
        Saver s = new Saver();
        String r = s.save(t);
        System.out.println(r);
    }
}