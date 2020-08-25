package com.zglu.starter.app;

import com.zglu.starter.common.config.CommonService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author zglu
 */
@Log4j2
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApplicationTests {
    @Autowired
    private CommonService commonService;

    @Test
    void contextLoads() {
        String test = "test";
        Assertions.assertNotNull(test, "test must not be null!");
        log.info(test);
        log.info(commonService.doSomething());
    }

}
