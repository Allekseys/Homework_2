package com.hillel;

import java.util.Scanner;

public class Task4{

  public static void main(String... args){

    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter money sum: ");
    int sum = scanner.nextInt();

    System.out.print("Enter quality: ");
    String qual = scanner.next();

    switch(qual){
      case "terrible":
        sum *= 1; 
        break;
      case "poor":
        sum *= 1.05; 
        break;
      case "good":
        sum *= 1.1; 
        break;  
      case "great":
        sum *= 1.15; 
        break;   
      case "excellent":
        sum *= 1.2; 
        break; 
      default:
        System.out.println("Unknown data. Please try again.");
        return;
    }

    System.out.println("Result sum is " + sum);

  }
}