package com.linkedin.javacodechallenges;

public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void SelfIntroduction() {
    System.out.println(String.format("Hey I'm %s %s with %d years old.", firstName, lastName, age));
  }
}