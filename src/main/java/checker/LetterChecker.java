package checker;

public class LetterChecker extends CheckerAbstract{
    public LetterChecker(int maxLength, int maxScore) {
        super(maxLength, maxScore);
    }

    @Override
    public int check(String password) {
        int score = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                score = 1;
                break;
            }
        }
        return score;
    }
}
