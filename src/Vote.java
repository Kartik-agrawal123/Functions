import java.util.Scanner;
//Voting Age Program in Java
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(eligible(age));
    }
    static boolean eligible(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
}
