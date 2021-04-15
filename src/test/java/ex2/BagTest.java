package ex2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  Bag<Integer> bag = new Bag<>();

  @Test
  void shouldBeCreatedWithSizeZero() {
    assertEquals(0, bag.size());
  }

  @Test
  void shouldBeCreatedEmpty() {
    assertTrue(bag.isEmpty());
  }

  @Test
  void shouldNotBeEmptyAfterAdd() {
    bag.add(7);
    assertFalse(bag.isEmpty());
  }

  @Test
  void addShouldIncreaseSize() {
    bag.add(1);
    assertEquals(1, bag.size());
  }

  @Test
  void addRepeatedShouldIncreaseSize() {
    bag.add(1);
    bag.add(1);
    assertEquals(2, bag.size());
  }

  @Test
  void addDifferentShouldIncreaseSize() {
    bag.add(1);
    bag.add(2);
    bag.add(3);
    assertEquals(3, bag.size());
  }

  @Test
  void removeUniqueShouldDecreaseSize() {
    bag.add(1);
    bag.add(2);
    assertEquals(2, bag.size());
    bag.remove(2);
    assertEquals(1, bag.size());
  }

  @Test
  void removeDuplicateShouldDecreaseSize() {
    bag.add(1);
    bag.add(1);
    assertEquals(2, bag.size());
    bag.remove(1);
    assertEquals(1, bag.size());
  }

  @Test
  void removeNonContainedShouldNotDecreaseSize() {
    bag.add(1);
    bag.add(1);
    assertEquals(2, bag.size());
    bag.remove(10);
    assertEquals(2, bag.size());
  }

  @Test
  void addedElementShouldBeContained() {
    bag.add(10);
    assertTrue(bag.contains(10));
  }

  @Test
  void addedDuplicateElementShouldBeContained() {
    bag.add(10);
    bag.add(10);
    assertTrue(bag.contains(10));
  }

  @Test
  void bagShouldContainRepeatedElementIfRemovedOnce() {
    bag.add(10);
    bag.add(10);
    bag.remove(10);
    assertTrue(bag.contains(10));
  }

  @Test
  void bagShouldNotContainRemovedElement() {
    bag.add(10);
    bag.remove(10);
    assertFalse(bag.contains(10));
  }

  @Test
  void toArrayShouldIncludeAllElements() {
    bag.add(5);
    bag.add(15);
    bag.add(25);

    List<Object> list = Arrays.asList(bag.toArray());

    assertEquals(3, list.size());
    assertTrue(list.contains(25));
    assertTrue(list.contains(15));
    assertTrue(list.contains(5));
  }

  @Test
  void toArrayShouldIncludeRepetitions() {
    bag.add(5);
    bag.add(5);

    Integer[] expected = {5, 5};
    assertArrayEquals(expected, bag.toArray());
  }

  @Test
  void toArrayShouldUpdateInputArray() {
    Integer[] array = new Integer[2];
    bag.add(5);
    bag.add(5);
    bag.toArray(array);

    Integer[] expected = {5, 5};
    assertArrayEquals(expected, array);
  }

  @Test
  void shouldContainAll() {
    bag.add(8);
    bag.add(9);
    bag.add(10);

    List<Integer> list = List.of(8, 9);
    assertTrue(bag.containsAll(list));
  }

  @Test
  void shouldContainAllRepeated() {
    bag.add(8);
    bag.add(9);

    List<Integer> list = List.of(8, 9, 9, 9, 9);
    assertTrue(bag.containsAll(list));
  }

  @Test
  void shouldNotContainAll() {
    bag.add(8);
    bag.add(9);

    List<Integer> list = List.of(1, 9);
    assertFalse(bag.containsAll(list));
  }

  @Test
  void shouldAddAll() {
    List<Integer> list = List.of(1, 9);
    bag.addAll(list);

    assertEquals(1, bag.count(1));
    assertEquals(1, bag.count(9));
  }

  @Test
  void addAllShouldIncreaseCountOfExistingElements() {
    bag.add(1);
    bag.add(1);
    bag.add(9);

    List<Integer> list = List.of(1, 9);
    bag.addAll(list);

    assertEquals(3, bag.count(1));
    assertEquals(2, bag.count(9));
  }

  @Test
  void removeAllShouldRemoveAllOccurrences() {
    bag.add(10);
    bag.add(10);
    bag.add(9);

    bag.removeAll(List.of(10));
    assertFalse(bag.contains(10));
  }

  @Test
  void removeAllShouldHaveNoEffectWhenRemovingNonContainedElements() {
    bag.add(10);
    bag.add(10);
    bag.add(9);

    bag.removeAll(List.of(5));
    assertEquals(3, bag.size());
  }

  @Test
  void retainAllShouldRemoveAllOccurrences() {
    bag.add(9);
    bag.add(10);
    bag.add(10);
    bag.add(10);

    bag.retainAll(List.of(9));
    assertEquals(1, bag.size());
    assertFalse(bag.contains(10));
  }

  @Test
  void retainAllShouldKeepDuplicates() {
    bag.add(10);
    bag.add(10);
    bag.add(9);

    bag.retainAll(List.of(10));
    assertEquals(2, bag.size());
    assertEquals(2, bag.count(10));
    assertFalse(bag.contains(9));
  }

  @Test
  void shouldBeEmptyAfterClear() {
    bag.add(0);
    bag.add(3);
    bag.clear();
    assertTrue(bag.isEmpty());
  }

  @Test
  void anyElementCountShouldBeZeroAfterClear() {
    bag.add(0);
    bag.add(3);
    bag.add(3);
    bag.clear();
    assertEquals(0,bag.count(0));
    assertEquals(0,bag.count(3));
  }

  @Test
  void countUniqueElementShouldReturnOne() {
    bag.add(1);
    bag.add(2);
    assertEquals(1, bag.count(2));
  }

  @Test
  void countDuplicatedElementShouldReturnTwo() {
    bag.add(1);
    bag.add(2);
    bag.add(2);
    assertEquals(2, bag.count(2));
  }

  @Test
  void countNonContainedShouldReturnZero() {
    bag.add(1);
    bag.add(2);
    assertEquals(0, bag.count(5));
  }
}
