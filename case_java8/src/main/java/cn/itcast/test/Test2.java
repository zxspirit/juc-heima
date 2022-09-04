package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j(topic = "c.Test2")
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            log.debug("running");
            return 1;
        });
        new Thread(futureTask,"t1").start();
        System.out.println(futureTask.get());
        log.debug("{}",futureTask.get());
    }
}
