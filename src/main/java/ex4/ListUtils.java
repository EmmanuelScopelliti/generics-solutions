package ex4;

import java.util.*;
import java.util.function.Predicate;

public class ListUtils {

  /**
   * Returns a new list containing all elements of both lists (including duplicates)
   *
   * For instance,
   * the intersection of [1, 2, 3] and [4, 5, 6] should be [1, 2, 3, 4, 5, 6] and
   * the intersection of [1, 1, 2] and [2, 1] should be [1, 1, 2, 2, 1]
   *
   */
  public static <T> List<T> unionOf(List<? extends T> list1, List<? extends T> list2) {
    List<T> union = new ArrayList<>(list1);
    union.addAll(list2);

    return union;
  }

  /**
   * Returns a new list containing only the elements contained in both lists.
   * If the lists contain duplicates, the returned list must contain, for each duplicated element,
   * as many duplicates as in the list with least duplicates.
   *
   * For instance, the intersection of [1, 1, 2, 3] and [1, 3, 4] should be [1, 3] and
   * the intersection of [1, 1, 1, 2] and [1, 3, 1] should be [1, 1]
   *
   * The order of the elements in the input lists is irrelevant.
   * */

  public static <T> List<T> intersectionOf(List<? extends T> list1, List<? extends T> list2) {
    Map<T, Integer> multiplicities1 = createElementMultiplicityMap(list1);
    Map<T, Integer> multiplicities2 = createElementMultiplicityMap(list2);

    HashSet<T> set1 = new HashSet<>(list1);
    HashSet<T> set2 = new HashSet<>(list2);
    List<T> intersection = new ArrayList<>(set1);
    intersection.retainAll(set2);

    List<T> duplicates = new ArrayList<>();
    for (T t : intersection) {
      int mult1 = multiplicities1.get(t);
      int mult2 = multiplicities2.get(t);

      if (mult1 > 1 && mult2 > 1) {
        int min = Math.min(mult1, mult2);
        for (int i = 1; i < min; i++) {
          duplicates.add(t);
        }
      }
    }

    intersection.addAll(duplicates);

    return intersection;
  }

  private static <T> Map<T, Integer> createElementMultiplicityMap(List<? extends T> list1) {
    Map<T, Integer> multiplicities = new HashMap<>();

    for (T t : list1) {
      int mult = multiplicities.getOrDefault(t, 0);
      multiplicities.put(t, mult + 1);
    }

    return multiplicities;
  }

  /**
   * Finds and returns the first element in the list for which the input predicate is true.
   * */
  public static <T> T find(List<T> list, Predicate<T> predicate) {
    for (T t : list) {
      if (predicate.test(t)) {
        return t;
      }
    }

    return null;
  }

  /**
   * Finds and returns the last element in the list for which the input predicate is true.
   * */
  public static <T> T findLast(List<T> list, Predicate<T> predicate) {
    List<T> reversed = new ArrayList<>(list);
    Collections.reverse(reversed);

    return find(reversed, predicate);
  }

  /**
   * Returns a copy of the list containing only the elements of the original list for which the input predicate is true.
   * */
  public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
    List<T> filtered = new ArrayList<>();

    for (T t : list) {
      if (predicate.test(t)) {
        filtered.add(t);
      }
    }

    return filtered;
  }
}
