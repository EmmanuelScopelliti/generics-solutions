package ex4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FindTest {

  @Test
  void findEqual() {
    List<Integer> list = List.of(10, 20, 30, 40);
    Integer element = ListUtils.find(list, x -> x == 10);

    assertEquals(10, element);
  }

  @Test
  void findNoMatchShouldReturnNull() {
    List<Integer> list = List.of(10, 20, 30, 40);
    Integer element = ListUtils.find(list, x -> x > 50);

    assertNull(element);
  }

  @Test
  void findByFieldValue() {
    Person joe = new Person("Joe", 60);
    Person mary = new Person("Mary", 18);
    Person paul = new Person("Paul", 18);
    Person paul2 = new Person("Paul", 25);

    List<Person> list = List.of(joe, mary, paul, paul2);
    Person found = ListUtils.find(list, p -> p.age == 18);

    assertEquals(mary, found);
  }

  @Test
  void findLastByFieldValue() {
    Person joe = new Person("Joe", 60);
    Person mary = new Person("Mary", 18);
    Person paul = new Person("Paul", 18);
    Person paul2 = new Person("Paul", 25);

    List<Person> list = List.of(joe, mary, paul, paul2);
    Person found = ListUtils.findLast(list, p -> p.age == 18);

    assertEquals(paul, found);
  }


  @Test
  void findLastNoMatchShouldReturnNull() {
    List<Integer> list = List.of(10, 20, 30, 40);
    Integer element = ListUtils.find(list, x -> x > 50);

    assertNull(element);
  }
}
