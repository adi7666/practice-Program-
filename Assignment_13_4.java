import  java.util.*;



public class Assignment_13_4 {

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
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0)
            {
                System.out.println("The no are : "+arr[i]);
            }
        }
    }
}