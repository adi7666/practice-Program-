import java.util.Scanner;

public class Assignement11_4
{
    public static void main(String[] args) {
    int iValue1= 0;
    
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter NUmber : ");
    iValue1 = sobj.nextInt(); 
            
    Digit cobj = new Digit();
    int iRet = cobj.DisplayDigit(iValue1);
    System.out.println("No of 2 in this are : "+iRet);
    }
}

class Digit
{
    int DisplayDigit(int iNo)
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
            if(iDigit == 4)
            {
                iCount++;
            }
            
            iNo = iNo /10;
        }
        return  iCount;
    }
}
