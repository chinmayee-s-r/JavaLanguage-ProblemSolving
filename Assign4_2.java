import java.util.*;

class Assign4_2{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = n/2; i >= 1; i--){

            if(n % i == 0){
                System.out.print(i + "  ");;
            }
        }
    }
}