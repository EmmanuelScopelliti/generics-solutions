package ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class IntersectionOfTest {

  @Test
  void intersectionOfDisjointLists() {
    List<String> list1 = List.of("Rick", "Morty");
    List<String> list2 = List.of("Summer", "Beth");
    List<String> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(0, intersection.size());
  }

  @Test
  void intersectionOfOverlappingLists() {
    List<Integer> list1 = List.of(0, 10, 20);
    List<Integer> list2 = List.of(10, 20, 30);
    List<Integer> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(2, intersection.size());
    Assertions.assertTrue(intersection.containsAll(List.of(10, 20)));
  }

  @Test
  void intersectionOfOverlappingListsWithRepeatedElementsMinMultOne() {
    List<Integer> list1 = List.of(0, 10, 10, 10);
    List<Integer> list2 = List.of(10, 30);
    List<Integer> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(1, intersection.size());
    Assertions.assertEquals(List.of(10), intersection);
  }

  @Test
  void intersectionOfOverlappingListsWithRepeatedElementsMinMultTwo() {
    List<Integer> list1 = List.of(0, 10, 10, 10);
    List<Integer> list2 = List.of(10, 10, 30);
    List<Integer> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(2, intersection.size());
    Assertions.assertEquals(List.of(10, 10), intersection);
  }

  @Test
  void intersectionOfOverlappingListsWithRepeatedElementsMinMultThree() {
    List<Integer> list1 = List.of(0, 10, 10, 10, 20, 20);
    List<Integer> list2 = List.of(10, 10, 20, 20);
    List<Integer> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(4, intersection.size());
    intersection.sort(Comparator.comparingInt(o -> o));
    Assertions.assertEquals(intersection, List.of(10, 10, 20, 20));
  }

  @Test
  void intersectionWithEmptyListShouldReturnEmptyList() {
    List<String> list1 = List.of("Rick", "Morty");
    List<String> list2 = List.of();
    List<String> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(0, intersection.size());
  }

  @Test
  void intersectionOfTwoEmptyListsShouldReturnEmptyList() {
    List<Integer> list1 = List.of();
    List<Integer> list2 = List.of();
    List<Integer> intersection = ListUtils.intersectionOf(list1, list2);

    Assertions.assertEquals(0, intersection.size());
  }
}