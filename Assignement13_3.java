import java.util.Scanner;

public class Assignement13_3
{
    public static void main(String[] args) {
    int iLength = 0, iRet = 0;
    
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Number of Element : ");
    iLength = sobj.nextInt();
    
    ArrayX aobj = new ArrayX(iLength);
    aobj.Accept();
    
    aobj.CountDivisible();
    }
}    

class ArrayX
{
    public int Arr[];
    public ArrayX(int iSize){
    Arr = new int[iSize];}

    

    public void Accept()
    {
        int i =0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the ELements : ");
        
        for(i = 0; i <  Arr.length; i++){
            Arr[i] = sobj.nextInt();
        }
    }

    public void CountDivisible()
    {
        int iCnt =0;
        for(int i = 0; i<Arr.length; i++)
        {
            if(Arr[i] % 5 ==0 && Arr[i] % 2 == 0)
            {
               System.out.println("Divisible no is "+Arr[i]);
            }
        }
        
    }

}
