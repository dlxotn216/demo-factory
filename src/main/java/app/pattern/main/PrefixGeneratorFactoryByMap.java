package app.pattern.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

import static java.util.Optional.ofNullable;

/**
 * Created by taesu at : 2019-04-29
 *
 * @author taesu
 * @version 1.0
 * @since 1.0
 */
@Component
@RequiredArgsConstructor
public class PrefixGeneratorFactoryByMap {
    private final Map<String, PrefixGenerator> prefixGeneratorMap;

    public PrefixGenerator get(String beanName) {
        return ofNullable(this.prefixGeneratorMap.get(beanName))
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 Prefix임"));
    }
}
