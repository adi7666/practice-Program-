import  java.util.*;
public class Assignment_14_5 {
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

        System.out.println("The frequency of this no is  "+iRet);
    }

}
class Numbers
{


    public int Freq(int[] no, int iLength)
    {
        int iCnt=0;
        for(int i =0; i<no.length;i++){
        if(no[i] == iLength)    
        {
            iCnt++;
        }
        }
        return iCnt;
    }
}