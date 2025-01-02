import  java.util.*;
public class Assignment_15_4 {
    public static void main(String [] a)
    {
        int iSize = 0, iCnt = 0, iRet= 0, iStart =0 , iEnd = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the Starting no : ");
        iStart = sobj.nextInt();

        System.out.println("Enter the ending no : ");
        iEnd = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            no[iCnt] = sobj.nextInt();
        }
        
        Numbers nobj = new Numbers();

         nobj.Range(no, iStart, iEnd);
        
    }

}
class Numbers
{
  public void Range(int[] no, int iStart, int iEnd)
    {
        for(int i =no.length-1; i>=0; i--){
        if(no[i] > iStart && no[i]< iEnd)    
        {
            System.out.print("The no are : "+no[i]+ "\t");            
        }
        }

    }
}