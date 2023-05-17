package Lab3;

import java.util.List;
import java.util.ArrayList;

@Element(name = "node")
public class Tree<T> {
    private List<Tree<T>> children = new ArrayList<>();
    private T value;

    public Tree(T v, List<Tree<T>> trees) {
        children = trees;
        value = v;
    }

    public Tree(T v) {
        value = v;
    }

    @SubElements(name = "subnodes")
    public List<Tree<T>> getChildren() {
        return children;
    }

    @ElementField(name = "value")
    public T getValue() {
        return value;
    }
}