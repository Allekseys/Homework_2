package com.hillel;

import java.util.Scanner;

public class Task7{

  public static void main(String... args){

    int n = 90;

    while(n >= 0) // Because all nonnegative numbers consist of positive numbers and zero
    {
      System.out.print(n + " ");
      n -= 5;
    }
  }
}