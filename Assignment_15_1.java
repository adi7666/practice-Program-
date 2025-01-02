import  java.util.*;
class Assignment_15_1 {
    public static void main(String [] a)
    {
        int iSize = 0, iCnt = 0, iValue = 0; 
        boolean bRet = false;
        Scanner sobj =new  Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the no : ");
        iValue = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter the elements");
        for(iCnt = 0; iCnt<iSize; iCnt++)
        {
            no[iCnt] = sobj.nextInt();
        }

        Numbers nobj =new Numbers();
        bRet = nobj.CheckNo(no, iValue);
        if(bRet)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        
    }

}
class Numbers
{
    public boolean CheckNo(int [] no, int iLength)
    {
        boolean bflag= false;
        for(int i = 0; i<no.length;i++)
        {
            if(no[i] == iLength)
            {
                bflag = true;
                break;
            }
        }
        return bflag;
    }
}