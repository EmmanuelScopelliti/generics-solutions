package ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UnionOfTest {

  @Test
  void unionOfNonEmptyStringLists() {
    List<String> list1 = List.of("Rick", "Morty");
    List<String> list2 = List.of("Summer", "Beth");
    List<String> union = ListUtils.unionOf(list1, list2);

    Assertions.assertEquals(4, union.size());
    Assertions.assertTrue(union.containsAll(list1));
    Assertions.assertTrue(union.containsAll(list2));
  }

  @Test
  void unionOfNonEmptyIntegerLists() {
    List<Integer> list1 = List.of(0, 10, 20);
    List<Integer> list2 = List.of(30, 40, 50);
    List<Integer> union = ListUtils.unionOf(list1, list2);

    Assertions.assertEquals(6, union.size());
    Assertions.assertTrue(union.containsAll(list1));
    Assertions.assertTrue(union.containsAll(list2));
  }

  @Test
  void unionOfNonEmptyAndEmptyLists() {
    List<String> list1 = List.of("Rick", "Morty");
    List<String> list2 = List.of();
    List<String> union = ListUtils.unionOf(list1, list2);

    Assertions.assertEquals(2, union.size());
    Assertions.assertTrue(union.containsAll(list1));
  }

  @Test
  void unionOfEmptyAndNonEmptyLists() {
    List<String> list1 = List.of();
    List<String> list2 = List.of("Summer", "Beth");
    List<String> union = ListUtils.unionOf(list1, list2);

    Assertions.assertEquals(2, union.size());
    Assertions.assertTrue(union.containsAll(list2));
  }

  @Test
  void unionOfEmptyListsShouldReturnEmptyList() {
    List<Integer> list1 = List.of();
    List<Integer> list2 = List.of();
    List<Integer> union = ListUtils.unionOf(list1, list2);

    Assertions.assertEquals(0, union.size());
  }
}