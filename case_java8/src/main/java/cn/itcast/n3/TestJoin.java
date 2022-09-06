package cn.itcast.n3;

import lombok.extern.slf4j.Slf4j;

import static cn.itcast.n2.util.Sleeper.sleep;

@Slf4j(topic = "c.TestJoin")
public class TestJoin {
    static int r1 = 0;
    static int r2 = 0;

    public static void main(String[] args) throws InterruptedException {
        test3();

    }

    private static void test3() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            sleep(2);
            r1 = 10;
        });
        long start = System.currentTimeMillis();
        t1.start();
        log.debug("join begin");
        t1.join(1500);
        long end = System.currentTimeMillis();
        log.debug("r1:{} r2:{} cost:{} ",r1,r2,end-start);
    }

    private static void test2() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            sleep(1);
            r1 = 10;
        });
        Thread t2 = new Thread(() -> {
            sleep(2);
            r2 = 20;
        });

        long start =System.currentTimeMillis();
        t1.start();
        t2.start();
        log.debug("join start");
        t2.join();
        log.debug("t2 join end");
        t1.join();
        log.debug("t1 join end ");
        long end = System.currentTimeMillis();
        log.debug("r1;{} r2:{} cost:{}",r1,r2,end-start);




    }
}
