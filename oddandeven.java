import java.util.Scanner;
public class oddandeven {
    public static void main(String[] args){
        // odd || even should be proved
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int Num1 = sc.nextInt();
        if(Num1%2 == 0){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Odd Numbers");
        }
    }
}
