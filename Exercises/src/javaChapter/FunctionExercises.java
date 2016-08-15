package javaChapter;

import java.time.LocalTime;
import java.util.ArrayList;

public class FunctionExercises {

  public static void main(String[] args) {
    exercise1();

    exercise2();

    exercise3();

    exercise4();
  }

  // Write a Function that will take an Integer and return its value multiplied by 2.
  // Call the function to print out the result.
  private static void exercise1() {
    /* Your solution goes here */
  }

  // Convert exercise 1 by defining the Function as a lambda expression.
  private static void exercise2() {
    /* Your solution goes here */
  }

  // Use a Predicate to remove animals from an array if they start with "d".
  private static void exercise3() {
    ArrayList<String> animals = new ArrayList<>();
    animals.add("dog");
    animals.add("cat");
    animals.add("mouse");
    animals.add("duck");
    animals.add("zebra");

    /* Your solution goes here */
    System.out.println(LocalTime.of(13, 23, 14, 452));
  }

  // Use a UnaryOperator to replace all strings in an array with null;
  private static void exercise4() {
    ArrayList<Object> array = new ArrayList<>();
    array.add("string");
    array.add(5);
    array.add(40.0);
    array.add(new Object());

    /* Your solution goes here */
  }
}
