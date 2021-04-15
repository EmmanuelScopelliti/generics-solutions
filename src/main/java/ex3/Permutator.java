package ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutator {

  static <T> Set<List<T>> generatePermutations(Set<T> original) {
    if (original == null)
      throw new NullPointerException("Cannot generate permutations of a null list.");

    if (original.isEmpty())
      throw new IllegalArgumentException("Cannot generate permutations for an empty list.");

    Set<List<T>> permutations = new HashSet<>();
    generatePermutations(permutations, new ArrayList<>(), original);
    return permutations;
  }

  private static <T> void generatePermutations(
      Set<List<T>> permutations, List<T> permutation, Set<T> remainder) {

    if (remainder.size() == 0) {
      permutations.add(permutation);
      return;
    }

    for (T element : remainder) {
      List<T> newPermutation = new ArrayList<>(permutation);
      newPermutation.add(element);

      Set<T> newRemainder = new HashSet<>(remainder);
      newRemainder.remove(element);

      generatePermutations(permutations, newPermutation, newRemainder);
    }
  }
}
