package com.example.githubactions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GithubActionsApplicationTests {

    @Test
    void test() {
        // given
        int num = 1;
        // when

        // then
        assertThat(num).isEqualTo(1);
    }

}
