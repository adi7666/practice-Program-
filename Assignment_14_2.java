import  java.util.*;
public class Assignment_14_2 {
    public static void main(String [] a)
    {
        int iSize = 0, iRet = 0, iCnt = 0;
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
        iRet =nobj.Frequency(no); 
        System.out.println("Result is : "+iRet);
    }

}
class Numbers
{
    public int Frequency(int[] no)
    {
        int iCnt = 0, iCntE =0, iCntO =0;
        for(int i =0; i<no.length;i++){
            if(no[i] %2 == 0){
                iCntE++;
            }
            if(no[i] % 2 != 0)
            {
                iCntO++;
            }
        }
        iCnt = iCntE - iCntO;
        return iCnt;
    }
}