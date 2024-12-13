import java.util.*;

public class Assignement9_4{
    public static void main(String[] args) {
    float fValue= 0.0f;
    
    double dRet = 0.0f;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter your Celcius : ");
    fValue = sobj.nextInt(); 

    CalcTemp robj = new CalcTemp();
    dRet = robj.FhtoCS(fValue);
    System.out.println("Distance is :  "+dRet );
    }
}

class CalcTemp
{
    float FhtoCS(float  fTemp)
    {
        float CelciusX = (fTemp - 32) * 5/9 ;
        return CelciusX;
    }
}
