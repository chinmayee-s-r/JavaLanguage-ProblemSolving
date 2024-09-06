import java.util.*;

class Assign6_2{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");

        System.out.print("Enter a singe digit number : ");
        int iNo = sc.nextInt();

        if(map.containsKey(iNo)){
            System.out.println(map.get(iNo));
        }
        else{
            System.out.println("Invalid Number.");
        }

        
    }
}