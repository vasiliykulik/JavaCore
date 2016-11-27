package src.m9lambdasstreamsfunctions.webinar.lambdas;

@FunctionalInterface
public interface PersonExample<T, F, P> {
    P create(T t, F f);
}
