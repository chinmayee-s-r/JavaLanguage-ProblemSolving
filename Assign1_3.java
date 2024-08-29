import java.util.*;

class Assign1_3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter upper limit : ");
        int u = sc.nextInt();

        System.out.print("Enter lower limit : ");
        int l = sc.nextInt();

        for(int i = u; i >= l; i--){
            System.out.println(i);
        }
    }
}