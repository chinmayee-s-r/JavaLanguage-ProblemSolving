import java.util.*;

class Assign4_4{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int iSum = 0;

        for(int i = 1; i <= n; i++){

            if(n % i != 0){
                System.out.print(i + "  ");
                iSum += i;
            }
        }
        System.out.println("\n" + iSum + " is sum of all non-factors.");
    }
}