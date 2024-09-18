import java.util.Scanner;
public class Structure_of_conditional_statement_codesfor_elseif {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the f_st Number : ");
    // Check whether Given integer is greater or smaller or equal to each other
    int f_st = sc.nextInt();
    System.out.println("Enter the s_nd Number : ");
    int s_nd = sc.nextInt();
    if(f_st>s_nd){
        System.out.println("f_st is greater than s_nd");
    }else if(s_nd>f_st){
        System.out.println("s_nd is greater than f_st");
    }else{
        System.out.println("Enter the valid number");
    }
}
}
