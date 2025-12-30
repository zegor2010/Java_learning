package Test.Data;

import Projects.data.QueueOfIntegers;


public class QueueOfIntegersTest {
    public static void main(String[] args) {
        QueueOfIntegers queueOfIntegers = new QueueOfIntegers(20);
        System.out.println(queueOfIntegers.isEmpty());
        queueOfIntegers.push(5);
        queueOfIntegers.push(6);
        queueOfIntegers.push(7);
        queueOfIntegers.push(8);
        queueOfIntegers.print();
        queueOfIntegers.pop();
        queueOfIntegers.peek();
        queueOfIntegers.print();
        System.out.println(queueOfIntegers.isEmpty());
        System.out.println(queueOfIntegers.isFull());
        System.out.println(queueOfIntegers.size());
        System.out.println(queueOfIntegers.contains(5));
        queueOfIntegers.clear();
        queueOfIntegers.search(5);
        System.out.println(queueOfIntegers.contains(5));
        queueOfIntegers.print();
    }
}
