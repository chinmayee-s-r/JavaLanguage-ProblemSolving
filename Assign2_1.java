import java.util.*;

class Assign2_1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String c = sc.next();

        System.out.print("Enter no. of characters : ");
        int n = sc.nextInt();

        int i = 0;
        while(i < n){
            System.out.print(c + "   ");
            i++;
        }
    }
}