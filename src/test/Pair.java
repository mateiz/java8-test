package test;

public class Pair<K, V> {
  private K k;
  private V v;

  public Pair(K key, V value) {
    this.k = key;
    this.v = value;
  }

  public static <K, V> Pair<K, V> makePair(K key, V value) {
    return new Pair<K, V>(key, value);
  }

  public K key() {
    return k;
  }

  public V value() {
    return v;
  }
}
