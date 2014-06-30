/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithmgui;

import javax.swing.JTextField;

/**
 *
 * @author Rajin Madahar
 */
public class binary{
public static int binarySearch(int sortedArray[], int first,int last, int key) {
   // function:
   //   Searches sortedArray[first]..sortedArray[last] for key.  
   // returns: index of the matching element if it finds key, 
   //         otherwise  -(index where it could be inserted)-1.
   // parameters:
   //   sortedArray in  array of sorted (ascending) values.
   //   first, last in  lower and upper subscript bounds
   //   key         in  value to search for.
   // returns:
   //   index of key, or -insertion_position -1 if key is not 
   //                 in the array. This value can easily be
   //                 transformed into the position to insert it.
   
   while (first <= last) {
       int mid = (first + last) / 2;  // compute mid point.
       if (key > sortedArray[mid]) 
           first = mid + 1;  // repeat search in top half.
       else if (key < sortedArray[mid]) 
           last = mid - 1; // repeat search in bottom half.
       else
           return mid;     // found it. return position /////
   }
   return - 1;    // failed to find key
}

    static int binarySearch(int[] Array, int i, int i0, JTextField SearchTarget) {
        throw new UnsupportedOperationException("Not yet implemented");
    }




private int minimumPosition(int from)
{
int minPos = from;
for (int i = from + 1; i < a.length; i++)
if (a[i] < a[minPos]) minPos = i;
return minPos;
}
/**
Swaps two entries of the array.
@param i the first position to swap
@param j the second position to swap
*/
private void swap(int i, int j)
{
int temp = a[i];
a[i] = a[j];
a[j] = temp;
}
private int[] a;
}



