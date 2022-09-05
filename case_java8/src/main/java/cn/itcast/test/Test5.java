package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test5")
public class Test5 {
    public static void main(String[] args) {
        Thread running = new Thread("t1") {
            @Override
            public void run() {
                log.debug("running");
            }
        };

        System.out.println(running.getState());
        running.start();
        System.out.println(running.getState());

    }
}
