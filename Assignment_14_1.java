import  java.util.*;



public class Assignment_14_1 {

    public static void main(String [] a)
    {
        int iSize = 0, iRet = 0, iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter the number ELements : ");
        iSize = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter elements are ");
        for(iCnt = 0; iCnt <iSize; iCnt ++)
        {
            
            no[iCnt]= sobj.nextInt();
        }

        Numbers nobj = new Numbers();
        iRet =nobj.FreqEven(no, iSize); 
        System.out.println("Result is : "+iRet);
    }
}
class Numbers
{
    public int FreqEven(int[] arr, int iLength)
    {
        int iCount =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}