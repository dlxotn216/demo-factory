package app.pattern.main;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by taesu at : 2019-04-29
 *
 * @author taesu
 * @version 1.0
 * @since 1.0
 */
@Component("datePrefix")
public class DatePrefixGenerator implements PrefixGenerator {
    @Override
    public String get() {
        return LocalDate.now().toString();
    }
}
