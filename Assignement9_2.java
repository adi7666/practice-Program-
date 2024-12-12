import java.util.*;

public class Assignement9_2{
    public static void main(String[] args) {
     float fValue= 0.0f;
    float fValue2 =0.0f;
     double dRet = 0.0f;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Width : ");
    fValue = sobj.nextFloat(); 

    System.out.println("Enter Height : ");
    fValue2 = sobj.nextFloat();
        
    RectangleArea robj = new RectangleArea();
    dRet = robj.RectArea(fValue, fValue2);
    System.out.println("Area is : " +dRet );
    }
}

class RectangleArea
{
    double RectArea(float fwidth, float fheight)
    {
        double Area =  fwidth * fheight ;

        return Area;
    }
}
