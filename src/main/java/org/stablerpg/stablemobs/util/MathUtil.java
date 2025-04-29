package org.stablerpg.stablemobs.util;

import java.util.concurrent.ConcurrentHashMap;

public final class MathUtil {

  private static final ConcurrentHashMap<Integer, Double> logCache = new ConcurrentHashMap<>();

  private MathUtil() {
  }

  public static double log(double x, int base) {
    double denominator = logCache.computeIfAbsent(base, StrictMath::log);
    return StrictMath.log(x) / denominator;
  }

  public static double pythagorean(double x, double y) {
    return StrictMath.sqrt((x * x) + (y * y));
  }

}
