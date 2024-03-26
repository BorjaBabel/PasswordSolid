package checker;

public class NumbersChecker extends CheckerAbstract{
    public NumbersChecker(int maxLength, int maxScore) {
        super(maxLength, maxScore);
    }

    @Override
    public int check(String password) {
        int score = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                score = 1;
                break;
            }
        }
        return score;
    }
}
