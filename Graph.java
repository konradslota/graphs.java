/**
 Name: Graphs

 Description:

 Created by: Konrad Slota

 Created on: 13/02/18

*/

import java.util.Scanner;

public class Graphs{
  public static void main (String[] args){

  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int num1 = input.nextInt();
  System.out.print("Enter a number: ");
  int num2 = input.nextInt();
  System.out.print("Enter a number: ");
  int num3 = input.nextInt();
  System.out.print("Enter a number: ");
  int num4 = input.nextInt();
  System.out.print("Enter a number: ");
  int num5 = input.nextInt();

  int val = 0;

  for(int counter = 1; counter <= 5; counter++){
    if(counter == 1)
    val = num1;
    else if (counter == 2)
    val = num2;
    else if (counter == 3)
    val = num3;
    else if (counter == 4)
    val = num4;
    else if (counter == 5)
    val = num5;

    for(int j = 1; j<= val; j++)
      System.out.print("+");

     System.out.println();
     }//end for

   }




}