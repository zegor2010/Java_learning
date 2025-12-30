package Test.Data;

import Projects.data.List;

public class listTest {
    public static void main() {
        List list = new List(10);
        list.add(1);
        list.add(2, 1);
        list.add(5, 2);
        list.add(9, 3);
        list.add(6, 4);
        list.add(10, 5);
        list.add(12, 6);
        list.add(18, 7);
        list.add(1, 8);
        list.add(8, 9);
        list.get(5);
        list.indexOf(6);
        list.set(3, 6);
        list.remove(5);
        list.remove(6);
        list.lastIndexOf(8);
        list.isEmpty();
        list.clear();
        list.isEmpty();
    }
}
