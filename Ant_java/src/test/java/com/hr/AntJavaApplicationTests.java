package com.hr;

import com.hr.configration.AsyncTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AntJavaApplicationTests  {

    @Autowired
    private AsyncTest asyncTest;

    /**
     * spring线程池单元测试
     */
    @Test
    public void testThreadPool() {

        System.out.println("主线程id：" + Thread.currentThread().getId());
        System.out.println("主线程名称：" + Thread.currentThread().getName());
        asyncTest.test1();
        asyncTest.test2();
        asyncTest.test3();

    }

}
