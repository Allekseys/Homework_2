package com.hillel;

import java.util.Scanner;

public class Task3{

  public static void main(String... args){
 
    double rez=0;

    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter data: ");
   
    String op = scanner.next();

    int a = scanner.nextInt();

    int b = scanner.nextInt();

    switch(op){
      case "addition":
        rez = a + b;
        break;
      case "substraction":
        rez = a - b;
        break;
      case "multiplication":
        rez = a * b;
        break;
      case "division":
        if(b == 0) {
          System.out.println("Division by zero!");
          return;
        } else{
          rez = (double)a / b;
        }
          break;
      case "remainder":
        if(b == 0) {
          System.out.println("Division by zero!");
          return;
        } else{
          rez = a % b;
        }
          break;
      case "module":
        rez = Math.abs(a);
        break;
      default:
        System.out.println("Unknown data. Please try again.");
        return;
    }

    System.out.println("Result is " + rez);

  }
}