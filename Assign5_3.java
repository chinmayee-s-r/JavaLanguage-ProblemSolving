import java.util.*;

class Assign5_3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i = -n; i <= n; i++){
            System.out.print(i + "  ");
        }
    }
}