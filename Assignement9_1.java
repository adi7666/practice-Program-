import java.util.*;

public class Assignement9_1{
    public static void main(String[] args) {
     float fValue= 0.0f;
     double dRet = 0.0f;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Radius : ");
    fValue = sobj.nextFloat(); 
        
    Circle cobj = new Circle();
    dRet = cobj.CircleArea(fValue);
    System.out.println("Area is : " +dRet );
    }
}

class Circle
{
    double CircleArea(float fRadius)
    {
        float PI = 3.14f;
        double Area = PI * fRadius * fRadius ;

        return Area;
    }
}
