package staticMethod;

import java.util.Scanner;

public class BusinessMan {

    float p,r,t,si;



void acceptInput()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the principal amount");
    p = scan.nextFloat();
    System.out.println("Enter the duration");
    t = scan.nextFloat();
    r = 2.5F;
}
void compute()
{
    si = (p*t*r)/100;

}
void disp()
{
    System.out.print(si);
}
}

