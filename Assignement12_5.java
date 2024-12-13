import java.util.Scanner;

public class Assignement12_5
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
        int iCountEven =0, iCountOdd = 0, iSum = 0;
        while(iNo > 0)
        {
            
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iCountEven = iCountEven + iDigit;
            }
            else if(iDigit % 2 != 0)
            {
                iCountOdd = iCountOdd + iDigit;
            }

            iSum = iCountEven - iCountOdd;
            
            iNo = iNo /10;


        }

        return iSum;
    }
}
