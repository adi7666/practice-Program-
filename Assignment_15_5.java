import  java.util.*;
public class Assignment_15_5 {
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

        iRet = nobj.CalcProduct(no);

        System.out.println("product of all odd are : "+iRet);
        
    }

}
class Numbers
{
  public int CalcProduct(int[] no)
    {
        int prod =1;
        for(int i =no.length-1; i>=0; i--)
        {
            if(no[i] %2 != 0)    
            {
                prod *= no[i];
            }
        }
        return prod;
    }
}