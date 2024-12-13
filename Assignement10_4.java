import java.util.*;

public class Assignement10_4{
    public static void main(String[] args) {
    int iValue1= 0;
    int iValue2 = 0;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Starting point : ");
    iValue1 = sobj.nextInt(); 
    
    System.out.println("Enter Ending point : ");
    iValue2 = sobj.nextInt();        
    Rangef cobj = new Rangef();
    int iRet = cobj.CircleArea(iValue1, iValue2);
    System.out.println("Sum is the Number : "+iRet);

    }
}

class Rangef
{
    int CircleArea(int iNo1, int iNo2)
    {
        int sum =0 ;
        for(int i = iNo1; i <= iNo2; i++)
        {
           if(i % 2 == 0 )
           {
            sum=sum +i;
           } 
           
        }
        if(iNo1 > iNo2)
        {
            System.out.println("Invalid Range");
        }
        return sum;
    }
}
