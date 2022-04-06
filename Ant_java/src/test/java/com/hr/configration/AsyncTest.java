package com.hr.configration;


import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author
 * @since 2018/10/11
 */
@Component
@EnableAsync
public class AsyncTest {

    @Async
    public void test1() {

        System.out.println("异步执行test1！！！");
        System.out.println("线程id：" + Thread.currentThread().getId());
        System.out.println("线程名称：" + Thread.currentThread().getName());

    }

    @Async
    public void test2() {

        System.out.println("异步执行test2！！！");
        System.out.println("线程id：" + Thread.currentThread().getId());
        System.out.println("线程名称：" + Thread.currentThread().getName());
    }

    @Async
    public void test3() {

        System.out.println("异步执行test3！！！");
        System.out.println("线程id：" + Thread.currentThread().getId());
        System.out.println("线程名称：" + Thread.currentThread().getName());
    }
}
