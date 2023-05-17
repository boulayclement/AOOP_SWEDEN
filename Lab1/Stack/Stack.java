package Lab1.Stack;
import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(int e) {
        elements.add(e);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = elements.size() - 1;
        int topElement = elements.get(lastIndex);
        elements.remove(lastIndex);
        return topElement;
    }

    public void push(int n, int[] arr) {
        for (int i = n - 1; i >= 0; i--) {
            elements.add(arr[i]);
        }
    }

    public List<Integer> pop(int n) {
        if (n > size()) {
            throw new IllegalStateException("Not enough elements in the stack");
        }
        List<Integer> poppedElements = new ArrayList<>();
        int lastIndex = elements.size() - 1;
        for (int i = 0; i < n; i++) {
            int topElement = elements.get(lastIndex - i);
            poppedElements.add(topElement);
        }
        elements.subList(lastIndex - n + 1, lastIndex + 1).clear();
        return poppedElements;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
