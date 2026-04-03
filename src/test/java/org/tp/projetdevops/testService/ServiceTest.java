package org.tp.projetdevops.testService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.tp.projetdevops.service.MainService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {
    private MainService mainService;

    @BeforeEach
    void init(){
        mainService = new MainService();
    }

    @Test
    void sayHello(){
        String result = mainService.sayHelloWorld();

        assertThat( result).isEqualTo( "Hello world");
    }
}
