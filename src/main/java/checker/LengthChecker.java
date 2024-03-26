package checker;

public class LengthChecker extends CheckerAbstract{
    public LengthChecker(int maxLength, int maxScore) {
        super(maxLength, maxScore);
    }

    @Override
    public int check(String password) {
        int length = password.length();
        int score = 0;
        if (length >= 7 && length <= 8) {
            score = 1;
        } else if(length >= 9 && length <= super.getMaxLength()){
            score = 2;
        }
        else if (length > super.getMaxLength()) {
            score = 3;
        }
        return score;
    }
}
