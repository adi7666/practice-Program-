import  java.util.*;
public class Assignment_15_3 {
    public static void main(String [] a)
    {
        int iSize = 0, iCnt = 0, iRet= 0, iValue =0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the no : ");
        iValue = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            no[iCnt] = sobj.nextInt();
        }
        
        Numbers nobj = new Numbers();

        iRet = nobj.Freq(no, iValue);
        if(iRet != -1){
        System.out.println("The frequency of this no is  "+iRet);
        }
        else
        {
            System.out.println("Number not found in array .");
        }
    }

}
class Numbers
{
  public int Freq(int[] no, int iLength)
    {
        for(int i =no.length-1; i>=0; i--){
        if(no[i] == iLength)    
        {
            return i;
        }
        }
        return -1;
    }
}