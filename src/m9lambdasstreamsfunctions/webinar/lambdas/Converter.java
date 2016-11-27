package src.m9lambdasstreamsfunctions.webinar.lambdas;

@FunctionalInterface
public interface Converter<F, T, K> {
    T convert(F from, K anotherFrom);
}
