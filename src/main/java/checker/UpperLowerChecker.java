package checker;

public class UpperLowerChecker extends CheckerAbstract{
    public UpperLowerChecker(int maxLength, int maxScore) {
        super(maxLength, maxScore);
    }

    @Override
    public int check(String password) {
        boolean containsUpper = false;
        boolean containsLower = false;
        int score;
        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                containsUpper = true;
            } else if (Character.isLowerCase(c)) {
                containsLower = true;
            }

            if (containsLower && containsUpper) {
                break;
            }
        }

        if (containsLower && containsUpper) {
            score = 2;
        } else {
            score = 0;
        }
        return score;
    }
}
