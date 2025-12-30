package Projects.data;

public class StackOfIntegers {
    private int[] elements;
    private int top = -1;
    private int capacity;

    public StackOfIntegers(int size) {
        capacity = size;
        elements = new int[capacity];
    }

    public void push(int value) {
        top++;
        elements[top] = value;
    }
    public void pop() {
        elements[top] = 0;
        top--;
    }
    public int peek() {
        return elements[top];
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if (top == capacity-1) {
            return true;
        }
        return false;
    }
    public int size() {
        return top+1;
    }
    public void clear() {
        for (int i = 0; i < elements.length; i++){
            elements[i] = 0;
        }
        top = -1;
    }
    public int search(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }
    public void print() {
        for (int i = 0; i < top; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}