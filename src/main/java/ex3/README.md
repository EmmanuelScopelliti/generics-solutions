## Exercise 3: Creating a generic method

A [permutation](https://en.wikipedia.org/wiki/Permutation#:~:text=In%20mathematics%2C%20a%20permutation%20of,order%20of%20an%20ordered%20set.) of a set is, loosely speaking, an arrangement of its members into a sequence or linear order.

Examples of permutations of the set `{1, 2, 3}` are `{2, 1, 3}` and `{3, 2, 1}`.

Your goal in this exercise is to write a generic static method called `generatePermutations` (in the [`Permutator`](Permutator.java) class) which generates all permutations for a given set.

Your method should:

- Accept a single `Set` object as a parameter
- Return a `Set` of `List` objects, which of which contain one valid permutation of the set
- Match the return type according to the parameter type

Keep in mind that, for any given set, there are `n!` permutations, where `n` is the size of the set. So, a set of 10 elements already has 3628800 permutations! Thus, we only expect your method to handle sets up to that size. 

Your code should pass all tests defined in [`PermutatorTest`](../../../test/java/ex3/BagTest.java).
 
 
 