import java.util.Scanner;

public class MathQuiz {


    boolean question1(Scanner input) {
        if (input.nextDouble() == 3 * 5)
            return true;
        else return false;
    }

    boolean question2(Scanner input) {
        if (input.nextDouble() == 12 * 12)
            return true;
        else return false;
    }

    boolean question3(Scanner input) {
        if (input.nextDouble() == 123)
            return true;
        else return false;
    }

    int quizResult(boolean question1, boolean question2, boolean question3) {

        int fQ = question1 ? 1 : 0;
        int sQ = question2 ? 1 : 0;
        int tQ = question3 ? 1 : 0;
        return fQ + sQ + tQ;
    }

    void questionResult(boolean question) {
        if (question == true) {
            System.out.println("Poprawna odpowiedź");
        } else System.out.println("Zła odpowiedź");
    }

}





