package ex1;

import java.util.ArrayList;
import java.util.List;

public class Coordinate<T extends Number> extends Pair<T, T> {

  public Coordinate(T first, T second) {
    super(first, second);
  }

  /**
   * Swaps the first and second values of the coordinate.
   * */
  public void swap() {
    T temp = getFirst();
    setFirst(getSecond());
    setSecond(temp);
  }

  /**
   * Returns a {@link java.util.List} containing first and second values held by the coordinate as
   * {@link java.lang.Short}.
   */
  public List<Short> toShortList() {
    return toList(getFirst().shortValue(), getSecond().shortValue());
  }

  /**
   * Returns a {@link java.util.List} containing first and second values held by the coordinate as
   * {@link java.lang.Integer}.
   */
  public List<Integer> toIntegerList() {
    return toList(getFirst().intValue(), getSecond().intValue());
  }

  /**
   * Returns a {@link java.util.List} containing first and second values held by the coordinate as
   * {@link java.lang.Long}.
   */
  public List<Long> toLongList() {
    return toList(getFirst().longValue(), getSecond().longValue());
  }

  /**
   * Returns a {@link java.util.List} containing first and second values held by the coordinate as
   * {@link java.lang.Float}.
   */
  public List<Float> toFloatList() {
    return toList(getFirst().floatValue(), getSecond().floatValue());
  }

  /**
   * Returns a {@link java.util.List} containing first and second values held by the coordinate as
   * {@link java.lang.Double}.
   */
  public List<Double> toDoubleList() {
    return toList(getFirst().doubleValue(), getSecond().doubleValue());
  }

  private <N extends Number> List<N> toList(N first, N second) {
    List<N> list = new ArrayList<>();
    list.add(first);
    list.add(second);
    return list;
  }
}
