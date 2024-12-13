import java.util.*;

public class Assignement9_5{
    public static void main(String[] args) {
    int iValue= 0;
    
    double dRet = 0.0f;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Area in Square Feet : ");
    iValue = sobj.nextInt(); 

    CalcArea robj = new CalcArea();
    dRet = robj.SqureMeter(iValue);
    System.out.println("Distance is :  "+dRet );
    }
}

class CalcArea
{
    double SqureMeter(float  iValue)
    {
        double iSqrMtr = iValue * 0.092903;
        return iSqrMtr;
    }
}
