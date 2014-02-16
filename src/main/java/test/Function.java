package test;

@FunctionalInterface
public interface Function<T, U> {
  U call(T arg);
}
