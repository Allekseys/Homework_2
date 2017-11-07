// Array is entered from the keyboard

package com.hillel;

import java.util.Scanner;

public class Task9_11{

  public static void main(String... args){

    int sum = 0, sumn = 0, even = 0, odd = 0;

    int max = Integer.parseInt(args[0]); 
    int min = Integer.parseInt(args[0]);
    
    for(int i = 0; i < args.length; i++){
      System.out.println(i + " parameter: " + args[i]);

      if(Integer.parseInt(args[i]) > max) {
        max = Integer.parseInt(args[i]);
      }

      if(Integer.parseInt(args[i]) < min) {
        min = Integer.parseInt(args[i]);
      }

      if(Integer.parseInt(args[i]) % 2 == 0){
        even += Integer.parseInt(args[i]);
      } else{
        odd += Integer.parseInt(args[i]);
      } 
      
    }
    //int t = args.length; 

    System.out.println("Max is " + max);
    System.out.println("Min is " + min);

    System.out.println("Sum of even numbers is " + even);
    System.out.println("Sum of odd numbers is " + odd);

    System.out.print("Enter your n: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if(n > args.length || n < 0){
      System.out.println("Invalid n. Maybe you will be lucky next time.");
      return;
    }

    for(int i = 0; i < n; i++){
      //System.out.println(i + " parameter: " + args[i]);
      sumn += Integer.parseInt(args[i]);
    } 
    System.out.println("Sum of first n numbers is " + sumn);
  }
}