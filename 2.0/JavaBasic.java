import java.util.*;

public class JavaBasic {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

    }
}