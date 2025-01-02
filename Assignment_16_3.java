import  java.util.*;
public class Assignment_16_3 
{
    public static void main(String [] a)
    {
        int iSize  = 0, iCnt = 0 , iRet = 0;
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

        iRet = nobj.DiffernceBtwn(no);

        System.out.println("Difference between Largest And smallest no in this are : "+iRet);
    }
}  

class Number 
{
    public int DiffernceBtwn(int Arr[])
    {
        int Diff = 0,Smallest= Arr[0] , Largest = Arr[0];
        for(int i = 1; i< Arr.length; i++)
        {
            if(Arr[i] < Smallest)
            {
                Smallest = Arr[i];
            }
            if(Arr[i] > Largest)
            {
                Largest = Arr[i];
            }


        }
        Diff = Largest - Smallest;
        return Diff;
    }
}