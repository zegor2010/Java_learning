package Test.Data;

import Projects.data.StackOfIntegers;

public class StackOfIntegersTest {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers(20);
        stackOfIntegers.push(5);
        stackOfIntegers.push(6);
        stackOfIntegers.push(7);
        stackOfIntegers.push(8);
        stackOfIntegers.pop();
        stackOfIntegers.peek();
        System.out.println(stackOfIntegers.isEmpty());
        System.out.println(stackOfIntegers.isFull());
        System.out.println(stackOfIntegers.size());
        //stackOfIntegers.clear();
        System.out.println(stackOfIntegers.search(5));
        System.out.println(stackOfIntegers.contains(5));
        stackOfIntegers.print();
    }
}
