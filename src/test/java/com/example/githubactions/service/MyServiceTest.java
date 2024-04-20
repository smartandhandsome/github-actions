package com.example.githubactions.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatCode;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {

    @InjectMocks
    MyService myService;

    @Test
    void test() {
        // given

        // when

        // then
        assertThatCode(() -> myService.service())
                .doesNotThrowAnyException();
    }
}
