package com.dino.springboot.conditional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


@SpringBootTest
public class ConditionalOffTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void whenPropertyOffThenNotCreateBean(){
        assertThatThrownBy(() -> applicationContext.getBean(Today.class))
                .isInstanceOf(NoSuchBeanDefinitionException.class);
    }
}
