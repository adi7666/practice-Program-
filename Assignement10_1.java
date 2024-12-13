import java.util.*;

public class Assignement10_1{
    public static void main(String[] args) {
    int iValue1= 0;
    int iValue2 = 0;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Starting point : ");
    iValue1 = sobj.nextInt(); 
    
    System.out.println("Enter Ending point : ");
    iValue2 = sobj.nextInt();        
    Rangef cobj = new Rangef();
    cobj.CircleArea(iValue1, iValue2);
  
    }
}

class Rangef
{
    void CircleArea(int iNo1, int iNo2)
    {
        while(iNo1 < iNo2)
        {
            System.out.println(iNo1++);
        }
        if(iNo1 > iNo2)
        {
            System.out.println("Invalid Range");
        }
    }
}
