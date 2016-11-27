package src.m9_lambdas_streams_functions.webinar.lambdas;

@FunctionalInterface
public interface PersonExample<T, F, P> {
    P create(T t, F f);
}
