package src.m9_lambdas_streams_functions.webinar.lambdas;

@FunctionalInterface
public interface Converter<F, T, K> {
    T convert(F from, K anotherFrom);
}
