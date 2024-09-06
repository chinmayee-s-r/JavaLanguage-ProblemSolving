import java.util.*;

class Assign6_3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iNo = sc.nextInt();

        int iMul = 1;

        for(int i = iNo; i >= 1; i--){
            iMul *= i;
        }
        System.out.println(iMul + " is the factorial.");
    }
}