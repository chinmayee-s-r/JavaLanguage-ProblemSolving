import java.util.*;

class Assign4_1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int iMul = 1;

        for(int i = 1; i <= n/2; i++){

            if(n % i == 0){
                iMul *= i;
            }
        }
        System.out.println("The product of factors is " + iMul);
    }
}