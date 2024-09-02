import java.util.*;

class Assign3_5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char c = sc.next().charAt(0);

        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c + " is a Vowel.");
            }
            else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                System.out.println(c + " is a Vowel.");
            }
            else{
                System.out.println(c + " is a Consonant.");
            }
        }

        else{
            System.out.println("This is not an alphabet.");
        }
    }
}
