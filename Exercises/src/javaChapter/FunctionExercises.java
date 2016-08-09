package javaChapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExercises {
  class Date {
    String day;
    String month;
    float year;

    Date(String day, String month, float year) {
      this.day = day;
      this.month = month;
      this.year = year;
    }
  }

  public static void main(String[] args) {
    List<Date> dates = new ArrayList();

    Function<Date, String> dateStringFunction = new Function<Date, String>() {
      public String apply(Date d) {
        return d.month + " " + d.day + ", " + d.year;
      }
    };
  }

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
