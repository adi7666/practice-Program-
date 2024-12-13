import java.util.Scanner;

public class Assignement12_4
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
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        int iSum =1;
        while(iNo > 0)
        {
            
            
            iSum = iSum * (iNo % 10);
            
            iNo = iNo /10;
        }
        return  iSum;
    }
}
