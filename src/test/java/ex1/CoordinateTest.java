package ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordinateTest {

  @Test
  void swap() {
    Coordinate<Integer> c = new Coordinate<>(3, 5);
    c.swap();
    assertEquals(5, c.getFirst());
    assertEquals(3, c.getSecond());
  }

  @Test
  void toShortList() {
    short first = (short) 3;
    short second = (short) 5;
    Coordinate<Short> c = new Coordinate<>(first, second);
    assertEquals(List.of(first, second), c.toShortList());
  }

  @Test
  void toIntegerList() {
    Coordinate<Integer> c = new Coordinate<>(3, 5);
    assertEquals(List.of(3, 5), c.toIntegerList());
  }

  @Test
  void toLongList() {
    long first = 3000000000L;
    long second = 5000000000L;
    Coordinate<Long> c = new Coordinate<>(first, second);
    assertEquals(List.of(first, second), c.toLongList());
  }

  @Test
  void toFloatList() {
    float first = 3.1f;
    float second = 5.7f;
    Coordinate<Float> c = new Coordinate<>(first, second);
    assertEquals(List.of(first, second), c.toFloatList());
  }

  @Test
  void toDoubleList() {
    double first = 3.1;
    double second = 5.7;
    Coordinate<Double> c = new Coordinate<>(first, second);
    assertEquals(List.of(first, second), c.toDoubleList());
  }

  @Test
  void doubleCoordinateToIntegerList() {
    Coordinate<Double> c = new Coordinate<>(3.1, 5.2);
    assertEquals(List.of(3, 5), c.toIntegerList());
  }

  @Test
  void integerCoordinateToLongList() {
    Coordinate<Integer> c = new Coordinate<>(-1, -5);
    assertEquals(List.of(-1L, -5L), c.toLongList());
  }

  @Test
  void integerCoordinateToFloatList() {
    Coordinate<Integer> c = new Coordinate<>(0, 25);
    assertEquals(List.of(0.0f, 25.0f), c.toFloatList());
  }
}
