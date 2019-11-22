import java.util.Scanner;

public class Coderevthree {
    public static void main(String[] args)
    {
        int read1=calculateRectArea(30,20,0,0);
        int read2=calculateRectArea(0,0,50,40);
        System.out.println("Height1 and width1 solution:"+" "+read1+" "+"Height2 and width2 solution:"+" "+read2);


    }
    public static int calculateRectArea(int height1,int width1,int height2, int width2)
    {
        int sum,sum1;
        if (height1==30 && width1==20)
        {
            sum = height1 * width1;
            return sum;
        }

        else
        {
            sum1 = height2 * width2;
            return sum1;
        }
    }
}
