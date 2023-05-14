import java.util.Scanner;
//Addition Of Two Numbers In Java Using Method
//Java Program To Multiply Two Numbers Using Method
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println(sum);
        int prod = product(a,b);
        System.out.println(prod);
    }
    static int sum(int a,int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }
    static int product(int a,int b){
        int prod = 0;
        prod = a*b;
        return prod;
    }
}
