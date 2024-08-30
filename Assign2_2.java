import java.util.*;

class Assign2_2{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String c = sc.next();

        System.out.print("Enter no. of characters : ");
        int n = sc.nextInt();

        while(n > 0){
            System.out.print(c + "   ");
            n--;
        }
    }
}