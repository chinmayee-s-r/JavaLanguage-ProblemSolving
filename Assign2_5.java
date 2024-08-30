import java.util.*;

class Assign2_5{

    public static boolean Display(int n){
       
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int iNo = sc.nextInt();

        boolean bRet = Display(iNo);

        if(bRet == true){
            System.out.println("EVEN number");
        }
        else{
            System.out.println("ODD number");
        }
    }
}