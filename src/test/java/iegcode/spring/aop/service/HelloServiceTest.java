package iegcode.spring.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Gibran", helloService.hello("Gibran"));
        Assertions.assertEquals("bye Gibran", helloService.bye("Gibran"));

        helloService.test();
    }
}
