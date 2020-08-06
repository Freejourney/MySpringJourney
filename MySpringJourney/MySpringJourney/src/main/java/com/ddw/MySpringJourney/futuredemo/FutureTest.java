package com.ddw.MySpringJourney.futuredemo;

import java.util.concurrent.*;

public class FutureTest {

    public void test() throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new Handle("handname"));
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(futureTask);

        System.out.printf("请求完毕\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        System.out.println("数据 = " + futureTask.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new FutureTest().test();
    }

    public class Handle implements Callable<String> {

        private String name;

        public Handle(String name) {
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            return "content";
        }
    }
}
