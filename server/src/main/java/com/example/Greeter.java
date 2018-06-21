package com.example;

/**
 * This is a class.
 */
public final class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * 
   * @param someone - the name of the person
   * @return String formated
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
