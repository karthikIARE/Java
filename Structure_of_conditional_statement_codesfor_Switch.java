import java.util.Scanner;
public class Structure_of_conditional_statement_codesfor_Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Button : ");
        int Button = sc.nextInt();
        switch(Button){
            case 1 :
            System.out.println("Namaste");
            break;
            case 2 :
            System.out.println("Hi");
            break;
            case 3 :
            System.out.println("Em ra yetla unnav Anth manchga ney na ??");
            break;
            default :
            System.out.println("Enter the perfect value that can be valid atleast for one case ");
        }
    }
}
