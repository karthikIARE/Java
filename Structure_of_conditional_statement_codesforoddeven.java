import java.util.Scanner;
public class Structure_of_conditional_statement_codesforoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int Num = sc.nextInt();
        if(Num % 2 == 0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}