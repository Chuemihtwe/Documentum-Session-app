package com.example.sample_dfc;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleDfcApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(SampleDfcApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test log message");
    }

}
