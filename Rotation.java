/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author MAHADEV
 */
public class ArrayRotation {
    void arrayRotation(int arr[],int d,int size)
    {
        int index=0;
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
          
        }
         /* for(int j:temp) this is for check value of temp array which is 1 and 2
            {
                System.err.println(j);
            }*/
        
        for(int i=0;i<size-d;i++)
        {
       
            arr[i]=arr[i+d];
                 index++;
            
        }
       // System.out.println(index);
        for(int i=0;i<d;i++)
        {
            arr[index++]=temp[i];
                   
        }
        
        
    }
    public static void main(String arg[])

                {
                    ArrayRotation obj=new ArrayRotation();
                    int arr[]={1,2,3,4,5,6,7};
                   // System.out.println(arr.length);;
                    int size=7;
                    int d=2;
                   obj. arrayRotation(arr,d,size);
                   for(int i=0;i<size;i++)
                   {
                       System.out.println(arr[i]);
                   }
                    
                }
}
