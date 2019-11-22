import java.util.Scanner;

public class Coderevone {
    public static void main(String[] args)
        {
            //CRITERIA 1 AND 2
            System.out.println("THE CRITERIA I USED THERE ARE 1 AND 2");
            double a, b,area;
            System.out.println("---RECTANGULAR AREA CALCULATION---");
            System.out.println("PLEAS ENTER THE HEIGHT");
            Scanner sc = new Scanner(System.in);
        a = Double.parseDouble(sc.nextLine());
        System.out.println("NOW ENTER THE WIDTH");
        Scanner sca = new Scanner(System.in);
        b = Double.parseDouble(sc.nextLine());
        area=a*b;
        System.out.println("The Area Is="+" "+area+" "+"cm");
    }
}
