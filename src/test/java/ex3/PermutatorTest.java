package ex3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PermutatorTest {

  @Test
  void nullListShouldThrowNullPointerException() {
    assertThrows(NullPointerException.class, () -> Permutator.generatePermutations(null));
  }

  @Test
  void emptyListShouldThrowIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> Permutator.generatePermutations(Set.of()));
  }

  @Test
  void permutationsOfOneElement() {
    Set<Integer> set = Set.of(1);
    Set<List<Integer>> permutations = Permutator.generatePermutations(set);

    assertEquals(1, permutations.size());
    assertTrue(permutations.contains(List.of(1)));
  }

  @Test
  void permutationsOfTwoElements() {
    Set<Integer> set = Set.of(1, 2);
    Set<List<Integer>> permutations = Permutator.generatePermutations(set);

    assertEquals(2, permutations.size());
    assertTrue(permutations.contains(List.of(1, 2)));
    assertTrue(permutations.contains(List.of(2, 1)));
  }

  @Test
  void permutationsOfThreeElements() {
    Set<Integer> list = Set.of(1, 2, 3);
    Set<List<Integer>> permutations = Permutator.generatePermutations(list);

    assertEquals(6, permutations.size());
    assertTrue(permutations.contains(List.of(1, 2, 3)));
    assertTrue(permutations.contains(List.of(1, 3, 2)));
    assertTrue(permutations.contains(List.of(2, 1, 3)));
    assertTrue(permutations.contains(List.of(2, 3, 1)));
    assertTrue(permutations.contains(List.of(3, 1, 2)));
    assertTrue(permutations.contains(List.of(3, 2, 1)));
  }

  @Test
  void permutationsOfFourElements() {
    Set<Character> list = Set.of('r', 'i', 'c', 'k');
    Set<List<Character>> permutations = Permutator.generatePermutations(list);

    assertEquals(24, permutations.size());
    assertTrue(permutations.contains(List.of('r', 'i', 'c', 'k')));
    assertTrue(permutations.contains(List.of('r', 'i', 'k', 'c')));
    assertTrue(permutations.contains(List.of('r', 'c', 'i', 'k')));
    assertTrue(permutations.contains(List.of('r', 'c', 'k', 'i')));
    assertTrue(permutations.contains(List.of('r', 'k', 'i', 'c')));
    assertTrue(permutations.contains(List.of('r', 'k', 'c', 'i')));
    assertTrue(permutations.contains(List.of('i', 'r', 'c', 'k')));
    assertTrue(permutations.contains(List.of('i', 'r', 'k', 'c')));
    assertTrue(permutations.contains(List.of('i', 'c', 'r', 'k')));
    assertTrue(permutations.contains(List.of('i', 'c', 'k', 'r')));
    assertTrue(permutations.contains(List.of('i', 'k', 'r', 'c')));
    assertTrue(permutations.contains(List.of('i', 'k', 'c', 'r')));
    assertTrue(permutations.contains(List.of('c', 'r', 'i', 'k')));
    assertTrue(permutations.contains(List.of('c', 'r', 'k', 'i')));
    assertTrue(permutations.contains(List.of('c', 'i', 'r', 'k')));
    assertTrue(permutations.contains(List.of('c', 'i', 'k', 'r')));
    assertTrue(permutations.contains(List.of('c', 'k', 'r', 'i')));
    assertTrue(permutations.contains(List.of('c', 'k', 'i', 'r')));
    assertTrue(permutations.contains(List.of('k', 'r', 'i', 'c')));
    assertTrue(permutations.contains(List.of('k', 'r', 'c', 'i')));
    assertTrue(permutations.contains(List.of('k', 'i', 'r', 'c')));
    assertTrue(permutations.contains(List.of('k', 'i', 'c', 'r')));
    assertTrue(permutations.contains(List.of('k', 'c', 'r', 'i')));
    assertTrue(permutations.contains(List.of('k', 'c', 'i', 'r')));
  }

  @Test
  void permutationsOfTenElements() {
    Set<Integer> list = Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    Set<List<Integer>> permutations = Permutator.generatePermutations(list);
  }
}
