import java.util.Scanner;

public class Pythagores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a*a+b*b) == c*c || (a*a+c*c) == b*b || (b*b+c*c) == a*a){
            System.out.println("it is a pythagores triplet");
        }
        else{
            System.out.println("it is not a pythagores triplet");
        }
    }
}
