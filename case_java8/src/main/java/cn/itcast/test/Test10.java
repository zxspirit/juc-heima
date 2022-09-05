package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import static cn.itcast.n2.util.Sleeper.sleep;


@Slf4j(topic = "c.Test10")
public class Test10 {
    static int aaa =0;
    public static void main(String[] args) throws InterruptedException {
        test1();


    }

    private static void test1() throws InterruptedException {
        log.debug("开始");
        Thread thread = new Thread(() -> {
            log.debug("start");
            sleep(1);
            log.debug("end");
            aaa =10;
        }, "t1");

        thread.start();
        thread.join();
        log.debug("result is "+ aaa);
        log.debug("结束");
    }
}
