import java.util.Scanner;

public class Assignement12_2
{
    public static void main(String[] args) {
    int iValue1= 0;
    
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter NUmber : ");
    iValue1 = sobj.nextInt(); 
            
    CountDigit cobj = new CountDigit();
    int iRet = cobj.CountOdd(iValue1);
    System.out.println("No of 2 in this are : "+iRet);
    }
}

class CountDigit
{
    int CountOdd(int iNo)
    {
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        int iCount =0;
        while(iNo > 0)
        {
            
            iDigit = iNo % 10;
            if(iDigit % 2 != 0)
            {
                iCount++;
            }
            
            iNo = iNo /10;
        }
        return  iCount;
    }
}
