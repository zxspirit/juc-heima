package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test7")
public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        Thread sleep = new Thread("t1") {
            @Override
            public void run() {
                log.debug("sleep");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    log.debug("wake up");
                    e.printStackTrace();
                }
            }
        };
        sleep.start();

       Thread.sleep(1000);
       log.debug("interrupt_____");
       sleep.interrupt();

    }
}
