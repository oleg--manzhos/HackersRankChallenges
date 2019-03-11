package manzhos.me;

public class IfElseChallenge {

    public static String validateInput(int value) {

        if (value > 100 || value < 1) {
            return "Invalid input";
        }

        if (value % 2 == 0 && ((value <= 20) && (value >= 6))) {
            return "Weird";
        }

        if (value % 2 == 0 && (((value <= 5) && (value >= 2)) || (value > 20))){
            return "Not Weird";
        }

        if (value % 2 != 0) {
            return "Weird";
        }
        return null;
    }
}
