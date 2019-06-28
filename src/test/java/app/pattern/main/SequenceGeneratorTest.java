package app.pattern.main;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Lee Tae Su on 2019-04-29.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SequenceGeneratorTest {

    @Autowired
    private PrefixGeneratorFactoryByMap prefixGeneratorFactoryByMap;

    @Autowired
    private PrefixGeneratorFactoryByFactory prefixGeneratorFactoryByFactory;

    @Test
    public void Map을_이용한_팩토리() {
        SequenceGenerator string = new SequenceGenerator(this.prefixGeneratorFactoryByMap.get("stringPrefix"));
        log.info(string.generate());
        log.info(string.generate());
        log.info(string.generate());


        SequenceGenerator date = new SequenceGenerator(this.prefixGeneratorFactoryByMap.get("datePrefix"));
        log.info(date.generate());
        log.info(date.generate());
        log.info(date.generate());
    }

    @Test
    public void 기존_factory를_이용한_팩토리() {
        SequenceGenerator string = new SequenceGenerator(this.prefixGeneratorFactoryByFactory.get("stringPrefix"));
        log.info(string.generate());
        log.info(string.generate());
        log.info(string.generate());


        SequenceGenerator date = new SequenceGenerator(this.prefixGeneratorFactoryByFactory.get("datePrefix"));
        log.info(date.generate());
        log.info(date.generate());
        log.info(date.generate());
    }

}