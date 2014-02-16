package test;

public interface PairFunction<T, K, V> {
  public Pair<K, V> call(T t);
}
