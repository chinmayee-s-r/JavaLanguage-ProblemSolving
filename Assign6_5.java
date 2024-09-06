import java.util.*;

class Assign6_5{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for table : ");
        int iNo = sc.nextInt();

        int iProd = 1;

        for(int i = 10; i >= 1; i--){
            iProd = iNo * i;
            System.out.println(iNo + " X " + i + " = " + iProd);
        }
    }
}