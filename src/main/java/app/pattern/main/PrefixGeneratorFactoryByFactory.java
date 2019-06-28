package app.pattern.main;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by taesu at : 2019-04-29
 *
 * @author taesu
 * @version 1.0
 * @since 1.0
 */
@Component
@RequiredArgsConstructor
public class PrefixGeneratorFactoryByFactory {

    @Autowired
    @Qualifier("stringPrefix")
    private PrefixGenerator stringPrefixGenerator;

    @Autowired
    @Qualifier("datePrefix")
    private PrefixGenerator datePrefixGenerator;

    public PrefixGenerator get(String type) {
        if (Objects.equals(type, "stringPrefix")) {
            return this.stringPrefixGenerator;
        } else if (Objects.equals(type, "datePrefix")) {
            return this.datePrefixGenerator;
        }

        throw new IllegalArgumentException("");
    }

}
