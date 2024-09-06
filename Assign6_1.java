import java.util.*;

class Assign6_1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iNo = sc.nextInt();

        if(iNo < 50){
            System.out.println("Small");
        }
        else if(iNo >= 50 && iNo < 100){
            System.out.println("Medium");
        }
        else if(iNo >= iNo){
            System.out.println("Large");
        }
    }
}