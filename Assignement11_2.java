import java.util.*;

public class Assignement11_2
{
    public static void main(String[] args) {
    int iValue1= 0;
    boolean bRet = false;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter NUmber : ");
    iValue1 = sobj.nextInt(); 
            
    Digit cobj = new Digit();
    bRet = cobj.ChkZero(iValue1);
    if(bRet)
    {
        System.out.print("It Cantain Zero");
    }
    else
    {
        System.out.println("There is no zero");
    }
    }
}

class Digit
{
    boolean ChkZero(int iNo)
    {
        boolean cntnZero = false;
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                cntnZero = true;
                break;
            }
        
            iNo = iNo /10;

        }
        return cntnZero;

    }
}
