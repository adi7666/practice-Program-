import  java.util.*;
public class Assignment_14_4 {
    public static void main(String [] a)
    {
        int iSize = 0, iCnt = 0, iRet= 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        iSize = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            no[iCnt] = sobj.nextInt();
        }
        
        Numbers nobj = new Numbers();

        iRet = nobj.Freq(no);

        System.out.println("The no is "+iRet);
    }

}
class Numbers
{

    public int Freq(int[] no)
    {
        int iCnt=0;
        for(int i =0; i<no.length;i++){
        if(no[i] == 11)    
        {
            iCnt++;
        }
        }
        return iCnt;
    }
}