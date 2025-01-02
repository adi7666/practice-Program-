import java.util.Scanner;

public class Assignement13_1
{
    public static void main(String[] args) {
    int iLength = 0, iRet = 0;
    
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter Number of Element : ");
    iLength = sobj.nextInt();
    
    ArrayX aobj = new ArrayX(iLength);
    aobj.Accept();
    
    iRet = aobj.Differnce();
    System.out.println("Summation is : " +iRet);
    
    }
}    

class ArrayX
{
    public int Arr[];
    public ArrayX(int iSize)
    {
        Arr = new int[iSize];

    }

    public void Accept()
    {
        int i =0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the ELements : ");
        
        for(i = 0; i <  Arr.length; i++){
            Arr[i] = sobj.nextInt();
        }
    }

    public int Differnce()
    {
        int i = 0 , iSum =0;
        int iCntE = 0, iCntO = 0;
        for(i = 0; i< Arr.length; i++)
        {
            if(Arr[i] % 2 == 0 )
            {
                iCntE = iCntE + Arr[i];
            }
            else if(Arr[i] %2 != 0)
            {
                iCntO = iCntO + Arr[i];
            }

            iSum = iCntE - iCntO;

        }
        return iSum;
    }


}