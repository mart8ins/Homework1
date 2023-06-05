package io.codelex.streams.practice;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {

    public static CharacterToStringCollector toCharList() {
        return new CharacterToStringCollector();
    }

    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() {
        return (string, character) -> string.append(character);
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (a, b) -> a.append(b);
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return (builder) -> String.valueOf(builder);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED);
    }
}
