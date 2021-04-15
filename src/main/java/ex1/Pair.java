package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pair<T, S> {
  private T first;
  private S second;

  public Pair(T first, S second) {
    this.first = first;
    this.second = second;
  }

  /**
   * Returns the first value held by the pair.
   * */
  public T getFirst() {
    return first;
  }

  /**
   * Sets the first value in the pair.
   * */
  public void setFirst(T first) {
    this.first = first;
  }

  /**
   * Returns the second value held by the pair.
   * */
  public S getSecond() {
    return second;
  }

  /**
   * Sets the second value in the pair.
   * */
  public void setSecond(S second) {
    this.second = second;
  }

  /**
   * Returns a {@link java.util.List} containing first and second values held by the pair.
   * */
  public List<Object> toList() {
    List<Object> list = new ArrayList<>();
    list.add(first);
    list.add(second);
    return list;
  }

  /**
   * Indicates whether some other object is equal to the pair.
   * Returns true iff both pairs hold the same values in the same order.
   * */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Pair)) {
      return false;
    }

    Pair<?, ?> pair = (Pair<?, ?>) o;
    return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }

  /**
   * Returns a string representation of the pair in the format: (10, 20), (Blue, 1).
   *
   * */
  @Override
  public String toString() {
    return "(" + first + ", " + second + ")";
  }
}
