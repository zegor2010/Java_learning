package Test;

import Projects.StopWatch;

public class StopwatchTest {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
