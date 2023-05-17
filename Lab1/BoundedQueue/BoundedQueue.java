package Lab1.BoundedQueue;

public class BoundedQueue<T> {
    private Object[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public BoundedQueue(int capacity) {
        assert capacity > 0 : "Capacity must be greater than 0";
        this.elements = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }

    public void enqueue(T item) {
        assert item != null : "Item cannot be null";
        assert size < capacity : "Queue is full";

        rear = (rear + 1) % capacity;
        elements[rear] = item;
        size++;
    }

    public T dequeue() {
        assert !isEmpty() : "Queue is empty";

        T item = (T) elements[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public T peek() {
        assert !isEmpty() : "Queue is empty";

        return (T) elements[front];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void growArray() {
        int newCapacity = capacity * 2;
        Object[] newElements = new Object[newCapacity];
        int index = 0;
        for (int i = front; i <= rear; i = (i + 1) % capacity) {
            newElements[index++] = elements[i];
        }
        elements = newElements;
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
    }
}