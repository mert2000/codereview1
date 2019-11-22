import java.util.Scanner;

public class Coderevfour {
    public static void main(String[] args) {
        double a,b,perimeter,area;
        System.out.println("SQUARE AREA CALCULATION");
        System.out.println("WRITE ONE LENGTH:");
        Scanner sc=new Scanner(System.in);
        a=Double.parseDouble(sc.nextLine());
        area=Math.pow(a,2);
        System.out.println("THE AREA WITH LENGTH"+" "+a+" "+"IS"+" "+area);
        System.out.println("SQUARE PERIMETER CALCULATION");
        System.out.println("WRITE ONE LENGTH:");
        Scanner sca=new Scanner(System.in);
        b=Double.parseDouble(sca.nextLine());
        perimeter=(4*b);
        System.out.println("THE PERIMETER WITH LENGTH"+" "+b+" "+"IS"+" "+perimeter);
    }
}
