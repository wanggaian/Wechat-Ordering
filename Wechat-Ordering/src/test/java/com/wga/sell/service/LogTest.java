package com.wga.sell.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * LogTest
 *
 * @Author wanggaian
 * @Date 2019/7/11 23:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logTest() {
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
        String user = "admin";
        String password = "123";
        logger.info("user{}, password{}", user, password);
    }
}
