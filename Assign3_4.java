import java.util.*;

class Assign3_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c1 = sc.next().charAt(0);
        char c2;

        if (c1 >= 'A' && c1 <= 'Z') {
            c2 = (char)(c1 + 32);
            System.out.println("Flipped case: " + c2);
        } 
        else if (c1 >= 'a' && c1 <= 'z') {
            c2 = (char)(c1 - 32);
            System.out.println("Flipped case: " + c2);
        } 
        else {
            System.out.println("Character remains the same: " + c1);
        }
    }
}
