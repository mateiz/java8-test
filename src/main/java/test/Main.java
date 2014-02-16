package test;

import static test.Pair.makePair;

public class Main {
  public static void main(String[] args) {
    RDD<Integer> rdd = new RDD<Integer>();
    PairRDD<Integer, Integer> rdd2 = rdd.mapToPair(x -> makePair(1, 2));
    PairRDD<Integer, Integer> rdd3 = rdd2.reduceByKey((a, b) -> a + b);
    RDD<Integer> rdd4 = rdd3.map(p -> p.key());
  }
}
