import java.util.*;

public class Assignement9_3{
    public static void main(String[] args) {
    int iValue= 0;
    
    int iRet = 0;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Distance : ");
    iValue = sobj.nextInt(); 

    CalcDistance robj = new CalcDistance();
    iRet = robj.RectArea(iValue);
    System.out.println("Distance is :  "+iRet+ "Mtr" );
    }
}

class CalcDistance
{
    int RectArea(int iNo)
    {
        int km =  iNo * 1000 ;

        return km;
    }
}
