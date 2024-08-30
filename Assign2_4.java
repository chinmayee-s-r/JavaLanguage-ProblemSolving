import java.util.*;

class Assign2_4{

    public static void Display(int n, int f){
       
        for(int i = 0; i < f; i++){
            System.out.print(n + "      ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int iNo = sc.nextInt();

        System.out.print("Enter frequency : ");
        int iFreq = sc.nextInt();

        Display(iNo, iFreq);
    }
}