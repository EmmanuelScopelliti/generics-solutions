## Exercise 2: Creating a new `Collection` type

A [bag (or multiset)](https://en.wikipedia.org/wiki/Multiset) is a data structure consisting of an unordered collection of elements and allows duplicates.

Your goal in this exercise is to implement this structure as a generic class that implements the [Collection](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/Collection.html) interface.

Your bag should support the following methods:

- Defined in the `Iterable` interface:
    - `iterator`

- Defined in the `Collection` interface:
    - `size`
    - `isEmpty`
    - `contains`
    - `toArray`
    - `toArray`
    - `add`
    - `remove`
    - `containsAll`
    - `addAll`
    - `removeAll`
    - `retainAll`
    - `clear`
  
You should also implement a Bag-specific method called `count()`, which returns the number of occurrences of a given element. 

The [`Runner`](Runner.java) class demonstrates how a `Bag` is meant to be used. 

Your code should pass all tests defined in [`BagTest`](../../../test/java/ex2/BagTest.java).
 
 