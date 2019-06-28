package app.pattern.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by taesu at : 2019-04-29
 *
 * @author taesu
 * @version 1.0
 * @since 1.0
 */
@Component("stringPrefix")
@RequiredArgsConstructor
public class StringPrefixGenerator implements PrefixGenerator {

    private static final String PREFIX = "PREFIX";

    @Override
    public String get() {
        return StringPrefixGenerator.PREFIX;
    }
}
