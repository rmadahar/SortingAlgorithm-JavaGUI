/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithmgui;

/**
 *
 * @author Rajin Madahar
 */
import java.io.*;
/**
 * Write a description of class test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
public static void main(String[] args) throws IOException
 {
     DataInputStream a = new DataInputStream(System.in);
    System.out.println("Please enter Array Size: ");
    int ArrayLength = Integer.parseInt(a.readLine());   // get the number of iterations
    
     DataInputStream b = new DataInputStream(System.in);
    System.out.println("Please enter Array Limit: ");
    int ArrayLimit = Integer.parseInt(b.readLine()); 
    
     int [] Array = ArrayUtil.randomIntArray(ArrayLength, ArrayLimit);
    ArrayUtil.print(Array);
    
  
    InsertionSort.InsertionSort(Array,ArrayLength);
     ArrayUtil.print(Array);
     
      DataInputStream j = new DataInputStream(System.in);
    System.out.println("Please enter Array Size: ");
    int ArrayLength2 = Integer.parseInt(j.readLine());   // get the number of iterations
    
     DataInputStream k = new DataInputStream(System.in);
    System.out.println("Please enter Array Limit: ");
    int ArrayLimit2 = Integer.parseInt(k.readLine()); 
    
       
     quickSort.quickSort(Array,Array[0],Array[(Array.length)-1]);
      ArrayUtil.print(Array);
    
    
    DataInputStream c = new DataInputStream(System.in);
    System.out.println("Please enter Search Target ");
    int SearchTarget = Integer.parseInt(c.readLine());
    
    {
   
    
      binary.binarySearch(Array,Array[0],Array[(Array.length)-1],SearchTarget);
      int index = binary.binarySearch(Array,Array[0],Array[(Array.length)-1],SearchTarget);
        
       if(index != -1)                                                     //if index does not equal -1,
                            System.out.println("Value "+SearchTarget+" found || index= " + (index+1));    //print the search number and index of element
                    else                                                                //otherwise,
                            System.out.println("Value "+SearchTarget+" not found");
                            
                            {
                            }
                                 
          System.out.println();// Blank Line
                          System.out.println();// Blank Line   
                            System.out.println();// Blank Line
        System.out.println("Testing time to run Binary Search, Insertion Sort 'nano seconds'"); //Prints out message
        System.out.println(); // Blank Line
        long iStart, iEnd, iElapsed, bStart, bEnd, bElapsed, mStart, mEnd, mElapsed, qStart, qEnd, qElapsed; // declaring the variable
       
        System.out.println();// Blank Line
        
          
                                
                                
                    iStart = System.nanoTime(); // records times
         InsertionSort.InsertionSort(Array,ArrayLength);
     int[] d = ArrayUtil.randomIntArray(ArrayLength,ArrayLimit); // creates random array in a
        iEnd = System.nanoTime(); // Claculates time in nano seconds
        iElapsed = iEnd - iStart; // calculates time       
        System.out.println("The Insertion Sort algorithm took: - " + iElapsed + " nanoseconds"); // prints the time taken
        System.out.println(); // Blank Line

 
        
                int[] e = ArrayUtil.randomIntArray(ArrayLength,ArrayLimit); // creates random array in a
        bStart = System.nanoTime(); // calculates time
         binary.binarySearch(Array,Array[0],Array[(Array.length)-1],SearchTarget);
        bEnd = System.nanoTime(); // Sets the time to nano seconds
        bElapsed = bEnd - bStart;  // Calculates the time taken by binary search 
        System.out.println("The Binary Search algorithm took: - " + bElapsed + " nanoseconds"); // Prints out the time taken
        System.out.println(); // Blank Line
        
        int[] f = ArrayUtil.randomIntArray(ArrayLength,ArrayLimit); // creates random array in f
        mStart = System.nanoTime(); // calculates time

        mEnd = System.nanoTime(); // sets time to nano seconds
        mElapsed = mEnd - mStart; // calculates the time taken 
       

        
        
        
        }
        
    }
}

