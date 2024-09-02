import java.util.*;

class Assign5_5{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of multiples : ");
        int mul = sc.nextInt();

        for(int i = 1; i <= mul; i++){
            
            System.out.println(i*n);
        }
    }
}