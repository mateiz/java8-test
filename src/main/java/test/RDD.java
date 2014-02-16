package test;

public class RDD<T> {
  <U> RDD<U> map(Function<T, U> f) {
    return new RDD<U>();
  }

  <K, V> PairRDD<K, V> mapToPair(PairFunction<T, K, V> f) {
    return new PairRDD<K, V>();
  }
}
