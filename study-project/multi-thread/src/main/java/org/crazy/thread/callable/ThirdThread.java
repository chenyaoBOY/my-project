package org.crazy.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 */
public class ThirdThread implements Callable<String>{

    @Override
    public String call() throws Exception {
        return null;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> call = () -> {
            int count = 1;
            System.out.println(123);
            return count;
        };
        FutureTask<Integer> future = new FutureTask<>(call);
        new Thread(future).start();
        System.out.println("获取线程返回值");
        Integer s = future.get();
        System.out.println(s);

    }


}
