import  java.util.*;
public class Assignment_16_2 
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

        iRet = nobj.Minimum(no);

        System.out.println("Largest no in this are : "+iRet);
    }
}  

class Number 
{
    public int Minimum(int Arr[])
    {
        int Smallest= Arr[0];
        for(int i = 1; i< Arr.length; i++)
        {
            if(Arr[i] < Smallest)
            {
                Smallest = Arr[i];
            }
        }
        return Smallest;
    }
}