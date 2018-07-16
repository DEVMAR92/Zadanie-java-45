import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        Scanner input = new Scanner(System.in);

        System.out.println("Jaki jest wynik mnożenia 3*5?");
        boolean question1Result = mathQuiz.question1(input);
        mathQuiz.questionResult(question1Result);

        System.out.println("Jakie jest pole kwadratu o boku 12?");
        boolean question2Result = mathQuiz.question2(input);
        mathQuiz.questionResult(question2Result);

        System.out.println("Jaki jest pierwiastek liczby 15129?");
        boolean question3Result = mathQuiz.question3(input);
        mathQuiz.questionResult(question3Result);

        int mathQuizResult = mathQuiz.quizResult(question1Result, question2Result, question3Result);
        System.out.println("Udało ci się uzyskac " + mathQuizResult + "/3 punkty");
    }
}
