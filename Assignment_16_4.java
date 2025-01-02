import  java.util.*;
public class Assignment_16_4
{
    public static void main(String [] a)
    {
        int iSize  = 0, iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter no elements : ");
        iSize = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            no[iCnt] = sobj.nextInt();
        }

        Number nobj = new Number();

         nobj.Digits(no);

        System.out.println(" ");
    }
}  

class Number 
{
   public void Digits(int [] arr)
   {
        System.out.println("Difference between Largest And smallest no in this are :");
        for(int i =0 ; i < arr.length; i++)
        {
            if(arr[i] >= 100 && arr[i] <= 999)
            {
                System.out.println(arr[i]);
            }
        }
   }
}