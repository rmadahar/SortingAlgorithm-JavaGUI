/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithmgui;

/**
 *
 * @author Rajin Madahar
 */
public class quickSort
{
public static void quickSort (int[] a, int lo, int hi)
{
//  lo is the lower index, hi is the upper index
//  of the region of array a that is to be sorted
    int i=lo, j=hi, h;
    int x=a[(lo+hi)/2];

    //  partition
    do
    {    
        while (a[i]<x) i++; 
        while (a[j]>x) j--;
        if (i<=j)
        {
            h=a[i]; a[i]=a[j]; a[j]=h;
            i++; j--;
        }
    } while (i<=j);

    //  recursion
    if (lo<j) quickSort(a, lo, j);
    if (i<hi) quickSort(a, i, hi);
}
}



 
