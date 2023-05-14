import java.util.Scanner;
//Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String s = findGrade(marks);
        System.out.println(s);
    }
    static String findGrade(int marks){
        String s = "";
        if(marks>=91 && marks<=100){
            s = "AA";
        }
        if(marks>=81 && marks<=90){
            s = "AB";
        }
        if(marks>=71 && marks<=80){
            s = "BB";
        }
        if(marks>=61 && marks<=70){
            s = "BC";
        }
        if(marks>=51 && marks<=60){
            s = "CD";
        }
        if(marks>=41 && marks<=50){
            s = "DD";
        }
        if(marks<=40){
            s = "Fail";
        }
        return s;
    }
}
