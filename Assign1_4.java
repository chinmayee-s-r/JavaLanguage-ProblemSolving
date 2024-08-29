import java.util.*;

class Assign1_4{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend : ");
        int iDiv = sc.nextInt();

        System.out.print("Enter the divisor : ");
        int iNo = sc.nextInt();

        if(iNo == 0){
            System.out.println("Division by 0 is not defined.");
        }
        else if(iDiv == 0){
            System.out.println("0 cannot be the Dividend.");
        }
        else if(iDiv % iNo == 0){
            System.out.println(iDiv + " is divisible by " + iNo + ".");
        }
        else{
            System.out.println(iDiv + " is NOT divisible by " + iNo + ".");
        }
    }
}