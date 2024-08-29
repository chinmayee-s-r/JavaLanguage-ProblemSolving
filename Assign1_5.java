import java.util.*;

class Assign1_5{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String c = sc.next();

        System.out.print("Enter no. of characters : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(c + " ");
        }
    }
}