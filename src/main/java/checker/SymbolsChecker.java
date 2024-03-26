package checker;

public class SymbolsChecker extends CheckerAbstract{
    public SymbolsChecker(int maxLength, int maxScore) {
        super(maxLength, maxScore);
    }

    @Override
    public int check(String password) {
        int score = 0;
        if(password.matches(".*\\W.*"))
            score = 2;

        return score;
    }
}
