import java.util.Scanner;
public class Structure_of_conditional_statement_codesforagetovote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int Age = sc.nextInt();
        if(Age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
}