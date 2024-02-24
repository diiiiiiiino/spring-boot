package com.dino.springboot.conditional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest("today=on")
public class ConditionalOnTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void whenPropertyOnThenCreateBean(){
        Today today = applicationContext.getBean(Today.class);

        assertThat(today).isNotNull();
    }
}
