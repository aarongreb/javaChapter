package javaChapter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExercises {
  public static void main(String[] args) {
    exercise1();

    exercise2();

    exercise3();
  }

  // Print out all elements in an array
  private static void exercise1() {
    List<String> list = Arrays.asList("Aaron", "David", "Aboli", "Luke", "Dale", "Susumu");

    /* Your solution goes here */
  }

  // Print out all odd numbers greater than 5
  private static void exercise2() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /* Your solution goes here */
  }

  // Use a Predicate function to print out all non-null values in an array
  private static void exercise3() {
    List<Object> list = Arrays.asList("a string", 3, null, "", false, null);

    /* Your solution goes here */
  }
}

