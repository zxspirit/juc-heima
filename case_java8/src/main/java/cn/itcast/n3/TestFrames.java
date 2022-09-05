package cn.itcast.n3;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.TestFrames")
public class TestFrames {
    public static void main(String[] args) {
        new Thread(() ->
                method1(20), "t1").start();

        method1(10);
    }

    private static void method1(int i) {
        int y = i + 1;
        Object m = newthod2();
        System.out.println(m);
    }

    private static Object newthod2() {
        Object o = new Object();
        return o;
    }
}
