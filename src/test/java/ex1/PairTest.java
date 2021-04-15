package ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PairTest {

  @Test
  void setFirst() {
    Pair<String, Integer> pair = new Pair<>("Blue", 1);
    pair.setFirst("Red");
    assertEquals("Red", pair.getFirst());
  }

  @Test
  void setSecond() {
    Pair<String, Integer> pair = new Pair<>("Blue", 1);
    pair.setSecond(5);
    assertEquals(5, pair.getSecond());
  }

  @Test
  void getFirst() {
    Pair<String, Integer> pair = new Pair<>("Blue", 1);
    assertEquals("Blue", pair.getFirst());
  }

  @Test
  void getSecond() {
    Pair<String, Integer> pair = new Pair<>("Blue", 1);
    assertEquals(1, pair.getSecond());
  }

  @Test
  void toList() {
    Pair<String, Integer> pair = new Pair<>("Blue", 1);
    assertEquals(List.of("Blue", 1), pair.toList());
  }

  @Test
  void shouldBeEqual() {
    Pair<String, Integer> pair1 = new Pair<>("Blue", 1);
    Pair<String, Integer> pair2 = new Pair<>("Blue", 1);

    assertEquals(pair1, pair2);
  }

  @Test
  void shouldNotBeEqualDiffFirst() {
    Pair<String, Integer> pair1 = new Pair<>("Blue", 1);
    Pair<String, Integer> pair2 = new Pair<>("Red", 1);

    assertNotEquals(pair1, pair2);
  }

  @Test
  void shouldNotBeEqualDiffSecond() {
    Pair<String, Integer> pair1 = new Pair<>("Blue", 1);
    Pair<String, Integer> pair2 = new Pair<>("Blue", 8);

    assertNotEquals(pair1, pair2);
  }

  @Test
  void shouldNotBeEqual() {
    Pair<Integer, Integer> pair1 = new Pair<>(0, 1);
    Pair<Integer, Integer> pair2 = new Pair<>(1, 0);

    assertNotEquals(pair1, pair2);
  }

  @Test
  void toStringUsingParenthesis() {
    Pair<String, Integer> pair = new Pair<>("Blue", 1);
    assertEquals("(Blue, 1)", pair.toString());
  }
}
