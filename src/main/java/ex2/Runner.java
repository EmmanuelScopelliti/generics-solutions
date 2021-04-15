package ex2;

import java.util.List;

public class Runner {

  public static void main(String[] args) {
    Bag<Integer> bag = new Bag<>();

    bag.add(10);
    bag.add(20);
    bag.add(30);
    bag.add(20);

    System.out.println(bag);

    for (Integer integer : bag) {
      System.out.println(integer);
    }

    bag.remove(10);
    System.out.println("Does the bag contain '10': " + bag.contains(10));
    System.out.println("Does the bag contain '20': " + bag.contains(20));

    System.out.println("count(20): " + bag.count(20));

    bag.addAll(List.of(10,50,50,60));
    System.out.println(bag);
  }
}
