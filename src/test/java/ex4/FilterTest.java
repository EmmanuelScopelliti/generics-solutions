package ex4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {

  @Test
  void filterNoMatchShouldReturnEmptyList() {
    Person joe = new Person("Joe", 60);
    Person mary = new Person("Mary", 18);
    Person paul = new Person("Paul", 18);
    Person paul2 = new Person("Paul", 25);

    List<Person> list = List.of(joe, mary, paul, paul2);
    List<Person> filtered = ListUtils.filter(list, p -> p.age < 18);

    assertEquals(List.of(), filtered);
  }

  @Test
  void filterShouldReturnSublist() {
    Person joe = new Person("Joe", 60);
    Person mary = new Person("Mary", 18);
    Person paul = new Person("Paul", 18);
    Person paul2 = new Person("Paul", 25);

    List<Person> list = List.of(joe, mary, paul, paul2);
    List<Person> filtered = ListUtils.filter(list, p -> p.name.equals("Paul"));

    assertEquals(List.of(paul, paul2), filtered);
  }

  @Test
  void filterShouldReturnSublistWithDuplicates() {
    Person joe = new Person("Joe", 60);
    Person mary = new Person("Mary", 18);

    List<Person> list = List.of(joe, mary, joe, mary, joe);
    List<Person> filtered = ListUtils.filter(list, p -> p.name.equals("Joe"));

    assertEquals(List.of(joe, joe, joe), filtered);
  }

  @Test
  void filterAllMatchShouldReturnSameList() {
    Person joe = new Person("Joe", 60);
    Person mary = new Person("Mary", 18);
    Person paul = new Person("Paul", 18);
    Person paul2 = new Person("Paul", 25);

    List<Person> list = List.of(joe, mary, paul, paul2);
    List<Person> filtered = ListUtils.filter(list, p -> true);

    assertEquals(list, filtered);
  }
}
