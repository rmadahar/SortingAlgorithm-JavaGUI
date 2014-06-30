/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithmgui;

import java.util.Random;

/**
This class contains utility methods for array
manipulation.
*/


public class ArrayUtil
{
/**
Creates an array filled with random values.
@param length the length of the array
@param n the number of possible random values
@return an array filled with length numbers between
0 and n-1
*/
private Random generator;
private int ArrayLimit, ArraySize;
private int [] Array;

 public ArrayUtil( int ArraySize, int ArrayLimit)
    {
        // initialise instance variables
        Array = new int[ArraySize];
        
        this.ArrayLimit = ArrayLimit;
        this.ArraySize = ArraySize;
    }







/**
Prints all elements in an array.
@param a the array to print
*/
public static void print(int[] a)
{


    
for (int i = 0; i < a.length; i++)
System.out.print(a[i] + " ");
System.out.println();
}

static int[] randomIntArray(int ArraySize, int ArrayLimit)
{ int[] a = new int [ArraySize];
Random generator = new Random();
for (int i = 0; i < a.length; i++)
a[i] = generator.nextInt(ArrayLimit);
return a;
}

  
public int [] generateList()
    {
        generator = new Random();
        for(int i = 0; i < Array.length; i++){
            Array[i]  = generator.nextInt(ArrayLimit);
        
    }
    return Array;
  }
  
  public int returnRange()
  {
      return ArrayLimit;
    }
    
  public int returnLength()
  {
      return ArraySize;}
      
} 
 

    


