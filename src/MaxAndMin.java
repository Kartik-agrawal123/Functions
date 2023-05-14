import java.util.Scanner;
//Write a Program to find the Maximum and Minimum of the Given Three Numbers.

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = maximum(a,b,c);
        int min = minimum(a,b,c);
        System.out.println(max+" "+min);
    }
    static int maximum(int a,int b,int c){
        int max = 0;
        if(a>b && a>c){
            max = a;
        }
        else if(b>a && b>c){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }
    static int minimum(int a,int b,int c){
        int min = 0;
        if(a<b && a<c){
            min = a;
        }
        else if(b<a && b<c){
            min = b;
        }
        else {
            min = c;
        }
        return min;
    }
}
