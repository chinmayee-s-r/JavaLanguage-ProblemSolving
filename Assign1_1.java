import java.util.*;

class Assign1_1{

    public static double Div(double a, double b){

        double dQ = a/b;
        return dQ;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double No1 = 1;
        double No2 = 1;

        System.out.println("Enter Dividend : ");
        No1 = sc.nextDouble();

        System.out.println("Enter Divisor : ");
        No2 = sc.nextDouble();

        double dRet = Div(No1, No2);

        System.out.println("Quotient is : " + dRet);
    }
}