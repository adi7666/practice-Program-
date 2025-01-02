import  java.util.*;



public class Assignment_13_5 {

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

        nobj.CountDivisible(no, iSize);
    }
}
class Numbers
{
    public void CountDivisible(int[] arr, int iLength)
    {
        int iCount =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % 11 == 0)
            {
                System.out.println("The nos are : "+arr[i]);
            }
        }
    }
}