import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        // 시험 점수 90~100 A, 80~89 B, 70~79 C, 60~69 D, 나머지 F
        // 첫째줄에 시험점수 주어짐, 시험점수는 0 <= score <= 100, 정수임 = double?. 
        // https://www.w3schools.com/java/java_operators.asp
        int score = 0; 
        score = myObj.nextInt();
        if (90 <= score && score <= 100){
            System.out.println ("A");
        }
        if (80 <= score && score <= 89){
            System.out.println ("B");
        }
        else if (70 <= score && score <= 79) {
            System.out.println ("C");
        }
        else if (60 <= score && score <= 69) {
            System.out.println ("D");
        }
        else if (0 <= score && score <=59) { 
            System.out.println ("F");
    }
}
}

