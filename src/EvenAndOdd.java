import java.util.Scanner;

public class EvenAndOdd {
//    Java Program to Check if a Given Integer is Odd or Even
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
