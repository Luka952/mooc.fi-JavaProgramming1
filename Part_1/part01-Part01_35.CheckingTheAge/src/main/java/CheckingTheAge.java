
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int a=Integer.valueOf(scan.nextLine());
        
        if(a<0){
            System.out.println("Impossible!");
        }else if(a>120){
            System.out.println("Impossible!");
        }else{
            System.out.println("OK");
        }
    }
}
