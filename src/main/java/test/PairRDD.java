package test;

public class PairRDD<K, V> extends RDD<Pair<K, V>> {
  public PairRDD<K, V> reduceByKey(Function2<V, V, V> func) {
    return new PairRDD<K, V>();
  }
}
