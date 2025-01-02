import  java.util.*;
public class Assignment_16_5
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

         nobj.SumDigits(no);

        System.out.println(" ");
    }
}  

class Number 
{
   public void SumDigits(int [] arr)
   {
        System.out.println("the no in this are :");
        int iDigit =0, Sum ;
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            
            while(num > 0) 
            {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            System.out.println(arr[i] + "-> "+ sum);
        }
    }
}