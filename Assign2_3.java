import java.util.*;

class Assign2_3{

    public static void Display(int n){
       
        if(n < 10){
            System.err.println("Hello");
        }
        else{
            System.out.println("Demo");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int iNo = sc.nextInt();

        Display(iNo);
    }
}