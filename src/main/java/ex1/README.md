## Exercise 1: Creating generic classes

### Part 1

A pair is a simple data structure that holds two values.

Your goal in this exercise is to implement this data structure as a generic class that:

- accepts two type parameters, one for each value it holds
- has generic methods bound to the class parameter types

You should implement the methods below and generify them (when applicable):

- `getFirst` 
- `setFirst`
- `getSecond`
- `setSecond`
- `toList`
- `equals`
- `hashCode`
- `toString`

See the description of each method in [`Pair.java`](Pair.java) and the test methods in [`PairTest`](../../../test/java/ex1/PairTest.java) for details on how the method should behave.

Your code should pass all tests defined in [`PairTest`](../../../test/java/ex1/PairTest.java).

### Part 2

Now implement the `Coordinate` class, an extension of `Pair` that can only hold values of the same type, which must extend [`java.lang.Number`](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Number.html).

`Coordinate` should have the following methods (generified when applicable):

- `swap`
- `toShortList`
- `toIntegerList`
- `toLongList`
- `toFloatList`
- `toDoubleList`

See the description of each method in [`Coordinate.java`](Coordinate.java) and the test methods in [`PairTest`](../../../test/java/ex1/PairTest.java) for details on how the method should behave.

Your code should pass all tests defined in [`CoordinateTest`](../../../test/java/ex1/CoordinateTest.java).