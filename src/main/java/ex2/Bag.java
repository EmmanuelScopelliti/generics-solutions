package ex2;

import java.util.*;

public class Bag<E> implements Collection<E> {
  private final Map<E, Integer> elements;

  public Bag() {
    elements = new HashMap<>();
  }

  public Bag(Bag<? extends E> bag) {
    elements = new HashMap<>(bag.elements);
  }

  public Bag(Collection<? extends E> collection) {
    this();
    this.addAll(collection);
  }

  @Override
  public int size() {
    return elements.values().stream().mapToInt(x -> x).sum();
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean contains(Object o) {
    return elements.containsKey(o);
  }

  @Override
  public Iterator<E> iterator() {
    return toList().iterator();
  }

  @Override
  public Object[] toArray() {
    return toList().toArray();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return toList().toArray(a);
  }

  @Override
  public boolean add(E e) {
    try {
      elements.put(e, count(e) + 1);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  @Override
  public boolean remove(Object o) {
    if (!elements.containsKey(o)) {
      return false;
    }

    E key = (E) o;
    int count = count(key);

    if (count >= 2) {
      elements.put(key, count - 1);
    } else {
      elements.remove(key);
    }

    return true;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return elements.keySet().containsAll(c);
  }

  @Override
  public boolean addAll(Collection<? extends E> collection) {
    boolean hasChanged = false;

    for (E e : collection) {
      hasChanged = add(e) || hasChanged;
    }

    return hasChanged;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    boolean hasChanged = false;

    for (Object o : c) {
      hasChanged = (elements.remove(o) != null) || hasChanged;
    }

    return hasChanged;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    List<E> keysToRemove = new ArrayList<>();

    for (E e : elements.keySet()) {
      if (!c.contains(e)) {
        keysToRemove.add(e);
      }
    }

    return removeAll(keysToRemove);
  }

  @Override
  public void clear() {
    elements.clear();
  }

  @Override
  public String toString() {
    return toList().toString();
  }

  public List<E> toList() {
    List<E> list = new ArrayList<>();

    for (E element : elements.keySet()) {
      for (int i = 0; i < count(element); i++) {
        list.add(element);
      }
    }

    return list;
  }

  public int count(E element) {
    return elements.getOrDefault(element, 0);
  }
}
