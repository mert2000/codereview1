import java.util.Scanner;

public class Codereview_criteria_one_two_three_four {
    public static void main(String[] args) {
            System.out.println("|||||||||                                                              ||||||||||");
            System.out.println(" |||||||                                                               |||||||||");
            System.out.println("  |||||    !!THIS Project was made with the criteria 1,2,3 and 4         ||||||");
            System.out.println("   ***                                                                    ***");
            System.out.println("    **                                                                      *");

            double a, b, c, d,recar, squar;
            String ans, ans2,ans3, x,y;
            System.out.println("---RECTANGULAR AREA CALCULATION---");
            System.out.println("PLEAS ENTER THE HEIGHT");
            Scanner sc = new Scanner(System.in);
            a = Double.parseDouble(sc.nextLine());
            System.out.println("NOW ENTER THE WIDTH");
            Scanner sca = new Scanner(System.in);
            b = Double.parseDouble(sc.nextLine());
            System.out.println("WENN SIE ES OHNE CLASSEN AUF RUF SEHEN WOLLEN DAN SCHREIBEN SIE JA WENN SIE ES NICHT MÖCHTEN DAN NEIN");
            Scanner scannerrr=new Scanner(System.in);
            ans3=scannerrr.nextLine();
            //RECTANGLE AREA WITH CLASS AND WITHOUT CLASS
            if (ans3.equals("JA")||ans3.equals("ja")||ans3.equals("JA!")||ans3.equals("ja!")||ans3.equals("Ja")||ans3.equals("Ja!")||ans3.equals("j")||ans3.equals("J"))
            {
                //OHNE CLASS
                System.out.println("Ohne Class");
                double recarea=a*b;
                System.out.println("THE RECTANGULAR AREA OF" + " /" + "HEIGHT:" + a + "/ " + "AND" + " /" + "WIDTH:" + b + "/ " + "IS" + " " + recarea + "CM");
            }
            else if (ans3.equals("NEIN")||ans3.equals("NEİN")||ans3.equals("NEIN!")||ans3.equals("NEİN!")||ans3.equals("Nein")||ans3.equals("Nein!")||ans3.equals("n")||ans3.equals("N")) {
                //MIT CLASS
                System.out.println("Mit Class");
                double rcar = two(a, b);
                System.out.println("THE RECTANGULAR AREA OF" + " /" + "HEIGHT:" + a + "/ " + "AND" + " /" + "WIDTH:" + b + "/ " + "IS" + " " + rcar + "CM");
            }
            //PERIMETER AREA SQUARE
            System.out.println("---DO YOU WANT TO CALCULATE THE AREA AND THE PERIMETER OF A SQUARE ?");
            System.out.println("Write [YES] or [NO]");
            Scanner scan = new Scanner(System.in);
            ans = scan.nextLine();
            if (ans.equals("YES") || ans.equals("yes") || ans.equals("Yes") || ans.equals("[YES]") || ans.equals("[yes]") || ans.equals("[Yes]"))
            {
                System.out.println("---DO YOU WANT FIRST THE AREA OR THE PERIMETER?---");
                System.out.println("ENTER AREA OR PERIMETER");
                Scanner scann = new Scanner(System.in);
                ans2 = scann.nextLine();
                //SQUARE AREA
                if (ans2.equals("area") || ans2.equals("AREA") || ans2.equals("Area")) {
                    System.out.println("---AREA CALCULATION OF SQUARE---");
                    System.out.println("PLEAS ENTER THE SIDE");
                    Scanner scanne = new Scanner(System.in);
                    c = Double.parseDouble(sc.nextLine());
                    double mul=go(c);
                    System.out.println("THE AREA:" + mul);
                    System.out.println("DO YOU WANT TO CALCULATE THE PERIMETER? ENTER YES OR NO");
                    Scanner cl = new Scanner(System.in);
                    x = cl.nextLine();
                    if (x.equals("yes")||x .equals("Yes")||x .equals("YES"))
                    {
                        //PERIMETER CALCULATION AFTER YES NO QUESTION IF IT WAS ENTERED YES QUESTION AT 53
                        System.out.println("---PERIMETER CALCULATION OF SQUARE---");
                        System.out.println("PLEAS ENTER THE SIDE");
                        Scanner scanner = new Scanner(System.in);
                        d = Double.parseDouble(sc.nextLine());
                        double sum = add(d);
                        System.out.println(""+sum);
                        System.out.println("I HOPE IT WAS HELPFUL");
                    }
                    // CALCULATION STOPS AFTER YES NO QUESTION IF IT WAS ENTERED NO AT 53
                    else if (x.equals("NO")||x.equals("no")||x.equals("No")||x.equals("N0"))
                    {
                        System.out.println("I HOPE IT WAS HELPFUL");
                    }
                    //ELSE-IF 56 OUT OF YES NO INPUT
                    else
                    {
                        System.out.println("Error NOT INVALID INPUT");
                    }
                }
                //IF YOU ENTER YES AT 54
                else if (ans2.equals("PERIMETER")||ans2.equals("Perimeter") || ans2.equals("perimeter")||ans2.equals("PERİMETER")||ans2.equals("perımeter"))
                {
                    System.out.println("---PERIMETER CALCULATION OF SQUARE---");
                    System.out.println("PLEAS ENTER THE SIDE");
                    Scanner scanner = new Scanner(System.in);
                    d = Double.parseDouble(sc.nextLine());
                    double sum = add(d);
                    System.out.println(""+sum);
                    System.out.println("DO YOU WANT TO CALLCULATE THE AREA TOO? ENTER YES OR NO");
                    Scanner scanner2=new Scanner(System.in);
                    y=scanner2.nextLine();
                    if (y.equals("NO")||y.equals("no")||y.equals("No")||y.equals("N0"))
                    {
                        //IF YOU ENTER NO AT 88
                        System.out.println("I HOPE IT WAS HELPFUL");
                    }
                    else if (y.equals("yes")||y.equals("Yes")||y.equals("YES"))
                    {
                        //IF YOUR ENTER YES AT 88
                        System.out.println("---AREA CALCULATION OF SQUARE---");
                        System.out.println("PLEAS ENTER THE SIDE");
                        Scanner scanne = new Scanner(System.in);
                        c = Double.parseDouble(sc.nextLine());
                        double mul=go(c);
                        System.out.println("THE AREA:" + mul);
                        System.out.println("I HOPE IT WAS HELPFUL");
                    }
                    else
                    {
                        System.out.println("Error NOT INVALID INPUT");
                    }
                }
            }
            else if (ans.equals("NO") || ans.equals("no") || ans.equals("No") || ans.equals("[NO]") || ans.equals("[no]") || ans.equals("[No]"))
            {
                //IF YOU ENTER NO AT 20
                System.out.println("THAN SEE YOU SOON");
            }
        }
        public static double add(double d) {
            double persqu;
            persqu=(d*4);
            return persqu;
        }
        public static  double go(double c)
        {
            double squar;
            squar = (int) Math.pow(c, 2);
            return squar;
        }
        public static double two(double a,double b)
        {
            double aundb;
            aundb=a*b;
            return aundb;
        }
    }
