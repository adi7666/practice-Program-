import  java.util.*;
public class Assignment_14_3 {
    public static void main(String [] a)
    {
        int iSize = 0, iCnt = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter the number ELements : ");
        iSize = sobj.nextInt();

        int [] no = new int[iSize];
        System.out.println("Enter elements are ");
        for(iCnt = 0; iCnt <iSize; iCnt ++)
        {
            
            no[iCnt]= sobj.nextInt();
        }

        Numbers nobj = new Numbers();
        bRet =nobj.Frequency(no, iSize); 
        if(bRet){
            System.out.println("11 is present ");
        }
        else{
            System.out.println("11 is not present");
        }
        
    }

}
class Numbers
{

    public boolean Frequency(int[] no, int iLength)
    {
        boolean bflag = false;
        for(int i =0; i<no.length;i++)
        if(no[i] == 11)    
        {
            bflag = true;
            break;
        }
        
        return bflag;
    }
}