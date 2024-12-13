import java.util.*;

public class Assignement11_1
{
    public static void main(String[] args) {
    int iValue1= 0;
    
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter NUmber : ");
    iValue1 = sobj.nextInt(); 
            
    Digit cobj = new Digit();
    cobj.DisplayDigit(iValue1);
  
    }
}

class Digit
{
    void DisplayDigit(int iNo)
    {
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo /10;
        }
    }
}
