import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        isPrime(a,b);
    }
    static void isPrime(int a,int b){
        int c;
        for(int i = a;i<=b;i++){
            if(i == 1 || i==0){
                continue;
            }
            c=  1;
            for(int j = 2;j<=i/2;j++){
                if(i%j == 0){
                    c = 0;
                    break;
                }
            }
            if(c == 1){
                System.out.print(i+" ");
            }
        }
    }
}
