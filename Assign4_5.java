import java.util.*;

class Assign4_5{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int iSumNonF = 0;
        int iSumF = 0;

        System.out.println("Non-Factors are : ");
        for(int i = 1; i <= n; i++){

            if(n % i != 0){
                System.out.print(i + "  ");
                iSumNonF += i;
            }
        }
        System.out.println("Sum of Non-Factors : " + iSumNonF);

        System.out.println("Factors are : ");
        for(int i = 1; i <= n; i++){

            if(n % i == 0){
                System.out.print(i + "  ");
                iSumF += i;
            }
        }
        System.out.println("Sum of Factors : " + iSumF);

        System.out.println("Difference between non-factors and factors " + (iSumNonF - iSumF));
    }
}