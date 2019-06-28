package app.pattern.main;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by taesu at : 2019-04-29
 *
 * @author taesu
 * @version 1.0
 * @since 1.0
 */
public class SequenceGenerator {
    private AtomicLong sequence;
    private PrefixGenerator prefixGenerator;

    public SequenceGenerator(PrefixGenerator prefixGenerator) {
        this.sequence = new AtomicLong(0);
        this.prefixGenerator = prefixGenerator;
    }

    public String generate() {
        return this.prefixGenerator.get() + this.sequence.getAndIncrement();
    }
}
